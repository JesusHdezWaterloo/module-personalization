package com.jhw.module.util.personalization.core.module;

import com.root101.clean.core.app.modules.AbstractModule;
import com.root101.clean.core.app.modules.DefaultAbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.jhw.module.util.personalization.repo.module.PersonalizationRepoModule;

/**
 * Modulo de licencia-core.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class PersonalizationCoreModule extends DefaultAbstractModule {

    private final Injector inj = Guice.createInjector(new PersonalizationCoreInjectionConfigSwing());

    private static PersonalizationCoreModule INSTANCE;

    public static PersonalizationCoreModule getInstance() {
        if (INSTANCE == null) {
            throw new NullPointerException("El modulo de personalizacion no se ha inicializado");
        }
        return INSTANCE;
    }

    public static PersonalizationCoreModule init() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        INSTANCE = new PersonalizationCoreModule();
        INSTANCE.registerModule(PersonalizationRepoModule.init());
        return getInstance();
    }

    /**
     * Usar init() sin repo por parametro para usar el repo por defecto
     *
     * @param repoModule
     * @return
     * @deprecated
     */
    @Deprecated
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
