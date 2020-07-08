package DBTesting.clients;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Menu;
import pages.clients.AddClients;
import util.DoLogin;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;

public class AddClientTest extends DoLogin {

    @Test(dataProvider="getData")
    public void addClienttest(String name,String surname,String add1,String add2,String language,String city,String state,String zip
            ,String country,String phone,String fax,String mobile,String email,String web,String gender
            ,String birthDate,String vat,String taxes) throws ParseException, ClassNotFoundException, SQLException {

        ArrayList<String> expected = new ArrayList<>();

        expected.add(name);
        expected.add(surname);
        expected.add(add1);



        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClients addClients = new AddClients(driver);

        addClients.setTxtClient(name);
        addClients.setTxtClientSurname(surname);
        addClients.setTxtStreetaddess1(add1);
        addClients.setTxtStreetaddess2(add2);
        addClients.setlanguage(language);
        addClients.setTxtCity(city);
        addClients.setTxtState(state);
        addClients.setTxtZip(zip);
        addClients.setCountry(country);
        addClients.setTxtPhone(phone);
        addClients.setTxtFax(fax);
        addClients.setTxtMob(mobile);
        addClients.setTxtEmail(email);
        addClients.setTxtWeb(web);
        addClients.setGender(gender);
        addClients.setBirthDate(birthDate);
        addClients.setTxtVat(vat);
        addClients.setTxtTaxes(taxes);
        addClients.clickSave();

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url ="jdbc:mysql://localhost:3306/inoiveplane";
        String username="root";
        String password="root";
        Connection con = DriverManager.getConnection(url,username,password);

        Statement st = con.createStatement();

        String sql = "select * from ip_clients where client_name='"+name+"'";

        ResultSet rs = st.executeQuery(sql);

        ArrayList<String> actual = new ArrayList<>();

        while(rs.next())
        {
            actual.add(rs.getString("client_name"));
            actual.add(rs.getString("client_surname"));
            actual.add(rs.getString("client_address_1"));
        }



   Assert.assertEquals(actual,expected);

        // date selection : https://www.youtube.com/watch?v=yW1-IbI_soc
    }


    @DataProvider
    public Object[][] getData() throws IOException {
        FileInputStream fp = new FileInputStream("Data\\myData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fp);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount-1][18];

        for(int i =0; i<rowCount-1;i++)
        {
            // XSSFRow row = sheet.getRow(i+1);

            for(int j=0;j<18;j++)
            {
                // XSSFCell cell =  sheet.getRow(i+1).getCell(j);
                data[i][j] = sheet.getRow(i+1).getCell(j).toString().trim();
            }
        }
        return  data;
    }

}
