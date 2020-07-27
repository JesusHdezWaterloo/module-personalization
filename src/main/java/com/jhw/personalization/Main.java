/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.personalization;

import com.jhw.personalization.core.domain.Personalization;
import com.jhw.personalization.core.module.PersonalizationCoreModule;
import com.jhw.personalization.repo.module.PersonalizationRepoModule;
import com.jhw.personalization.core.repo_def.PersonalizationRepo;
import com.jhw.personalization.core.usecase_def.PersonalizableUseCase;
import com.jhw.swing.material.standars.MaterialColors;
import com.jhw.utils.jackson.JACKSON;
import java.awt.Color;
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
        //HashMap<String, Object> map = new HashMap<>();
        //map.put("color", MaterialColors.AMBER_600);
        //JACKSON.write(new File("123.json"), map);
        //HashMap read = JACKSON.read(new File("123.json"), JACKSON.getTypeFactory().constructMapType(HashMap.class, String.class, Color.class));
        HashMap read = JACKSON.read(new File("123.json"), HashMap.class);
        System.out.println(read.get("color"));

        //Color a = MaterialColors.AMBER_600;
        //JACKSON.write(new File("123.json"), a);
    }

}
