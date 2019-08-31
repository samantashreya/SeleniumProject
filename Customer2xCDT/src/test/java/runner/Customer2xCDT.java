package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src//test//java//features//Customer.feature"},
glue={"stepdefinition"})
public class Customer2xCDT {

}
