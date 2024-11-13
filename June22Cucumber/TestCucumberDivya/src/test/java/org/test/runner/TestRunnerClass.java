package org.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\feature\\test.feature"}, 
glue= {"stepdefinition"},

dryRun=false,
tags= "@BookingHistoryData"

		)

public class TestRunnerClass {

}
