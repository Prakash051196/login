package practice5;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature5"
		,glue= {"step_defination5"}
		)

public class Testpractice5 {

}
