package com.nfc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Workout {
    public WebDriver ldriver;
    public Workout(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "/html/body/div[2]/button/div")
    @CacheLookup
    WebElement menu ;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/button[1]/p[1]")
    @CacheLookup
    WebElement menuCancel ;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/ul[1]/li[5]/a[1]")
    @CacheLookup
    WebElement work ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/input[1]")
    @CacheLookup
    WebElement Field1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[2]/input[1]")
    @CacheLookup
    WebElement Field2;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/button[1]")
    @CacheLookup
    WebElement btn1;
    public void clickWorkout() throws InterruptedException {
        Field1.sendKeys("akshaydafade@peppersquare.com");
        Thread.sleep(3000);
        Field2.sendKeys("Reset$123");
        Thread.sleep(3000);
        btn1.click();
        Thread.sleep(5000);
        menu.click();
        Thread.sleep(3000);
        work.click();
        Thread.sleep(3000);
    }
    public void addWorkout() throws InterruptedException {
        WebElement add = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
        add.click();
        Thread.sleep(3000);
        WebElement title = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        title.sendKeys("Back Workout");
        Thread.sleep(2000);
        //BodyType Dropdown
        WebElement bodyType = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/qwik-react[1]/div[1]/div[1]"));
        bodyType.click();
        Thread.sleep(2000);
        WebElement full = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[1]"));
        full.click();
        Thread.sleep(2000);
        bodyType.click();
        Thread.sleep(2000);
        WebElement upper = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[2]"));
        upper.click();
        Thread.sleep(2000);
        bodyType.click();
        Thread.sleep(2000);
        WebElement lower = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[3]"));
        lower.click();
        Thread.sleep(2000);
        //Duration
        WebElement dur = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[3]/input[1]"));
        dur.sendKeys("5");
        Thread.sleep(2000);
        //Level
        WebElement level = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[4]/qwik-react[1]/div[1]/div[1]"));
        level.click();
        Thread.sleep(2000);
        WebElement beginner = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[1]"));
        beginner.click();
        Thread.sleep(2000);
        level.click();
        Thread.sleep(2000);
        WebElement intermediate = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[2]"));
        intermediate.click();
        Thread.sleep(2000);
        level.click();
        Thread.sleep(2000);
        WebElement advanced = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[3]"));
        advanced.click();
        Thread.sleep(2000);
        //Trainer
        WebElement trainer = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[5]/qwik-react[1]/div[1]/div[1]"));
        trainer.click();
        Thread.sleep(2000);
        WebElement markL = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[1]"));
        markL.click();
        Thread.sleep(2000);
        //Video
        WebElement vid = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[6]/div/label/input"));
        vid.sendKeys("/Users/codeprismtechnologies/Downloads/pexels-tima-miroshnichenko-5319099-3840x2160-25fps.mp4");
        Thread.sleep(5000);
        WebElement thumbnailLandscape = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[7]/div/label/input"));
        thumbnailLandscape.sendKeys("/Users/codeprismtechnologies/Downloads/istockphoto-1072395722-612x612.jpg");
        Thread.sleep(5000);
        // Scrolling down the page till the element is found
        JavascriptExecutor js = ((JavascriptExecutor) ldriver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        WebElement thumbnailPortrait = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[8]/div/label/input"));
        thumbnailPortrait.sendKeys("/Users/codeprismtechnologies/Downloads/download.jpeg");
        Thread.sleep(5000);

        WebElement create = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[9]/button[1]"));
        create.click();
        Thread.sleep(25000);
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
    public void updateWorkoutVideo() throws InterruptedException {
        WebElement clc = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]"));
        clc.click();
        Thread.sleep(2000);
        WebElement title = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        title.clear();
        Thread.sleep(2000);
        title.sendKeys("Testing 2");
        Thread.sleep(2000);

        // Scrolling down the page till the element is found
        JavascriptExecutor js = ((JavascriptExecutor) ldriver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        WebElement update = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[9]/button[1]"));
        update.click();
        Thread.sleep(10000);
        clickRow.click();
        Thread.sleep(2000);
        clickRow1.click();
        Thread.sleep(2000);
        clickRow2.click();
        Thread.sleep(2000);
        clickRow3.click();
        Thread.sleep(2000);

        // Scrolling down the page till the element is found
        //JavascriptExecutor js = ((JavascriptExecutor) ldriver);
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }

    public void deleteOneVideo() throws InterruptedException {
//        WebElement box = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/input[1]"));
//        box.click();
//        Thread.sleep(2000);
//        WebElement delete = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[2]/div[1]/button[1]"));
//        delete.click();
//        Thread.sleep(3000);
        ldriver.quit();
    }

}
