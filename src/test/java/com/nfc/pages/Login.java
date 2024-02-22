package com.nfc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
    public WebDriver ldriver;
    public Login(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }


    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/input[1]")
    @CacheLookup
    WebElement emailField;
    public void enterEmail(String email) throws InterruptedException {
        emailField.clear();
        Thread.sleep(3000);
        emailField.sendKeys(email);
        Thread.sleep(3000);
    }

    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[2]/input[1]")
    @CacheLookup
    WebElement passField;
    public void enterPass(String password) throws InterruptedException {
        passField.clear();
        Thread.sleep(3000);
        passField.sendKeys(password);
        Thread.sleep(3000);
    }
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/button[1]")
    @CacheLookup
    WebElement btn;
    public void btnClick() throws InterruptedException {
        btn.click();
        Thread.sleep(3000);
        ldriver.quit();
    }

}
