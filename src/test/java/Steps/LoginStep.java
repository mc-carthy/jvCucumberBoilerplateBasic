package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I navigate to login page");
    }

    @When("^I enter the username as admin and password as admin$")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I enter credentials");
    }

    @And("^I click the login button$")
    public void iClickTheLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I click login button");
    }

    @Then("^I should the userform page$")
    public void iShouldTheUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I see userform page");
    }

    @When("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I enter specific credentials, username: " + username + " password: " + password);
    }
}
