package utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static utility.Constants.PATH_PROPERTY;

public class PropertyUtil {

    public static InputStream resource = null;

    //metodo para cargar el archivo de propiedades en memoria
    public static InputStream getSingleInstance() {
        if(resource == null) {
            return Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream(PATH_PROPERTY);
        }
        return resource;
    }

    //metodo para traer los elementos del archivo de propiedades
    public static String getConfiguration(String property) {
        Properties properties = new Properties();
        String resulPath = null;
        {
            InputStream resource = getSingleInstance();

            try {
                properties.load(resource);
                resulPath = properties.getProperty(property);
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        return resulPath;

    }
}
