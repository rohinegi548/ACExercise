package com.api.runner;

import org.apache.log4j.Logger;

import com.api.resources.ApiLogger;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/com/api/features", glue = { "com.api.stepdefinitions" }, plugin = { "pretty",
		"html:reports/cucumber-pretty-report", "json:reports/cucumber-json-report/cucumber_test.json" },
		// tags = {"@anyTag"}, //just for demonstration
		monochrome = true, dryRun = false, strict = true)

public class TestRunner extends AbstractTestNGCucumberTests {

	Logger log = ApiLogger.getLogger(TestRunner.class);

}
