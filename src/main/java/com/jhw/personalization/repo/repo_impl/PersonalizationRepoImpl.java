package com.jhw.personalization.repo.repo_impl;

import com.clean.core.app.services.Notification;
import com.clean.core.app.services.NotificationsGeneralType;
import com.clean.core.domain.services.Resource;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.jhw.personalization.core.domain.Personalization;
import javax.inject.Inject;
import com.jhw.utils.jackson.JACKSONRepoGeneral;
import com.jhw.personalization.core.repo_def.PersonalizationRepo;
import com.jhw.swing.util.icons.icon_ttf.IconTTF;
import com.jhw.swing.util.icons.icon_ttf.IconTTFJsonDeserializer;
import com.jhw.swing.util.icons.icon_ttf.IconTTFJsonSerializer;
import com.jhw.utils.jackson.JACKSON;
import java.awt.Color;
import java.util.LinkedHashMap;

/**
 * Implementacion de la Interfaz {@code LicenceRepo} para manejar el
 * comportamiento de las definiciones de su interfaz
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class PersonalizationRepoImpl extends JACKSONRepoGeneral<Personalization> implements PersonalizationRepo {

    /**
     * Constructor por defecto, usado para injectar.
     */
    @Inject
    public PersonalizationRepoImpl() {
        super("personalization.json", Personalization.class);

        SimpleModule iconTTF = new SimpleModule("IconTTF Module");
        iconTTF.addSerializer(IconTTF.class, new IconTTFJsonSerializer());
        iconTTF.addDeserializer(IconTTF.class, new IconTTFJsonDeserializer());
        JACKSON.registerModule(iconTTF);

    }

    @Override
    protected void onReadError(Exception e) {
        Notification.showConfirmDialog(NotificationsGeneralType.CONFIRM_INFO,
                Resource.getString("msg.swing_personalization.error.read"));
    }

}
