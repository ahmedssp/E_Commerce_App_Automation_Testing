package org.example.testrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

  @CucumberOptions
    (
            features = "src/main/resources/featsures_directory",
            glue = "org/example/stepDefinition",
            tags = "@smack",
            plugin = {
                    "pretty",
                    "html:target/cucumber-reports.html"

            }

    )

public class TestRunner extends AbstractTestNGCucumberTests {

}
