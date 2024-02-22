package com.nfc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class About {
    public WebDriver ldriver;

    public About(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "/html/body/div[2]/button/div")
    @CacheLookup
    WebElement menu ;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/button[1]/p[1]")
    @CacheLookup
    WebElement menuCancel ;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/ul[1]/li[7]/a[1]")
    @CacheLookup
    WebElement about ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/input[1]")
    @CacheLookup
    WebElement Field1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[2]/input[1]")
    @CacheLookup
    WebElement Field2;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/button[1]")
    @CacheLookup
    WebElement btn1;
    public void clickAbout() throws InterruptedException {
        Field1.sendKeys("akshaydafade@peppersquare.com");
        Thread.sleep(3000);
        Field2.sendKeys("Reset$123");
        Thread.sleep(3000);
        btn1.click();
        Thread.sleep(7000);
        menu.click();
        Thread.sleep(3000);
        about.click();
        Thread.sleep(3000);
    }
    public void createSponsor() throws InterruptedException {
        WebElement btn = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
        btn.click();
        Thread.sleep(2000);
        WebElement name = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        name.sendKeys("NFC Drive");
        Thread.sleep(3000);
        WebElement img = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[2]/div/label/input"));
        img.sendKeys("/Users/codeprismtechnologies/Downloads/Screenshot 2023-05-04 at 3.34.48 PM.png");
        Thread.sleep(4000);
        WebElement ele = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]"));
        ele.click();
        Thread.sleep(5000);
    }
    public void updateSponsor() throws InterruptedException {
        WebElement ele = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/qwik-react/div/div[1]/table/tbody/tr[1]"));
        ele.click();
        Thread.sleep(3000);
        WebElement ele2 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        ele2.clear();
        Thread.sleep(2000);
        ele2.sendKeys("Test 2");
        Thread.sleep(2000);
        WebElement btn = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]"));
        btn.click();
        Thread.sleep(3000);
    }
    public void deleteSponsor() throws InterruptedException {
        WebElement ele = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/qwik-react/div/div[1]/table/tbody/tr[1]/td[1]/span/input"));
        ele.click();
        Thread.sleep(2000);
        WebElement del = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[2]/div[1]/button[2]"));
        del.click();
        Thread.sleep(3000);
    }
    public void clickHealthStat() throws InterruptedException {
        WebElement ele = ldriver.findElement(By.xpath("/html/body/div[2]/button"));
        ele.click();
        Thread.sleep(2000);
        WebElement healthStat = ldriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/ul[1]/li[8]/a[1]"));
        healthStat.click();
        Thread.sleep(3000);
    }
    public void clickStepCalories() throws InterruptedException {
        WebElement ele = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/qwik-react[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/button[1]"));
        ele.click();
        Thread.sleep(3000);
        ldriver.quit();
    }
}
