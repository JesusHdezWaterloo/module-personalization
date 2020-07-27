package com.jhw.personalization.core.usecase_def;

import com.clean.core.app.usecase.ReadWriteUseCase;
import com.jhw.personalization.core.domain.Personalization;

/**
 * Interfaz del caso de uso de la licencia para definir las principales
 * funcionalidades de la licencia
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public interface PersonalizableUseCase extends ReadWriteUseCase<Personalization> {

    public Object getObject(String key) throws Exception;

    public <T> T getObject(String key, Class<T> type) throws Exception;

    public void putObject(String key, Object obj) throws Exception;

}
