package com.capgemini.healthcareEnquiry;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:/BDD701/healthcare/src/test/java/com/capgemini/healthcareEnquiry/health.feature", glue = "com.capgemini.healthcareEnquiry")
public class Runner {

}
