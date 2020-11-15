package com.jhw.module.util.personalization.core.module;

import com.clean.core.app.modules.AbstractModule;
import com.clean.core.app.modules.DefaultAbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Modulo de licencia-core.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class PersonalizationCoreModule extends DefaultAbstractModule {

    private final Injector inj = Guice.createInjector(new InjectionConfigSwingPersonalizationCore());

    private static PersonalizationCoreModule INSTANCE;

    public static PersonalizationCoreModule getInstance() {
        if (INSTANCE == null) {
            throw new NullPointerException("El modulo de personalizacion no se ha inicializado");
        }
        return INSTANCE;
    }

    public static PersonalizationCoreModule init(AbstractModule repoModule) {
        INSTANCE = new PersonalizationCoreModule();
        INSTANCE.registerModule(repoModule);
        return getInstance();
    }

    @Override
    protected <T> T getOwnImplementation(Class<T> type) {
        return inj.getInstance(type);
    }

    @Override
    public String getModuleName() {
        return "Swing Personalization Module";
    }

}