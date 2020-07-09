package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
/*
 WebDriver driver;
 WebElement element =
         driver.findElement(By.id("email"));
*/
         @FindBy (id="email")
         public WebElement txtEmail;

         @FindBy (id="password")
         public WebElement txtPassword;

         @FindBy (xpath="//button[@type='submit']")
         public WebElement btnLogin;

         @FindBy (xpath="//a")
         public WebElement lnkForgotPassword;

         public  void  clickForgotpassword()
         {
             lnkForgotPassword.click();
         }

         public Login(WebDriver driver)
         {
             PageFactory.initElements(driver,this);
         }

         public void setTxtEmail(String email)
         {
             txtEmail.sendKeys(email);
         }

         public void setTxtPassword(String password)
         {
             txtPassword.sendKeys(password);
         }


         public void clickBtnLogin()
         {
             btnLogin.click();
         }




}
