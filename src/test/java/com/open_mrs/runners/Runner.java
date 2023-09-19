package com.open_mrs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features ="/Users/htamoukraytt/IdeaProjects/OPEN-MRS/src/test/resources/Ui_festures",
        glue = "com/open_mrs/stepdef",
        dryRun = true,
        tags ="Regression",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt","json:target/cucumber-reports/cucumber.json"}

)

public class Runner {

}
