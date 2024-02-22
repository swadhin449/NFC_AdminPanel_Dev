package com.nfc.stepdef;

import com.nfc.pages.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDef {
    public WebDriver driver;
    public Login lp;
    @Given("User launch the chrome browser")
    public void userLaunchTheChromeBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        lp = new Login(driver);
        Thread.sleep(3000);
    }
    @When("User open the Admin panel")
    public void userOpenTheAdminPanel()  throws InterruptedException {
        driver.get("http://nationalfitnesscampaign-dev.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @When("I enter the valid email as {string}")
    public void iEnterTheValidEmailAs(String email) throws InterruptedException {
        lp.enterEmail(email);
    }
    @When("I enter the password as {string}")
    public void iEnterThePasswordAs(String pass) throws InterruptedException {
        lp.enterPass(pass);
    }
    @Then("I click on login")
    public void iClickOnLogin() throws InterruptedException {
        lp.btnClick();
    }

}
