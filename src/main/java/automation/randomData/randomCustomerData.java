package automation.randomData;

import org.apache.commons.lang3.RandomStringUtils;
import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Random;

public class randomCustomerData {
    private static DataFactory dataFactory = new DataFactory();
    private static Random r = new Random();


    static public String getEmailAddress() {   //specify lenght of email field
        dataFactory.randomize(r.nextInt());
        return dataFactory.getEmailAddress();
    }

    static public String getPassword() {         
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
        return RandomStringUtils.random(6, characters);
    }
}
