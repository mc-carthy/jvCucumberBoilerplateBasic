package Steps;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class LoginJava8 implements En {
    public LoginJava8() {
        And("^I want to test out lambda expressions$", () -> {
            System.out.println("Lamda Expressions!");
        });
    }
}
