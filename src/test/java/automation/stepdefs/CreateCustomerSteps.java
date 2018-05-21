package automation.stepdefs;

import automation.page.LoginPage;
import automation.page.MainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class CreateCustomerSteps {


    @Given("^open main page$")
    public void openMainPage() {
        LoginPage.openPage();
        LoginPage.enterEmail();
    }


    @And("^enter email and press join now button$")
    public void enterEmailAndPressJoinNowButton() {
        LoginPage.enterEmail();
        LoginPage.enterPassword();
    }

    @Then("^verify that user redirected to main page$")
    public void verifyThatUserRedirectedToMainPage() {
        MainPage.checkHeader();
    }
}
