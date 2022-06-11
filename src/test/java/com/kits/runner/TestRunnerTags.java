package com.kits.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/TagsDemo.feature", 
glue= {"com.kits.steps"},
tags = {"@smoke or @regression" })
public class TestRunnerTags {

}
