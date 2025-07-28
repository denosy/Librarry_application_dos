package com.dos.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html", // path target folder to store html report
                "rerun:target/rerun.txt", // implements rerun and give the location where to store failed tests (create rerun.txt)
                "me.jvt.cucumber.report.PrettyReports:target/cucumber" // reports mvn
        },

        features = "src/test/resources/features", // path feature files folder
        glue = "com/dos/step_definitions", //path to step def
        dryRun = false, //run scenarios
        tags = "@wip", // tag to choose particular scenario/method
        publish = true // true - to get link with public html report
)



public class CukesRunner {

}

//TO KEEP SAFE OUR DATA SAFE
//environmental variables
// cukes runner on the top. edit configuration
//EMAIL=CBBLE02@GMAIL.COM;PASSWORD=545823
//IF WE NEED TO SHARE PROJECT IN JENKINS WE HAVE TO CREATE THIS VARIABLES IN JENKINS(TO AVOID SHARE SENSITIVE DATA ON GITHUB)

