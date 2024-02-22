package com.nfc.stepdef;

import com.nfc.pages.Trainer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class TrainerStepDef {
    public WebDriver driver;
    public Trainer tr;
    @Given("I open  chrome browser")
    public void iOpenTheChromeBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        tr = new Trainer(driver);
        Thread.sleep(3000);
    }
    @When("I open  fitness court")
    public void iOpenFitnessCourt() throws InterruptedException {
        driver.get("http://nationalfitnesscampaign-dev.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @When("I click on trainer")
    public void iClickOnTrainer() throws InterruptedException {
        tr.clickTrainer();
    }
    @When("I add one trainer")
    public void iAddOneTrainer() throws InterruptedException, AWTException {
        tr.addTrainer();
    }
    @When("I delete one trainer account")
    public void iDeleteOneTrainerAccount() throws InterruptedException {
        tr.deleteTrainer();
    }
    @Then("I update one trainer account")
    public void iUpdateOneTrainerAccount() throws InterruptedException, AWTException {
        tr.updateTrainer();
        tr.addTrainer2();
    }

}
