package com.jhw.personalization.core.module;

import com.google.inject.AbstractModule;
import com.jhw.personalization.core.usecase_impl.PersonalizationUseCaseImpl;
import com.jhw.personalization.core.usecase_def.PersonalizableUseCase;

/**
 * Configuracion del injection del modulo de licencia-core.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class InjectionConfigSwingPersonalizationCore extends AbstractModule {

    @Override
    protected void configure() {
        bind(PersonalizableUseCase.class).to(PersonalizationUseCaseImpl.class)/*.in(Singleton.class)*/;
    }

}
