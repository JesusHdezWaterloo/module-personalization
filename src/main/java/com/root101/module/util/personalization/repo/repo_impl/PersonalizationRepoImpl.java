package com.root101.module.util.personalization.repo.repo_impl;

import com.root101.clean.core.app.services.NotificationHandler;
import com.root101.clean.core.app.services.NotificationsGeneralType;
import com.root101.clean.core.domain.services.ResourceHandler;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.root101.module.util.personalization.core.domain.Personalization;
import javax.inject.Inject;
import com.root101.repo.json.JACKSONRepoGeneral;
import com.root101.module.util.personalization.core.repo_def.PersonalizationRepo;
import com.root101.module.util.personalization.repo.jackson.color.ColorJsonDeserializer;
import com.root101.module.util.personalization.repo.jackson.color.ColorJsonSerializer;
import com.root101.module.util.personalization.repo.jackson.icon_ttf.IconTTFJsonDeserializer;
import com.root101.module.util.personalization.repo.jackson.icon_ttf.IconTTFJsonSerializer;
import com.root101.swing.derivable_icons.IconTTF;
import com.root101.json.jackson.JACKSON;
import java.awt.Color;

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

        SimpleModule colorModule = new SimpleModule("Color Module");
        colorModule.addSerializer(Color.class, new ColorJsonSerializer());
        colorModule.addDeserializer(Color.class, new ColorJsonDeserializer());
        JACKSON.registerModule(colorModule);

        SimpleModule iconTTF = new SimpleModule("IconTTF Module");
        iconTTF.addSerializer(IconTTF.class, new IconTTFJsonSerializer());
        iconTTF.addDeserializer(IconTTF.class, new IconTTFJsonDeserializer());
        JACKSON.registerModule(iconTTF);

    }

    @Override
    protected void onReadError(Exception e) {
        NotificationHandler.showConfirmDialog(NotificationsGeneralType.CONFIRM_INFO,
                ResourceHandler.getString("msg.swing_personalization.error.read"));
    }

}
