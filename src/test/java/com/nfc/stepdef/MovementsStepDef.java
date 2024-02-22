package com.nfc.stepdef;

import com.nfc.pages.Movements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MovementsStepDef {
    public WebDriver driver;
    public Movements mo;
    @Given("I  open the chrome browser")
    public void iOpenTheChromeBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        mo = new Movements(driver);
        Thread.sleep(3000);
    }
    @When("I  open the fitness court")
    public void iOpenTheFitnessCourt() throws InterruptedException {
        driver.get("http://nationalfitnesscampaign-dev.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @When("I click on movements")
    public void iClickOnMovements() throws InterruptedException {
        mo.clickMovement();
    }
    @When("I create a category")
    public void iCreateACategory() throws InterruptedException {
        mo.createCategory();
    }
    @When("I click on one category")
    public void iClickOnOneCategory() throws InterruptedException {
        mo.clickOneCategory();
    }
    @When("I create a movement video")
    public void iCreateAMovementVideo() throws InterruptedException {
        mo.createMovementVideo();
        mo.createMovementVideo2();
        mo.createMovementVideo3();
    }
    @When("I update the movement video")
    public void iUpdateTheMovementVideo() throws InterruptedException {
        mo.updateMoveVideo();
    }
    @When("I delete the a movement video")
    public void iDeleteTheAMovementVideo() throws InterruptedException {
        mo.deleteMoveVideo();
    }
    @When("I update movement category")
    public void iUpdateMovementCategory() throws InterruptedException {
        mo.updateCategory();
    }
    @Then("I delete the category")
    public void iDeleteTheCategory() throws InterruptedException {
        mo.deleteCategory();
    }
}
