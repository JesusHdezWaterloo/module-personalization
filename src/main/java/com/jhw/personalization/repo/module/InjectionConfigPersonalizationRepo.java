package com.jhw.personalization.repo.module;

import com.jhw.personalization.repo.repo_impl.PersonalizationRepoImpl;
import com.google.inject.AbstractModule;
import com.jhw.personalization.core.repo_def.PersonalizationRepo;

/**
 * Configuracion del injection del modulo de licencia-repo.
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class InjectionConfigPersonalizationRepo extends AbstractModule {

    @Override
    protected void configure() {
        bind(PersonalizationRepo.class).to(PersonalizationRepoImpl.class);
    }

}