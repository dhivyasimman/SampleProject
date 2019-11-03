package com.expleo.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:Data.feature"
        ,glue= "com.expleo.cucumber.def"
        )



public class runner {

}
