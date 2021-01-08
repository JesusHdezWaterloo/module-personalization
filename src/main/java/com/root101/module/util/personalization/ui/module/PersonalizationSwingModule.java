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
package com.root101.module.util.personalization.ui.module;

import com.root101.module.util.personalization.core.module.PersonalizationCoreModule;
import com.root101.module.util.personalization.core.usecase_def.PersonalizableUseCase;
import com.root101.module.util.personalization.services.PersonalizationHandler;
import com.root101.clean.core.app.services.ExceptionHandler;
import com.root101.clean.swing.app.DefaultAbstractSwingMainModule;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
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
