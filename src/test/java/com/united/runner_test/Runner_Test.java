package com.united.runner_test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            plugin = {"html:target/cucumber-reports/report.html"},
            features = {"src/test/resources/features"},
            glue = {"com/united"},
            tags = "@testing",
            dryRun = false,
            publish = true

    )
    public class Runner_Test extends AbstractTestNGCucumberTests {

    }
