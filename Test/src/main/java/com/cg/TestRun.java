/**
 * Program is configured to close web page automatically after 2 seconds of completion
 * of task to let evaluator see the "Alert Box Message"
 * So, kindly don't disturb the process by manually closing the web pages.
 */

package com.cg;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(tags = { "@jobsWorldCheck" })
public class TestRun {
}
