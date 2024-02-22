package com.nfc.stepdef;

import com.nfc.pages.FeatureChallenge;
import com.nfc.pages.Workout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkoutStepDef {
    public WebDriver driver;
    public Workout wo;
    @Given("I open the chrome  browser")
    public void iOpenTheChromeBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wo = new Workout(driver);
        Thread.sleep(3000);
    }
    @When("I open the fitness  court")
    public void iOpenTheFitnessCourt() throws InterruptedException {
        driver.get("http://nationalfitnesscampaign-dev.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @When("I click on the Workout")
    public void iClickOnTheWorkout() throws InterruptedException {
        wo.clickWorkout();
    }
    @When("I add workout")
    public void iAddWorkout() throws InterruptedException {
        wo.addWorkout();
    }
    @When("I update the workout video")
    public void iUpdateTheWorkoutVideo() throws InterruptedException {
        wo.updateWorkoutVideo();
    }
    @Then("I delete one workout video")
    public void iDeleteOneWorkoutVideo() throws InterruptedException {
        wo.deleteOneVideo();
    }

}
