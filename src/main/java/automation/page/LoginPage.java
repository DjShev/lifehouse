package automation.page;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static automation.randomData.randomCustomerData.getEmailAddress;
import static automation.randomData.randomCustomerData.getPassword;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginPage extends Page {
    static String url = "http://staging-prelaunch.life-house.com";
    static SelenideElement emailField = $(By.name("email"));
    static SelenideElement insideButton = $(By.id("index-step-inside"));
    static SelenideElement passwordField = $(By.name("password"));
    static SelenideElement insidePopUPButton = $(By.id("index-sign-up-popup-step-inside"));

    public static void openPage() {
        open(url);
    }

    public static void enterEmail() {
        emailField.setValue(getEmailAddress());
        insideButton.pressEnter();
    }

    public static void enterPassword() {
        passwordField.setValue(getPassword());
        insidePopUPButton.pressEnter();
    }

}
