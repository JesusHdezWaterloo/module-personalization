/*
 * Copyright 2021 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.root101.module.util.personalization.services;

import com.root101.clean.core.app.services.ExceptionHandler;
import com.root101.module.util.personalization.core.domain.Personalization;
import com.root101.module.util.personalization.core.module.PersonalizationCoreModule;
import com.root101.module.util.personalization.core.usecase_def.PersonalizableUseCase;
import com.root101.swing.derivable_icons.DerivableIcon;
import com.root101.swing.derivable_icons.IconTTF;
import java.awt.Color;
import java.net.MalformedURLException;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class PersonalizationHandler {

    private static Personalization personalization;

    static {
        try {
            PersonalizationCoreModule.init();
            personalization = PersonalizationCoreModule.getInstance().getImplementation(PersonalizableUseCase.class).read();

            try {
                PersonalizationResourceService.init();
            } catch (MalformedURLException ex) {
                ExceptionHandler.handleException(ex);
            }
        } catch (Exception e) {
            personalization = new Personalization();
        }
    }

    public static Personalization INSTANCE() {
        return personalization;
    }

    public static Object getObject(String key) {
        return personalization.get(key);
    }

    public static <T> T getObject(String key, Class<T> type) {
        return personalization.getType(key, type);
    }

    public static Color getColor(String key) {
        return getObject(key, Color.class);
    }

    public static DerivableIcon getDerivableIcon(String key) {
        return getObject(key, IconTTF.class);
    }

    public static int getInt(String key) {
        return getObject(key, int.class);
    }

    public static boolean getBoolean(String key) {
        return getObject(key, boolean.class);
    }

    public static String getString(String key) {
        return getObject(key, String.class);
    }

    public static void putObject(String key, Object obj) {
        personalization.put(key, obj);
    }

    public static void putObjectIfNotContain(String key, Object obj) {
        if (!personalization.containsKey(key)) {
            putObject(key, obj);
        }
    }
}
