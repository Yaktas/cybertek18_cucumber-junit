package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(

            features = "rerun:target/rerun.txt",
            glue = "src/test/resources/features"

    )
    public class FailedTestRunner {
}
