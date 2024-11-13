package org.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = {"C:\\Users\\sasik\\new-evening\\TestCucmberProject\\src\\test\\resources\\FeatureFile\\first.feature"},
	      glue = {"Stepdefinition"},
	
	  dryRun = false
	      
	    
	
				)

	public class TestRunner {
		// TODO Auto-generated constructor stub
	
}

