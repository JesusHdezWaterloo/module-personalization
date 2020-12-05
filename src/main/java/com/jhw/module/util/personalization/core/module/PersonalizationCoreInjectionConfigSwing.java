package com.jhw.module.util.personalization.core.module;

import com.google.inject.AbstractModule;
import com.jhw.module.util.personalization.core.usecase_impl.PersonalizationUseCaseImpl;
import com.jhw.module.util.personalization.core.usecase_def.PersonalizableUseCase;

/**
 * Configuracion del injection del modulo de licencia-core.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class PersonalizationCoreInjectionConfigSwing extends AbstractModule {

    @Override
    protected void configure() {
        bind(PersonalizableUseCase.class).to(PersonalizationUseCaseImpl.class)/*.in(Singleton.class)*/;
    }

}
