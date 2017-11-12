package Steps;

import Base.BaseUtil;
import Pages.LoginPage;
import Transformation.EmailTransform;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import sun.rmi.runtime.Log;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil{

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        base.driver.navigate().to("http://executeautomation.com/demosite/Login.html");
        System.out.println("I navigate to login page");
    }

    @When("^I enter the username as admin and password as admin$")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() throws Throwable {
        LoginPage page = new LoginPage(base.driver);
        page.EnterCredentials("admin", "adminPassword");
    }

    @And("^I click the login button$")
    public void iClickTheLoginButton() throws Throwable {
        LoginPage page = new LoginPage(base.driver);
        page.ClickLogin();
    }

    @Then("^I should see the userform page$")
    public void iShouldTheUserformPage() throws Throwable {
        Assert.assertTrue(base.driver.findElement(By.id("Initial")).isDisplayed());
    }

    @When("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        System.out.println("I enter specific credentials, username: " + username + " password: " + password);
    }

    @When("^I enter the following credentials for login$")
    public void iEnterTheFollowingCredentialsForLogin(DataTable table) throws Throwable {

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for (User user: users) {
            System.out.println("The username is " + user.username);
            System.out.println("The password is " + user.password);
        }
    }

    @And("^I enter the email as Email:([^\"]*)$")
    public void iEnterTheEmailAsEmailAdmin(@Transform(EmailTransform.class) String email) throws Throwable {
        System.out.println("The Email address is " + email);
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
