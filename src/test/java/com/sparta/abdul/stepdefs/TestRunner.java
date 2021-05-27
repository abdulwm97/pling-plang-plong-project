package com.sparta.abdul.stepdefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/resources"},
        plugin = {"rerun","html:target/testReport.html"}
)
public class TestRunner {}
