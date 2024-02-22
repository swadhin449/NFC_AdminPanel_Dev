package com.nfc.stepdef;

import com.nfc.pages.Users;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsersStepDef {
    public WebDriver driver;
    public Users us;
    @Given("I open chrome browser")
    public void iOpenTheChromeBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new FirefoxDriver();
        us = new Users(driver);
        Thread.sleep(3000);
    }

    @When("I open the fitness court")
    public void iOpenFitnessCourt() throws InterruptedException {
        driver.get("http://nationalfitnesscampaign-dev.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @When("I click on users")
    public void iClickOnUsers() throws InterruptedException {
        us.clickUser();
    }
    @When("I select the checkbox and delete one user")
    public void iSelectTheCheckboxAndDeleteOneUser() throws InterruptedException {
        us.selectCheckBox();
    }
    @When("I click on show")
    public void iClickOnShow() throws InterruptedException {
        us.clickShow();
    }
    @When("I search the user by name")
    public void iSearchTheUserByName() throws InterruptedException {
        us.sendSearch();
    }
    @When("I click on date")
    public void iClickOnDate() throws InterruptedException {
        us.clickDate();
        us.clickDate2();
    }
    @When("I see all the users")
    public void iSeeAllTheUsers() throws InterruptedException {
        us.scroll();
    }
    @When("I export all user data")
    public void iExportAllUserData() throws InterruptedException {
        us.clickExport();
    }
    @Then("I apply the filters")
    public void iApplyTheFilters() throws InterruptedException {
        us.clickFilters();
        us.clickFilters2();
    }

}
