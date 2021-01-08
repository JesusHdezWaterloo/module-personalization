/*
 * Copyright 2021 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.root101.module.util.personalization.core.usecase_impl;

import com.root101.clean.core.app.usecase.DefaultReadWriteUseCase;
import com.root101.module.util.personalization.core.domain.Personalization;
import com.root101.module.util.personalization.core.module.PersonalizationCoreModule;
import javax.inject.Inject;
import com.root101.module.util.personalization.core.repo_def.PersonalizationRepo;
import com.root101.module.util.personalization.core.usecase_def.PersonalizableUseCase;
import com.root101.module.util.personalization.services.PersonalizationHandler;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
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
