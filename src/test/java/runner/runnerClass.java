package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\akeem\\eclipse-workspace\\commerce\\src\\main\\resources\\features\\work.feature",glue= {"stepdef"},
monochrome = true,
plugin = {"pretty","junit:engage/JunitReports/report.xml",
		"json:engage/JSONReports/report.json",
		"html:engage/report.html"})

public class runnerClass {

}
