/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.module.util.personalization;

import com.jhw.module.util.personalization.core.domain.Personalization;
import com.jhw.module.util.personalization.services.PersonalizationHandler;
import com.jhw.module.util.personalization.ui.module.PersonalizationSwingModule;
import com.jhw.utils.jackson.JACKSON;
import java.io.File;
import java.util.HashMap;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        PersonalizationSwingModule.init();
        PersonalizationHandler.getColor(Personalization.KEY_COLOR_SHADOW_OFF);
    }

}
