package Steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class LoginStep {

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        System.out.println("I navigate to login page");
    }

    @When("^I enter the username as admin and password as admin$")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() throws Throwable {
        System.out.println("I enter credentials");
    }

    @And("^I click the login button$")
    public void iClickTheLoginButton() throws Throwable {
        System.out.println("I click login button");
    }

    @Then("^I should the userform page$")
    public void iShouldTheUserformPage() throws Throwable {
        System.out.println("I see userform page");
    }

    @When("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        System.out.println("I enter specific credentials, username: " + username + " password: " + password);
    }

    @When("^I enter the following credentials for login$")
    public void iEnterTheFollowingCredentialsForLogin(DataTable table) throws Throwable {
//        List<List<String>> data = table.raw();
//        System.out.println(data.get(0).get(0));
//        System.out.println(data.get(0).get(1));
//
//        System.out.println(data.get(1).get(0));
//        System.out.println(data.get(1).get(1));

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for (User user: users) {
            System.out.println("The username is " + user.username);
            System.out.println("The password is " + user.password);
        }
    }

    public class User {
        public String username;
        public String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
