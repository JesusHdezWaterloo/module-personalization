package com.jhw.personalization.ui.module;

import com.clean.core.app.services.ExceptionHandler;
import com.clean.swing.app.DefaultAbstractSwingMainModule;
import com.jhw.personalization.services.PersonalizationHandler;
import com.jhw.personalization.services.PersonalizationResourceService;
import java.net.MalformedURLException;

public class PersonalizationSwingModule extends DefaultAbstractSwingMainModule {

    private PersonalizationSwingModule() {
    }

    public static PersonalizationSwingModule init() {
        System.out.println("Cargando Personalizaciones Visuales");
        try {
            PersonalizationResourceService.init();
        } catch (MalformedURLException ex) {
            ExceptionHandler.handleException(ex);
        }
        PersonalizationHandler.INSTANCE();//load
        return new PersonalizationSwingModule();
    }

}
