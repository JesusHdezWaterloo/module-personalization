package com.jhw.personalization.ui.module;

import com.clean.core.app.services.ExceptionHandler;
import com.clean.swing.app.AbstractSwingApplication;
import com.clean.swing.app.AbstractSwingMainModule;
import com.jhw.personalization.services.PersonalizationHandler;
import com.jhw.personalization.services.PersonalizationResourceService;
import java.net.MalformedURLException;

public class PersonalizationSwingModule implements AbstractSwingMainModule {

    private final PersonalizationModuleNavigator navigator = new PersonalizationModuleNavigator();

    public PersonalizationSwingModule() {
        init();
    }

    private void init() {
        System.out.println("Cargando Personalizaciones Visuales");
        try {
            PersonalizationResourceService.init();
        } catch (MalformedURLException ex) {
            ExceptionHandler.handleException(ex);
        }
        PersonalizationHandler.INSTANCE();//load
    }

    @Override
    public void register(AbstractSwingApplication app) {
    }

    @Override
    public void navigateTo(String string, Object... o) {
        navigator.navigateTo(string, o);
    }

}
