package com.nfc.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.awt.*;

public class Trainer {
    public WebDriver ldriver;
    public Trainer(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "/html/body/div[2]/button/div")
    @CacheLookup
    WebElement menu ;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/button[1]/p[1]")
    @CacheLookup
    WebElement menuCancel ;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")
    @CacheLookup
    WebElement trainer ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/input[1]")
    @CacheLookup
    WebElement Field1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[2]/input[1]")
    @CacheLookup
    WebElement Field2;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/button[1]")
    @CacheLookup
    WebElement btn1;
    public void clickTrainer() throws InterruptedException {
        Field1.sendKeys("akshaydafade@peppersquare.com");
        Thread.sleep(2000);
        Field2.sendKeys("Reset$123");
        Thread.sleep(2000);
        btn1.click();
        Thread.sleep(5000);
        menu.click();
        Thread.sleep(2000);
        trainer.click();
        Thread.sleep(2000);
    }
    public void addTrainer() throws InterruptedException, AWTException {
        WebElement ele = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
        ele.click();
        Thread.sleep(2000);
        WebElement fn = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        fn.sendKeys("Swadhin");
        Thread.sleep(2000);
        WebElement ln = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]"));
        ln.sendKeys("Jena");
        Thread.sleep(2000);
        WebElement des = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[3]/input[1]"));
        des.sendKeys("I am a trainer");
        Thread.sleep(2000);
        WebElement tw = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[4]/input[1]"));
        tw.sendKeys("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_5208100fbe6397aec4284eb98f992b28901ed23e3f516798efe6d892&mfadid=adm");
        Thread.sleep(2000);
        WebElement ele2 = ldriver.findElement(By.xpath("(//input[@id='dropzone-file'])[1]"));
        ele2.sendKeys("/Users/codeprismtechnologies/Downloads/istockphoto-675179390-612x612.jpg");
        Thread.sleep(2000);
        WebElement ele4 = ldriver.findElement(By.xpath("//*[@id=\"dropzone-file\"]"));

        // Scrolling down the page till the element is found
        JavascriptExecutor js = ((JavascriptExecutor) ldriver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        ele4.sendKeys("/Users/codeprismtechnologies/Downloads/istockphoto-1072395722-612x612.jpg");
        Thread.sleep(2000);
        WebElement ele3 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[7]/button[1]"));
        ele3.click();
        Thread.sleep(2000);

    }
    public void deleteTrainer() throws InterruptedException {
        WebElement ele = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/qwik-react/div/div[1]/table/tbody/tr[1]/td[1]/span/input"));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[2]/div[1]/button[1]"));
        ele2.click();
        Thread.sleep(2000);
    }
    public void updateTrainer() throws InterruptedException {
        WebElement ele = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/qwik-react/div/div[1]/table/tbody/tr[2]/td[3]"));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        ele2.clear();
        Thread.sleep(2000);
        ele2.sendKeys("Test Fit");
        Thread.sleep(2000);
        // Scrolling down the page till the element is found
        JavascriptExecutor js = ((JavascriptExecutor) ldriver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        WebElement ele3 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[7]/button[1]"));
        ele3.click();
        Thread.sleep(2000);
    }
    public void addTrainer2() throws InterruptedException, AWTException {
        WebElement ele = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
        ele.click();
        Thread.sleep(2000);
        WebElement fn = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        fn.sendKeys("Swadhin");
        Thread.sleep(2000);
        WebElement ln = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]"));
        ln.sendKeys("Jena");
        Thread.sleep(2000);
        WebElement des = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[3]/input[1]"));
        des.sendKeys("I am a trainer");
        Thread.sleep(2000);
        WebElement tw = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[4]/input[1]"));
        tw.sendKeys("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_5208100fbe6397aec4284eb98f992b28901ed23e3f516798efe6d892&mfadid=adm");
        Thread.sleep(2000);
        WebElement ele2 = ldriver.findElement(By.xpath("(//input[@id='dropzone-file'])[1]"));
        ele2.sendKeys("/Users/codeprismtechnologies/Downloads/istockphoto-675179390-612x612.jpg");
        Thread.sleep(2000);
        WebElement ele4 = ldriver.findElement(By.xpath("//*[@id=\"dropzone-file\"]"));

        // Scrolling down the page till the element is found
        JavascriptExecutor js = ((JavascriptExecutor) ldriver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        ele4.sendKeys("/Users/codeprismtechnologies/Downloads/istockphoto-1072395722-612x612.jpg");
        Thread.sleep(2000);
        WebElement ele3 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[7]/button[1]"));
        ele3.click();
        Thread.sleep(2000);
        ldriver.quit();
    }












}
