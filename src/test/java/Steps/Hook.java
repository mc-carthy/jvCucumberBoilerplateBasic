package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitialiseTest() {
//        TODO: Firefox not working properly, fix
//        System.setProperty("webdriver.firefox.marionette", "/Applications/geckodriver");
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette", true);
//        base.driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        base.driver = new ChromeDriver();
        System.out.println("Opening the browser: Chrome");
    }

    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println(scenario.getName() + " failed");
        }
        base.driver.quit();
        System.out.println("Closing the browser: MOCK");
    }
}
