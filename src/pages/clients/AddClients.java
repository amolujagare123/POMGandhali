package pages.clients;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddClients {


        @FindBy(xpath="//input[@id='client_name']")
        WebElement txtClient;

        @FindBy (xpath="//input[@id='client_surname']")
        WebElement txtClientSurname;

        @FindBy (xpath="//input[@id='client_address_1']")
        WebElement txtStreetaddess1;

        @FindBy (xpath="//input[@id='client_address_2']")
        WebElement txtStreetaddess2;

        @FindBy(xpath="//input[@id='client_city']")
        WebElement txtCity;

        @FindBy(xpath="//input[@id='client_state']")
        WebElement txtState;

        @FindBy(xpath="//input[@id='client_zip']")
        WebElement txtZip;

        @FindBy (id="select2-client_country-container")
        WebElement containerCountry;

        @FindBy(xpath="//input[@id='client_phone']")
        WebElement txtPhone;

        @FindBy(xpath="//input[@id='client_fax']")
        WebElement txtFax;

        @FindBy(xpath="//input[@id='client_mobile']")
        WebElement txtMob;

        @FindBy(xpath="//input[@id='client_email']")
        WebElement txtEmail;

        @FindBy(xpath="//input[@id='client_web']")
        WebElement txtWeb;

        @FindBy (id="select2-client_gender-container")
        WebElement containerGender;

        @FindBy(xpath="//input[@id='client_vat_id']")
        WebElement txtVat;

        @FindBy(xpath="//input[@id='client_tax_code']")
        WebElement txtTaxes;

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

    @FindBy (xpath="//input[@name='client_birthdate']")
    WebElement txtBirthdate;

        public void setBirthDate(String setDateStr) throws ParseException {
            txtBirthdate.click();
            // convert String into Date ------>    PSD

            Date setDate = new SimpleDateFormat("dd/MM/yyyy").parse(setDateStr);


            String currDateStr
                    =driver.findElement(By.xpath("//th[@class='datepicker-switch']")).getText();

            System.out.println(currDateStr);
// date in MMMM yyyy


// convert String into Date ------>    PSD

            Date currDate = new SimpleDateFormat("MMMM yyyy").parse(currDateStr);


            int monthDiff = Months.monthsBetween(new DateTime(currDate).withDayOfMonth(1),new DateTime(setDate).withDayOfMonth(1)).getMonths();

            boolean isFuture=true;
            if(monthDiff<0)
            {
                isFuture=false;
                monthDiff=monthDiff*(-1);

            }

            for(int i=0;i<monthDiff;i++)
            {
                if(isFuture)
                    driver.findElement(By.className("next")).click();
                else
                    driver.findElement(By.className("prev")).click();
            }


            String setDateday = new SimpleDateFormat("dd").format(setDate);

           int setDateDayInt = Integer.parseInt(setDateday);

           driver.findElement(By.xpath("//td[contains(text(),'"+setDateDayInt+"' ) and @class='day']")).click();


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
        public void setTxtCity(String City)
        {

            txtCity.sendKeys(City);
        }
        public void setTxtState(String State)
        {

            txtState.sendKeys(State);
        }
        public void setTxtZip(String Zip)
        {

            txtZip.sendKeys(Zip);
        }
        public void setCountry(String Country)
        {
            containerCountry.click();
            txtSearch.sendKeys(Country);
            driver.findElement(By.xpath("//li[text()='"+Country+"']")).click();

        }
        public void setGender(String Gender)
        {
            containerGender.click();
            //txtSearch.sendKeys(Gender);
            driver.findElement(By.xpath("//li[contains(text(),'"+Gender+"')]")).click();

        }
        public void setTxtPhone(String Phone)
        {

            txtPhone.sendKeys(Phone);
        }
        public void setTxtFax(String Fax)
        {

            txtFax.sendKeys(Fax);
        }
        public void setTxtMob(String Mob)
        {

            txtMob.sendKeys(Mob);
        }
        public void setTxtEmail(String Email)
        {

            txtEmail.sendKeys(Email);
        }
        public void setTxtWeb(String Web)
        {

            txtWeb.sendKeys(Web);
        }
        public void setTxtVat(String Vat)
        {

            txtVat.sendKeys(Vat);
        }
        public void setTxtTaxes(String Tax)
        {

            txtTaxes.sendKeys(Tax);
        }
        public void clickSave()
        {
            btnSave.click();
        }
}
