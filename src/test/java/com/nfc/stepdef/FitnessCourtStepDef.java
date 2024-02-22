package com.nfc.stepdef;

import com.nfc.pages.FitnessCourt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FitnessCourtStepDef {
    public WebDriver driver;
    public FitnessCourt fc;
    @Given("I open the chrome browser")
    public void iOpenTheChromeBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        fc = new FitnessCourt(driver);
        Thread.sleep(3000);
    }
    @When("I open fitness court")
    public void iOpenFitnessCourt() throws InterruptedException {
        driver.get("http://nationalfitnesscampaign-dev.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @When("I click on create fitness court")
    public void iClickOnCreateFitnessCourt() throws InterruptedException {
        fc.clickCreateCourt();
    }
    @When("I enter valid details")
    public void iEnterValidDetails() throws InterruptedException {
        fc.sendCredential();
    }
    @When("I click on creat court button")
    public void iClickOnCreatCourtButton() throws InterruptedException {
        fc.clickCreate();
    }
    @When("I click on one of fitness court check box")
    public void iClickOnOneOfFitnessCourtCheckBox() throws InterruptedException {
        fc.clickCheckBox();
    }
    @When("I delete the account")
    public void iDeleteTheAccount() throws InterruptedException {
        fc.clickDelete();
    }
    @When("I click on another fitness court check box")
    public void iClickOnAnotherFitnessCourtCheckBox() throws InterruptedException {
        fc.clickCheckBox2();
    }

    @When("I add featured workout")
    public void iAddFeaturedWorkout() throws InterruptedException {
        fc.addFeatureWork();
    }
    @When("I click on one fitness court")
    public void iClickOnOneFitnessCourt() throws InterruptedException {
        fc.clickFC();
    }
    @When("I click on update court")
    public void iClickOnUpdateCourt() throws InterruptedException {
        fc.editFitnessCourt();
    }
    @When("I click on row per page")
    public void iClickOnRowPerPage() throws InterruptedException {
        fc.clickRow();
    }
    @When("I search a fitness court")
    public void iSearchAFitnessCourt() throws InterruptedException {
        fc.searchFitnessCourt();
    }
    @When("I apply filter with city")
    public void iApplyFilterWithCity() throws InterruptedException {
        fc.filterWithCity();
    }
    @When("I apply filter with state")
    public void iApplyFilterWithState() throws InterruptedException {
        fc.filterWithState();
    }
    @Then("I create the fitness court and confirm in the app")
    public void iCreateTheFitnessCourtAndConfirmInTheApp() throws InterruptedException {
        fc.confirmApp();
    }



}
