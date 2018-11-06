package automation.stepdefs;

import automation.page.LoginPage;
import automation.page.MainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class CreateCustomerSteps {


    @Given("^open main page$")
    public void openMainPage() {  //change to login page )
        LoginPage.openPage();
        LoginPage.enterEmail();  //delete this line (it duplaceted )
    }


    @And("^enter email and press join now button$") // change to @When
    public void enterEmailAndPressJoinNowButton() {
        LoginPage.enterEmail();
        LoginPage.enterPassword();     /// where is method press button ? :))
    }

    @Then("^verify that user redirected to main page$")
    public void verifyThatUserRedirectedToMainPage() {
        MainPage.checkHeader();
    }
}
