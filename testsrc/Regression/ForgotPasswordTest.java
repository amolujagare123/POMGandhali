package Regression;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.Login;
import util.OpenUrl;
import utilities.Drivers;

import java.io.IOException;

import static utilities.Drivers.getDriver;
import static utilities.GetPropertiesvalues.getUrl;

public class ForgotPasswordTest extends OpenUrl {


    @Test
    public void forgotPasswordtest() throws IOException {

        Login login = new Login(driver);

        login.clickForgotpassword();

        ForgotPassword forgotPassword = new ForgotPassword(driver);
        forgotPassword.setTxtEmail("amol@gmail.com");
        forgotPassword.clickSubmit();


    }

}
