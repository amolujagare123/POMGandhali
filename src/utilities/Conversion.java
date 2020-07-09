package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

    public static String  convertCountry(String country)
    {
        String convertedCountry="";

        switch (country)
        {
            case "IN" : convertedCountry="India"; break;
            case "AD" : convertedCountry="Andorra"; break;
            case "AF" : convertedCountry="Afghanistan"; break;
            case "AL" : convertedCountry="Albania"; break;
            case "DZ" : convertedCountry="Algeria"; break;
            case "AO" : convertedCountry="Angola"; break;
            case "AU" : convertedCountry="Australia"; break;
            case "BD" : convertedCountry="Bangladesh"; break;
            case "BB" : convertedCountry="Barbados"; break;
            case "BR" : convertedCountry="Brazil"; break;



        }



        return  convertedCountry;
    }



    public static String convertGender(String Gender)
    {
        String convertedGender="";

        switch(Gender)
        {
            case "1" : convertedGender="Female"; break;
            case "0" : convertedGender="Male"; break;
            case "2" : convertedGender="Other"; break;

        }
        return convertedGender;
    }

    public static String convertMyDate(String dbDate) throws ParseException {
        String convertedDate ="";

    //    PSD  | FDS

       Date myDate =  new SimpleDateFormat("yyyy-MM-dd").parse(dbDate);

       convertedDate = new SimpleDateFormat("dd/MM/yyyy").format(myDate);

        return convertedDate;
    }
}
