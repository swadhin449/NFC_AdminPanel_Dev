package com.nfc.stepdef;

import com.nfc.pages.FeatureChallenge;
import com.nfc.pages.FitnessCourt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeatureChallengeStepDef {
    public WebDriver driver;
    public FeatureChallenge fs;
    @Given("I open the  chrome browser")
    public void iOpenTheChromeBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        fs = new FeatureChallenge(driver);
        Thread.sleep(3000);
    }
    @When("I open the  fitness court")
    public void iOpenTheFitnessCourt() throws InterruptedException {
        driver.get("http://nationalfitnesscampaign-dev.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @When("I click on Feature challenge")
    public void iClickOnFeatureChallenge() throws InterruptedException {
        fs.clickFeature();
    }
    @When("I create feature challenge")
    public void iCreateFeatureChallenge() throws InterruptedException {
        fs.createFeature();
    }
    @When("I delete one feature challenge")
    public void iDeleteOneFeatureChallenge() throws InterruptedException {
        fs.deleteFeature();
    }
    @When("I update the feature challenge")
    public void iUpdateTheFeatureChallenge() throws InterruptedException {
        fs.updateFeature();
    }
    @When("I show the fitness court and add fitness court")
    public void iShowTheFitnessCourtAndAddFitnessCourt() throws InterruptedException {
        fs.showFitnessCourt();
    }
    @Then("I create a fitness challenge and see in the app")
    public void iCreateAFitnessChallengeAndSeeInTheApp() throws InterruptedException {
        fs. createFeatureApp();
    }

}
