package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features = "C:\\Users\\aancy.p\\Downloads\\CompareIphonePrice (1)\\CompareIphonePrice\\src\\test\\resources\\Feature\\suggestion.feature",
                  glue = "org.suggestioncount",
                  monochrome = true,
                  plugin = {"pretty","html:target/cucumber-reports/report.html"}
                  )
public class TestRunner {

}
