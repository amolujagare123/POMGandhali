package util;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.Login;

import java.io.IOException;

import static utilities.GetPropertiesvalues.getPassword;
import static utilities.GetPropertiesvalues.getUsername;

public class DoLogin extends OpenUrl{

    @BeforeClass
    public void doLogin() throws IOException {
        Login login = new Login(driver);
        login.setTxtEmail(getUsername());
        login.setTxtPassword(getPassword());
        login.clickBtnLogin();

    }


}
