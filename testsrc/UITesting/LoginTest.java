package UITesting;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenUrl;


/*
1. availability of elements
2. enability / disability
3. watermark
4. spellings
5. button / text  -  color
6. text font

 */

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
