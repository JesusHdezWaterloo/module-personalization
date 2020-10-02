package com.jhw.module.util.personalization.core.usecase_impl;

import com.clean.core.app.usecase.DefaultReadWriteUseCase;
import com.jhw.module.util.personalization.core.domain.Personalization;
import com.jhw.module.util.personalization.core.module.PersonalizationCoreModule;
import javax.inject.Inject;
import com.jhw.module.util.personalization.core.repo_def.PersonalizationRepo;
import com.jhw.module.util.personalization.core.usecase_def.PersonalizableUseCase;
import com.jhw.module.util.personalization.services.PersonalizationHandler;

/**
 * 
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class PersonalizationUseCaseImpl extends DefaultReadWriteUseCase<Personalization> implements PersonalizableUseCase {

    /**
     * Instancia del repo para almacenar las cosas en memoria
     */
    private final PersonalizationRepo repo = PersonalizationCoreModule.getInstance().getImplementation(PersonalizationRepo.class);

    /**
     * Constructor por defecto, usado par injectar.
     */
    @Inject
    public PersonalizationUseCaseImpl() {
        super.setRepo(repo);
    }

    @Override
    public Object getObject(String key) throws Exception {
        return super.read().get(key);
    }

    @Override
    public void putObject(String key, Object obj) throws Exception {
        super.read().put(key, obj);
    }

    @Override
    public <T> T getObject(String key, Class<T> type) throws Exception {
        return super.read().getType(key, type);
    }

    @Override
    public void autoSave() throws Exception {
        write(PersonalizationHandler.INSTANCE());
    }

}
