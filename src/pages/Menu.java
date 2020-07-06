package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {

    @FindBy(xpath="//a[@class='hidden-md']")
    WebElement lnkDashBoard;

    @FindBy (xpath="//span[contains(text(),'Clients')]")
    WebElement lnkClients;

    @FindBy (xpath="//a[contains(text(),'Add Client')]")
    WebElement lnkAddClient;

    @FindBy (xpath="//a[contains(text(),'View Clients')]")
    WebElement lnkViewClient;

    public Menu(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }



    public void clickDahboard()
    {
        lnkDashBoard.click();
    }


    public void clickAddClient()
    {
        lnkClients.click();
        lnkAddClient.click();
    }


    public void clickViewClient()
    {
        lnkClients.click();
        lnkViewClient.click();
    }

}
