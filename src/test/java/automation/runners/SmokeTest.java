package automation.runners;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/cucumber-report/smoketest", "json:target/cucumber.json"},
        features = "src/test/java/resources/feature",
        glue = "automation/stepdefs",
        tags = "@smoketest")

public class SmokeTest {

    @BeforeClass
    static public void setupTimeout() {
        Configuration.timeout = 10000;   // move this parameter to config file
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");  //take this parameters from environment.properties
        Configuration.browser = "chrome";   //take this parameters from environment.properties
    }
}
