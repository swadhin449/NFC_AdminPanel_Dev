package com.nfc.stepdef;

import com.nfc.pages.About;
import com.nfc.pages.Movements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutStepDef {
    public WebDriver driver;
    public About ab;
    @Given("I  open the Chrome browser")
    public void iOpenTheChromeBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        ab = new About(driver);
        Thread.sleep(3000);
    }
    @When("I  open the Fitness court")
    public void iOpenTheFitnessCourt() throws InterruptedException {
        driver.get("http://nationalfitnesscampaign-dev.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @When("I click on About")
    public void iClickOnAbout() throws InterruptedException {
        ab.clickAbout();
    }
    @When("I create a sponsor")
    public void iCreateASponsor() throws InterruptedException {
        ab.createSponsor();
    }
    @When("I update a sponsor")
    public void iUpdateASponsor() throws InterruptedException {
        ab.updateSponsor();
    }
    @When("I delete the sponsor")
    public void iDeleteTheSponsor() throws InterruptedException {
        ab.deleteSponsor();
    }
    @When("I click on User health stats")
    public void iClickOnUserHealthStats() throws InterruptedException {
        ab.clickHealthStat();
    }
    @Then("I click on users steps and calories")
    public void iClickOnUsersStepsAndCalories() throws InterruptedException {
        ab.clickStepCalories();
    }

}
