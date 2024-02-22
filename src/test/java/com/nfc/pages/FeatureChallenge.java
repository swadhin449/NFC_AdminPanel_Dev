package com.nfc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class FeatureChallenge {
    public WebDriver ldriver;
    public FeatureChallenge(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "/html/body/div[2]/button/div")
    @CacheLookup
    WebElement menu ;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/button[1]/p[1]")
    @CacheLookup
    WebElement menuCancel ;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/ul[1]/li[4]/a[1]")
    @CacheLookup
    WebElement feature ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/input[1]")
    @CacheLookup
    WebElement Field1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[2]/input[1]")
    @CacheLookup
    WebElement Field2;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/button[1]")
    @CacheLookup
    WebElement btn1;
    public void clickFeature() throws InterruptedException {
        Field1.sendKeys("akshaydafade@peppersquare.com");
        Thread.sleep(3000);
        Field2.sendKeys("Reset$123");
        Thread.sleep(3000);
        btn1.click();
        Thread.sleep(5000);
        menu.click();
        Thread.sleep(3000);
        feature.click();
        Thread.sleep(3000);
    }
    public void createFeature() throws InterruptedException {
        WebElement ele = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        ele2.sendKeys("Court1");
        Thread.sleep(2000);
        WebElement ele3 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]"));
        ele3.sendKeys("https://www.figma.com/file/1NyJUZT3jtptPz8Ix25m0T/NFC_2.0_Approved_Designs?node-id=1189%3A4602&t=EY1FyYbrzGn7zNyX-0");
        Thread.sleep(2000);
        WebElement ele6 = ldriver.findElement(By.xpath("//input[@type='file']"));
        ele6.sendKeys("/Users/codeprismtechnologies/Downloads/istockphoto-675179390-612x612.jpg");
        Thread.sleep(2000);
        WebElement ele5 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[4]/button[1]"));
        ele5.click();
        Thread.sleep(2000);
    }
    public void deleteFeature() throws InterruptedException {
        WebElement ele = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/qwik-react/div/div[1]/table/tbody/tr[1]/td[1]/span/input"));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[2]/div[1]/button[2]"));
        ele2.click();
        Thread.sleep(2000);
    }
    public void updateFeature() throws InterruptedException {
        WebElement ele = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/qwik-react/div/div[1]/table/tbody/tr[1]"));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        ele2.clear();
        Thread.sleep(2000);
        ele2.sendKeys("Court2");
        Thread.sleep(2000);
        WebElement ele3 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[4]/button[1]"));
        ele3.click();
        Thread.sleep(2000);
    }
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]")
    @CacheLookup
    WebElement clickRow ;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[3]/ul[1]/li[2]")
    @CacheLookup
    WebElement clickRow1 ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]")
    @CacheLookup
    WebElement clickRow2 ;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[3]/ul[1]/li[3]")
    @CacheLookup
    WebElement clickRow3 ;
    public void showFitnessCourt() throws InterruptedException {
        WebElement ele = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/button[1]"));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[2]"));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/input[1]"));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[2]"));
        ele4.click();
        Thread.sleep(2000);
        WebElement ele5 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/input[1]"));
        ele5.click();
        Thread.sleep(2000);
        WebElement ele6 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[3]"));
        ele6.click();
        Thread.sleep(3000);
        WebElement ele7 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
        ele7.click();
        Thread.sleep(2000);
        clickRow.click();
        Thread.sleep(2000);
        clickRow1.click();
        Thread.sleep(2000);
        clickRow2.click();
        Thread.sleep(2000);
        clickRow3.click();
        Thread.sleep(2000);
    }
    public void createFeatureApp() throws InterruptedException {
        WebElement ele = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        ele2.sendKeys("Court1");
        Thread.sleep(2000);
        WebElement ele3 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]"));
        ele3.sendKeys("https://www.figma.com/file/1NyJUZT3jtptPz8Ix25m0T/NFC_2.0_Approved_Designs?node-id=1189%3A4602&t=EY1FyYbrzGn7zNyX-0");
        Thread.sleep(2000);
        WebElement ele6 = ldriver.findElement(By.xpath("//input[@type='file']"));
        ele6.sendKeys("/Users/codeprismtechnologies/Downloads/istockphoto-675179390-612x612.jpg");
        Thread.sleep(2000);
        WebElement ele5 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[4]/button[1]"));
        ele5.click();
        Thread.sleep(4000);
        ldriver.quit();
    }
}
