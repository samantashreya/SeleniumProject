package com.capgemini.vrs.client;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = { "com.capgemini.vrs.stepdefinition" })
public class VehicleTest {

}
