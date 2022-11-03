package com.azulcrm.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html" ,
                "json:target/cucumber.json",
                "junit:target/report.xml",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/test/resources/features",
        glue = "com/azulcrm/step_definitions",
        dryRun = false,
        tags = "@wip"
)


public class CukesRunner {

}
