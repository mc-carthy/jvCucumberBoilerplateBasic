package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void InitialiseTest() {
        System.out.println("Opening the browser: MOCK");
    }

    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println(scenario.getName() + " failed");
        }
        System.out.println("Closing the browser: MOCK");
    }
}
