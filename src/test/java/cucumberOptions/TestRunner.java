package cucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinitions")
public class TestRunner {

}
