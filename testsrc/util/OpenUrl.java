package util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.Drivers;

import java.io.IOException;

import static utilities.Drivers.getDriver;
import static utilities.GetPropertiesvalues.getUrl;

public class OpenUrl {

    protected  WebDriver driver ;

     @BeforeClass
     public void openUrl() throws IOException {
        driver = getDriver(Drivers.DriverTypes.CHROME);
        driver.get(getUrl());
     }
}
