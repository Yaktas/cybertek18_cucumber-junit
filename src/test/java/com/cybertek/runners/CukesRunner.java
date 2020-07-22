package com.cybertek.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //It is path for report
        plugin = {"html:target/cucumber-report.html",
                   "json:target/cucumber.jason",
                    "rerun:target/rerun.txt"
        },

        //It is for fetures path
        features = "src/test/resources/features",
        //it is for step package path
        glue = "com/cybertek/step_definitions",
        dryRun = false,
        // It is for what we want to run
        tags = "@wiki"
)
public class CukesRunner {
}