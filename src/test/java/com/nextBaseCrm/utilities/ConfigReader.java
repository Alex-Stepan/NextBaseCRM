package com.nextBaseCrm.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    /** 1. Create obj for the Static Block */
    private static Properties properties = new Properties();


    /** 2. Static Block, for catching exceptions */
    static {
        try {
            FileInputStream fileIn = new FileInputStream("config.properties");
            properties.load(fileIn);
            fileIn.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /** 3. to get the value from properties */
    public static String getProperty(String key){
        return properties.getProperty(key);
    }


}
