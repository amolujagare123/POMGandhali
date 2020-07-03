package Regression;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.Login;
import utilities.Drivers;

import java.io.IOException;

import static utilities.Drivers.getDriver;
import static utilities.GetPropertiesvalues.getUrl;

public class ForgotPasswordTest {

    WebDriver driver = getDriver(Drivers.DriverTypes.CHROME);

    @Test
    public void forgotPasswordtest() throws IOException {

        driver.get(getUrl());

        Login login = new Login(driver);

        login.clickForgotpassword();


        ForgotPassword forgotPassword = new ForgotPassword(driver);
        forgotPassword.setTxtEmail("amol@gmail.com");
        forgotPassword.clickSubmit();


    }

}
