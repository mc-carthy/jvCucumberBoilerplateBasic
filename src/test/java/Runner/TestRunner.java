package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

// JUnit
//@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src/test/java/features"}, glue = {"Steps"})
//public class TestRunner {
//}

// TestNG
@CucumberOptions(features = {"src/test/java/features"}, glue = {"Steps"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
