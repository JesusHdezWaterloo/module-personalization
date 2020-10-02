/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.module.util.personalization.services;

import com.clean.core.app.services.ExceptionHandler;
import com.jhw.module.util.personalization.core.domain.Personalization;
import com.jhw.module.util.personalization.core.module.PersonalizationCoreModule;
import com.jhw.module.util.personalization.core.usecase_def.PersonalizableUseCase;
import com.jhw.module.util.personalization.repo.module.PersonalizationRepoModule;
import com.jhw.swing.derivable_icons.DerivableIcon;
import com.jhw.swing.derivable_icons.IconTTF;
import java.awt.Color;
import java.net.MalformedURLException;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class PersonalizationHandler {

    private static Personalization personalization;

    static {
        try {
            PersonalizationCoreModule.init(PersonalizationRepoModule.init());
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
