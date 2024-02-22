package com.nfc.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports-6.html","summary"}
        //,features = {"src/test/resources/login.feature"}
        //,features = {"src/test/resources/fitness.feature"}
        //,features = {"src/test/resources/trainer.feature"}
        ,features = {"src/test/resources/users.feature"}
        //,features = {"src/test/resources/featurechallenge.feature"}
        //,features = {"src/test/resources/workout.feature"}
        //,features = {"src/test/resources/movements.feature"}
        //,features = {"src/test/resources/about.feature"}
        ,glue = {"com.nfc.stepdef"}
        ,snippets = CAMELCASE
        ,dryRun=false
        ,monochrome=true
        //,tags = "@Login"
        //,tags = "@FitnessCourt"
        //,tags = "@Trainer"
        ,tags = "@User"
        //,tags = "@FeatureChallenge"
        //,tags = "@WorkOut"
        //,tags = "@Movements"
        //,tags = "@About"
)
public class MyRunnerTest {
}
