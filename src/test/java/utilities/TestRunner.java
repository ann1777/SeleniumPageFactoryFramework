package utilities;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

@CucumberOptions(
        monochrome = true,
        tags = "@Candidate",
        features = "src/test/java/cucumber/features",
        glue = "cucumber.steps",
        publish = true
)
public class TestRunner extends BaseTest {
    private TestNGCucumberRunner testNGCucumberRunner;

    public TestRunner(WebDriver driver) {
        super(driver);
    }

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(BaseTest.class);
    }

    @Test(groups = "cucumber", description = "Run Cucumber Features", dataProvider = "parallelScenarios")
    public void runParallelScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }
    @DataProvider (parallel = true)
    public Object[][] parallelScenarios() {
        if (testNGCucumberRunner == null) {
            testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        }
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
    }
}