package automation.page;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static automation.randomData.randomCustomerData.getEmailAddress;
import static automation.randomData.randomCustomerData.getPassword;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginPage extends Page {
    static String url = "http://staging-prelaunch.life-house.com"; // url address should be move to environment.properties 
    static SelenideElement emailField = $(By.name("email"));
    static SelenideElement insideButton = $(By.id("index-step-inside")); // no need by.id - need to wrire #index-step-inside
    static SelenideElement passwordField = $(By.name("password"));
    static SelenideElement insidePopUPButton = $(By.id("index-sign-up-popup-step-inside")); //no need by.id

    public static void openPage() { //should be commone method
        open(url);
    }

    public static void enterEmail() {   //name should be change to EnterEmail and press enter or make separete method
        emailField.setValue(getEmailAddress());
        insideButton.pressEnter();
    }

    public static void enterPassword() {     //name should be change to enterPassword and press enter or make separete method
        passwordField.setValue(getPassword());
        insidePopUPButton.pressEnter();
    }

}
