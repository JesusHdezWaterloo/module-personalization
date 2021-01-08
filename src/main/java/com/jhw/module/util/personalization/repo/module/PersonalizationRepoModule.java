package com.jhw.module.util.personalization.repo.module;

import com.root101.clean.core.app.modules.DefaultAbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Modulo de licencia-core.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class PersonalizationRepoModule extends DefaultAbstractModule {

    private final Injector inj = Guice.createInjector(new PersonalizationRepoInjectionConfig());

    private static PersonalizationRepoModule INSTANCE;

    private PersonalizationRepoModule() {
    }

    public static PersonalizationRepoModule getInstance() {
        if (INSTANCE == null) {
            throw new NullPointerException("El modulo de personalizacion no se ha inicializado");
        }
        return INSTANCE;
    }

    public static PersonalizationRepoModule init() {
        INSTANCE = new PersonalizationRepoModule();
        return getInstance();
    }

    @Override
    protected <T> T getOwnImplementation(Class<T> type) {
        return inj.getInstance(type);
    }

    @Override
    public String getModuleName() {
        return "Swing Personalization Repo Module";
    }

}
