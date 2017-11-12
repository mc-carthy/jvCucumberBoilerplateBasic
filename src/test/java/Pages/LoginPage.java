package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

        public LoginPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }

        @FindBy(how = How.NAME, using = "UserName")
        public WebElement txtUsername;

        @FindBy(how = How.NAME, using = "Password")
        public WebElement txtPassword;

        @FindBy(how = How.NAME, using = "Login")
        public WebElement btnLogin;

        public void EnterCredentials(String username, String password) {
            txtUsername.sendKeys(username);
            txtPassword.sendKeys(password);
        }

        public void ClickLogin() {
            btnLogin.submit();
        }
}
