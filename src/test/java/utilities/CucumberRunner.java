package utilities;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/cucumber/"},
        glue = {"stepDefinitions"},
        plugin = {"pretty:target/cucumber-reports/cucumber-pretty.txt",
                "html:target/cucumber-reports/raw-cucumber-html-report.html",
                "json:target/report.json"}
)

public class CucumberRunner extends TestRunner {
    private static TestNGCucumberRunner testNGCucumberRunner;

    public CucumberRunner() throws IOException {
        super();
    }

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
    }

    @Test(suiteName = "Suite", description = "Runs Cucumber Parallel Scenarios", dataProvider = "parallelScenarios")
    public void runParallelScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());

//        public Object[][] parallelScenarios() {
//            if (testNGCucumberRunner == null) {
//                testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//            }
//            return testNGCucumberRunner.provideScenarios();
//        }
    }
}
