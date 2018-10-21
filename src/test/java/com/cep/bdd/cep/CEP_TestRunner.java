package com.cep.bdd.cep;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "com.cep.bdd.cep.steps",
		plugin = {"html:build/reports", "json:build/reports/cucumber.json"}
		)
public class CEP_TestRunner {
}
