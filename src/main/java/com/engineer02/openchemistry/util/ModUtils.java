package com.engineer02.openchemistry.util;

import java.io.File;
import java.io.FileWriter;
public class ModUtils {
    public static String[] itemnames = {"hydrogen","helium","lithium","beryllium","boron","carbon","nitrogen","oxygen","fluorine","neon","sodium","magnesium","aluminium","silicon","phosphorus","sulfur","chlorine","argon"};
    public static String[] en_usNames = {"Hydrogen","Helium","Lithium","Beryllium","Boron","Carbon","Nitrogen","Oxygen","Fluorine","Neon","Sodium","Magnesium","Aluminium","Silicon","Phosphorus","Sulfur","Chlorine","Argon"};
    public static String path = "C:\\Users\\bernh\\Desktop\\Minecraft Modding\\Forge\\OpenChemistry\\OpenChemistry forge 1.18.2\\src\\main\\resources\\assets\\openchemistry\\";


    /**
     * creates a basic model JSON for every String provided. Currently gives every Item the redflask Texture.
     * @param names
     */
    public static void createItemModels(String[] names) {
        try {
            for(int i = 0; i < names.length; i++){
                File OldFile = new File(path + "models\\item\\" + names[i] + ".json");
                OldFile.delete();
                File NewFile = new File(path + "models\\item\\" + names[i] + ".json");
                NewFile.createNewFile();
                FileWriter writer = new FileWriter(NewFile);
                writer.write("{\n  \"parent\": \"item/generated\",\n  \"textures\": {\n    \"layer0\": \"openchemistry:item/redflask\"\n  }\n}");
                writer.close();
            }
        }catch (Exception e){}
    }

    /**
     * recreates the lang file en_us. Currently only adds Items dynamically. Everything else is hardcoded.
     * @param itemnames
     * @param itemtranslations
     */
    public static void writeLangFile(String[] itemnames, String[] itemtranslations){
        try {
            File OldFile = new File(path + "lang\\en_us.json");
            OldFile.delete();
            File NewFile = new File(path + "lang\\en_us.json");
            NewFile.createNewFile();
            FileWriter writer = new FileWriter(NewFile);
            StringBuilder sb = new StringBuilder();
            sb.append("{\n");
            sb.append(" \"item.openchemistry.testitem\": \"Test Item\",\n" +
                    " \"item.openchemistry.redflask\": \"Red Flask\"");
            for(int i = 0; i < itemnames.length; i++){
                sb.append(",\n \"item.openchemistry." + itemnames[i] + "\": \"" + itemtranslations[i] + "\"");
            }
            sb.append(",\n \"block.openchemistry.test_block\": \"Test Block\",\n" +
                    " \"itemGroup.openchemistrytab\": \"Open Chemistry\"\n" +
                    "}");
            writer.write(sb.toString());
            writer.close();
        }catch (Exception e){}
    }


}
