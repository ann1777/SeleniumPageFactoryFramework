import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.tagexpressions.TagExpressionParser;
import org.apache.commons.lang3.StringUtils;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;
import utilities.CucumberRunner;
import java.util.List;
import java.util.stream.Collectors;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("steps")
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.cucumber.parallel_demo"},
        monochrome = true,
		publish = true,
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunCucumberTest{
    public static CucumberRunner parseFromTagFilters(List<String> stringList) {
          String combinedExpression = stringList.isEmpty() ? "" : stringList.stream()
                  .filter(StringUtils::isNotEmpty)
                  .map(tagExpression -> tagExpression.replace("~", "not "))
                  .collect(Collectors.joining(") and (", "(", ")"));
          return (CucumberRunner) new TagExpressionParser().parse(combinedExpression);
      }
}
