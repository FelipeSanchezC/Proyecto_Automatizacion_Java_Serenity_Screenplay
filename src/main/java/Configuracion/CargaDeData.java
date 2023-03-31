package Configuracion;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CargaDeData {

    public static final String CARGUE_DATA = "data.properties";
    public static final Properties properties = new Properties();


    static {
        try {
            InputStream inputStream = CargaDeData.class.getClassLoader().getResourceAsStream(CARGUE_DATA);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key){
        return properties.getProperty(key);
    }

}
