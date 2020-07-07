package Regression.clients;

import org.testng.annotations.Test;
import pages.Menu;
import pages.clients.AddClients;
import util.DoLogin;

import java.text.ParseException;

public class AddClientTest extends DoLogin {


    @Test
    public void addClienttest() throws ParseException {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClients addClients = new AddClients(driver);

        /*addClients.setTxtClient("amol");
        addClients.setTxtClientSurname("Ujagare");
        addClients.setTxtStreetaddess1("Katraj");
        addClients.setTxtStreetaddess2("pune");
        addClients.setlanguage("Thai");
        addClients.setTxtCity("Pune");
        addClients.setTxtState("Maharastra");
        addClients.setTxtZip("411046");
        addClients.setCountry("India");
        addClients.setTxtPhone("12345678");
        addClients.setTxtFax("2222");
        addClients.setTxtMob("7709492480");
        addClients.setTxtEmail("bhorgandhali@gmail.com");
        addClients.setTxtWeb("https://vritti.ekatm.com/");
        addClients.setGender("Female");
        addClients.setTxtVat("V123");
        addClients.setTxtTaxes("40000");
*/

        addClients.setBirthDate("28/02/2019");

       // addClients.clickSave();


        // date selection : https://www.youtube.com/watch?v=yW1-IbI_soc
    }
}
