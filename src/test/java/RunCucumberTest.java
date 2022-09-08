import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("steps")
@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/resources/features"}, glue= {"com.cucumber.parallel_demo"})
public class RunCucumberTest {

}
