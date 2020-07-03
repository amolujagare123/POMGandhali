package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetPropertiesvalues {


    static Properties getPropertyObject() throws IOException {

        //1. read the file
        FileInputStream fp = new FileInputStream("Resources\\invoice.properties");

       // 2. create the object of properties file
        Properties prop = new Properties();

       // 3. load the file
        prop.load(fp);

          return  prop;
    }



     public static String getUrl() throws IOException {


        Properties prop =  getPropertyObject();

        return  prop.getProperty("url");

     //    return getPropertyObject().getProperty("url");
     }


    public static String getUsername() throws IOException {

        return getPropertyObject().getProperty("user");
    }

    public static String getPassword() throws IOException {

        return getPropertyObject().getProperty("password");
    }



}
