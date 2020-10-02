package com.jhw.module.util.personalization.ui.module;

import com.clean.core.app.services.ExceptionHandler;
import com.clean.swing.app.DefaultAbstractSwingMainModule;
import com.jhw.module.util.personalization.core.module.PersonalizationCoreModule;
import com.jhw.module.util.personalization.core.usecase_def.PersonalizableUseCase;
import com.jhw.module.util.personalization.services.PersonalizationHandler;

public class PersonalizationSwingModule extends DefaultAbstractSwingMainModule {

    private PersonalizationSwingModule() {
    }

    public static PersonalizationSwingModule init() {
        System.out.println("Cargando Personalizaciones Visuales");
        PersonalizationHandler.INSTANCE();//load
        return new PersonalizationSwingModule();
    }

    @Override
    public void closeModule() {
        try {
            PersonalizationCoreModule.getInstance().getImplementation(PersonalizableUseCase.class).autoSave();
        } catch (Exception e) {
            ExceptionHandler.handleException(e);
        }
    }

}
