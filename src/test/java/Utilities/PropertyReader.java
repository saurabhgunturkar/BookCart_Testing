package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
    public static Properties properties;

    public static Properties loadProperties() {
        String configFilePath = ".\\config\\testconfig.properties";
        try {
            FileInputStream file = new FileInputStream(configFilePath);
            properties = new Properties();
            properties.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return properties;
    }

    public static String getProperty(String key) {
        return loadProperties().getProperty(key);
    }
}