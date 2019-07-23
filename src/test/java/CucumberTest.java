import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\My data\\study\\Cucumber\\cucumber-archetype\\src\\main\\java\\resourses\\features",
        monochrome = true,
        tags = "@TestScenario",
        glue={"steps"}
)

public class CucumberTest extends AbstractTestNGCucumberTests {
}
