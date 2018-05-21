package automation.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends Page {

    static SelenideElement headerText = $(By.cssSelector(".share__holder h1"));

    public static void checkHeader() {
        headerText.should(Condition.text("Friends\nWith Benefits"));
    }
}
