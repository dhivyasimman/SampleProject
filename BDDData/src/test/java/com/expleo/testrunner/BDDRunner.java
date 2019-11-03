package com.expleo.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:BDD Feature\\Webapplication.feature"
        ,glue= "com.expleo.Definition"
        )


public class BDDRunner {

}
