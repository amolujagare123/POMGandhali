package Regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenUrl;
import utilities.Drivers;

import java.io.IOException;

import static utilities.Drivers.getDriver;
import static utilities.GetPropertiesvalues.*;


public class LoginTest   extends OpenUrl {



    @Test
    public void logintest() throws IOException {
        Login login = new Login(driver);
        login.setTxtEmail(getUsername());
        login.setTxtPassword(getPassword());
        login.clickBtnLogin();


    }

}
