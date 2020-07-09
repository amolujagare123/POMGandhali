package UITesting;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenUrl;

public class LoginTest extends OpenUrl {

    Login login;

    @BeforeClass
    public void initLoginObject()
    {
        login = new Login(driver);
    }

    @Test
    public void checkTxtUsernameVisibility()
    {
        boolean expected = true;
        boolean actual = true;
        try {
            actual = login.txtEmail.isDisplayed();
        }
        catch (Exception e)
        {
            actual = false;
        }

        Assert.assertEquals(actual,expected,"username textbox is absent");
    }

    @Test
    public void checkTxtUsernameEnability()
    {
        boolean expected = true;
        boolean actual = true;
        try {
            actual = login.txtEmail.isEnabled();
        }
        catch (Exception e)
        {
            actual = false;
        }

        Assert.assertEquals(actual,expected,"username textbox is disabled");
    }

}
