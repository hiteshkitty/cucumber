package com.kits.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/hookdemo/HookDemo.feature", 
glue= {"com.kits.steps"},
monochrome = true
,plugin = {"json:target/cucumber.json", "html:target/HtmlReports"})
public class TestRunnerForHook {

}
