package pages.clients;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClients {


    @FindBy(xpath="//input[@id='client_name']")
    WebElement txtClient;

    @FindBy (xpath="//input[@id='client_surname']")
    WebElement txtClientSurname;

    @FindBy (xpath="//input[@id='client_address_1']")
    WebElement txtStreetaddess1;

    @FindBy (xpath="//input[@id='client_address_2']")
    WebElement txtStreetaddess2;

    @FindBy (xpath="//button[@name='btn_submit']")
    WebElement btnSave;


    @FindBy (id="select2-client_language-container")
    WebElement containerLanguage;

    @FindBy (xpath = "//input[@type='search']")
    WebElement txtSearch;

    WebDriver driver;

    public void setlanguage(String language)
    {
        containerLanguage.click();
        txtSearch.sendKeys(language);
        driver.findElement(By.xpath("//li[contains(text(),'"+language+"')]")).click();

    }


    public AddClients(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void setTxtClient(String clientname)
    {
        txtClient.sendKeys(clientname);
    }

    public void setTxtClientSurname(String surname)
    {
        txtClientSurname.sendKeys(surname);
    }

    public void setTxtStreetaddess1(String address1)
    {
        txtStreetaddess1.sendKeys(address1);
    }

    public void setTxtStreetaddess2(String address2)
    {
        txtStreetaddess2.sendKeys(address2);
    }

    public void clickSave()
    {
        btnSave.click();
    }
}
