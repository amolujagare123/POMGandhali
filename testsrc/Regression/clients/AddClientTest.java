package Regression.clients;

import org.testng.annotations.Test;
import pages.Menu;
import pages.clients.AddClients;
import util.DoLogin;

public class AddClientTest extends DoLogin {


    @Test
    public void addClienttest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClients addClients = new AddClients(driver);

        /*addClients.setTxtClient("amol");
        addClients.setTxtClientSurname("Ujagare");
        addClients.setTxtStreetaddess1("Katraj");
        addClients.setTxtStreetaddess2("pune");
        addClients.clickSave();*/

        addClients.setlanguage("Thai");
    }
}
