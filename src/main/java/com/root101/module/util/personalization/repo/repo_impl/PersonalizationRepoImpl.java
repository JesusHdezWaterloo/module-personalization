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
package com.root101.module.util.personalization.repo.repo_impl;

import com.root101.clean.core.app.services.NotificationHandler;
import com.root101.clean.core.app.services.NotificationsGeneralType;
import com.root101.clean.core.domain.services.ResourceHandler;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.root101.module.util.personalization.core.domain.Personalization;

import com.root101.repo.json.JACKSONRepoGeneral;
import com.root101.module.util.personalization.core.repo_def.PersonalizationRepo;
import com.root101.module.util.personalization.repo.jackson.color.ColorJsonDeserializer;
import com.root101.module.util.personalization.repo.jackson.color.ColorJsonSerializer;
import com.root101.module.util.personalization.repo.jackson.icon_ttf.IconTTFJsonDeserializer;
import com.root101.module.util.personalization.repo.jackson.icon_ttf.IconTTFJsonSerializer;
import com.root101.swing.derivable_icons.IconTTF;
import com.root101.json.jackson.JACKSON;
import java.awt.Color;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class PersonalizationRepoImpl extends JACKSONRepoGeneral<Personalization> implements PersonalizationRepo {

    /**
     * Constructor por defecto, usado para injectar.
     */
    public PersonalizationRepoImpl() {
        super("personalization.json", Personalization.class);

        SimpleModule colorModule = new SimpleModule("Color Module");
        colorModule.addSerializer(Color.class, new ColorJsonSerializer());
        colorModule.addDeserializer(Color.class, new ColorJsonDeserializer());
        JACKSON.registerModule(colorModule);

        SimpleModule iconTTF = new SimpleModule("IconTTF Module");
        iconTTF.addSerializer(IconTTF.class, new IconTTFJsonSerializer());
        iconTTF.addDeserializer(IconTTF.class, new IconTTFJsonDeserializer());
        JACKSON.registerModule(iconTTF);

    }

    @Override
    protected void onReadError(Exception e) {
        NotificationHandler.showConfirmDialog(NotificationsGeneralType.CONFIRM_INFO,
                ResourceHandler.getString("msg.swing_personalization.error.read"));
    }

}
