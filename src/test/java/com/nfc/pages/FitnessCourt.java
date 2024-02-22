package com.nfc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FitnessCourt {
    public WebDriver ldriver;
    public FitnessCourt(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "")
    @CacheLookup
    WebElement checkBox ;

    @FindBy(xpath = "/html/body/main/section/div/div/div/div[1]/button[1]")
    @CacheLookup
    WebElement createCourt;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
    @CacheLookup
    WebElement parkName;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")
    @CacheLookup
    WebElement city;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[3]/input[1]")
    @CacheLookup
    WebElement state;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[4]/input[1]")
    @CacheLookup
    WebElement street;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[5]/input[1]")
    @CacheLookup
    WebElement latitude;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[6]/input[1]")
    @CacheLookup
    WebElement longitude;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[7]/input[1]")
    @CacheLookup
    WebElement sponsorName;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[8]/input[1]")
    @CacheLookup
    WebElement sponsorLink;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[9]/input[1]")
    @CacheLookup
    WebElement openSoon;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[10]/button[1]")
    @CacheLookup
    WebElement create;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/input[1]")
    @CacheLookup
    WebElement Field1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[2]/input[1]")
    @CacheLookup
    WebElement Field2;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/button[1]")
    @CacheLookup
    WebElement btn1;


    public void clickCreateCourt() throws InterruptedException {
        Field1.sendKeys("akshaydafade@peppersquare.com");
        Thread.sleep(3000);
        Field2.sendKeys("Reset$123");
        Thread.sleep(3000);
        btn1.click();
        Thread.sleep(5000);
        createCourt.click();
        Thread.sleep(3000);
    }

    public void sendCredential() throws InterruptedException {
        parkName.sendKeys("Code");
        Thread.sleep(3000);
        city.sendKeys("HYDERABAD");
        Thread.sleep(3000);
        state.sendKeys("Telangana");
        Thread.sleep(3000);
        street.sendKeys("Yes");
        Thread.sleep(3000);
        latitude.sendKeys("17.4305753");
        Thread.sleep(3000);
        longitude.sendKeys("78.4081614");
        Thread.sleep(3000);
        sponsorName.sendKeys("Swadhin");
        Thread.sleep(3000);
        sponsorLink.sendKeys("https://www.youtube.com/");
        Thread.sleep(3000);
        openSoon.click();
        Thread.sleep(3000);
    }
    public void clickCreate() throws InterruptedException {
        create.click();
        Thread.sleep(3000);
    }
    @FindBy(xpath = "/html/body/main/section/div/div/div/div[2]/qwik-react/div/div[1]/table/tbody/tr[1]/td[1]/span/input")
    @CacheLookup
    WebElement checkBox1 ;

    public void clickCheckBox() throws InterruptedException {
        checkBox1.click();
        Thread.sleep(2000);
    }
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[2]/div[1]/button[2]")
    @CacheLookup
    WebElement deleteAct ;
    public void clickDelete() throws InterruptedException {
        deleteAct.click();
        Thread.sleep(2000);
    }
    @FindBy(xpath = "/html/body/main/section/div/div/div/div[2]/qwik-react/div/div[1]/table/tbody/tr[2]/td[1]/span/input")
    @CacheLookup
    WebElement checkBox2 ;
    public void clickCheckBox2() throws InterruptedException {
        checkBox2.click();
        Thread.sleep(2000);
    }
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[2]")
    @CacheLookup
    WebElement addFeatureWorkout ;
    @FindBy(xpath = "/html/body/main/section/div/div/div/div[2]/qwik-react/div/ul/li[2]/div[1]/div[1]/span/input")
    @CacheLookup
    WebElement featureWorkoutCheckbox ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/ul[1]/li[2]/div[2]/button[1]/*[name()='svg'][1]")
    @CacheLookup
    WebElement preview ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/header[1]/button[1]")
    @CacheLookup
    WebElement previewBack ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[1]/button[1]")
    @CacheLookup
    WebElement featureWorkoutBtn ;
    public void addFeatureWork() throws InterruptedException {
        addFeatureWorkout.click();
        Thread.sleep(2000);
        featureWorkoutCheckbox.click();
        Thread.sleep(2000);
        preview.click();
        Thread.sleep(2000);
        previewBack.click();
        Thread.sleep(2000);
        featureWorkoutBtn.click();
        Thread.sleep(2000);
    }
    @FindBy(xpath = "/html/body/main/section/div/div/div/div[2]/qwik-react/div/div[1]/table/tbody/tr[1]")
    @CacheLookup
    WebElement ele ;
    public void clickFC() throws InterruptedException {
        ele.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[10]/button[1]")
    @CacheLookup
    WebElement btnUpdate ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
    @CacheLookup
    WebElement parkName1 ;

    public void editFitnessCourt() throws InterruptedException {
        parkName1.clear();
        Thread.sleep(2000);
        parkName1.sendKeys("Office CodePrism");
        Thread.sleep(2000);

        // Scrolling down the page till the element is found
        JavascriptExecutor js = ((JavascriptExecutor) ldriver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        btnUpdate.click();
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
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]")
    @CacheLookup
    WebElement clickRow4 ;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[3]/ul[1]/li[4]")
    @CacheLookup
    WebElement clickRow5 ;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[2]")
    @CacheLookup
    WebElement clickArrowRight ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]")
    @CacheLookup
    WebElement clickArrowLeft ;
    public void clickRow() throws InterruptedException {
        clickRow.click();
        Thread.sleep(2000);
        clickRow1.click();
        Thread.sleep(2000);
        clickRow2.click();
        Thread.sleep(2000);
        clickRow3.click();
        Thread.sleep(2000);
        clickRow4.click();
        Thread.sleep(2000);
        clickRow5.click();
        Thread.sleep(2000);
        WebElement ele = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[2]/div[1]/button[1]"));
        ele.click();
        Thread.sleep(3000);
        clickArrowRight.click();
        Thread.sleep(2000);
        clickArrowLeft.click();
        Thread.sleep(2000);
    }
    public void searchFitnessCourt() throws InterruptedException {
        WebElement ele = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"));
        ele.sendKeys("codeprism");
        Thread.sleep(3000);
        ele.clear();
        Thread.sleep(3000);
        ldriver.navigate().refresh();
        Thread.sleep(3000);
    }
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]")
    @CacheLookup
    WebElement filter ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]")
    @CacheLookup
    WebElement cityFilter ;
    public void filterWithCity() throws InterruptedException {
        filter.click();
        Thread.sleep(2000);
        cityFilter.click();
        Thread.sleep(2000);
        List<WebElement> allElement = ldriver.findElements(By.xpath("/html/body/main/section/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div[2]/p"));
        for(WebElement ele : allElement){
            if(ele.getText().equals("Albany, NY")){
                ele.click();
                break;
            }
        }
        Thread.sleep(3000);
        filter.click();
        Thread.sleep(2000);
        cityFilter.click();
        Thread.sleep(2000);
        WebElement ele = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/p[1]"));
        ele.click();
        Thread.sleep(5000);
    }
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]")
    @CacheLookup
    WebElement filter1 ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]")
    @CacheLookup
    WebElement stateFilter ;
    public void filterWithState() throws InterruptedException {
        filter1.click();
        Thread.sleep(2000);
        stateFilter.click();
        Thread.sleep(2000);
        List<WebElement> allElement1 = ldriver.findElements(By.xpath("/html/body/main/section/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[2]/p"));
        for(WebElement ele1 : allElement1){
            if(ele1.getText().equals("California")){
                ele1.click();
                break;
            }
        }
        Thread.sleep(3000);
        filter1.click();
        Thread.sleep(30000);
        stateFilter.click();
        Thread.sleep(3000);
        WebElement ele = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/p[1]"));
        ele.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
    @CacheLookup
    WebElement park1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")
    @CacheLookup
    WebElement city1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[3]/input[1]")
    @CacheLookup
    WebElement state1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[4]/input[1]")
    @CacheLookup
    WebElement street1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[5]/input[1]")
    @CacheLookup
    WebElement latitude1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[6]/input[1]")
    @CacheLookup
    WebElement longitude1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[7]/input[1]")
    @CacheLookup
    WebElement sponsorName1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[8]/input[1]")
    @CacheLookup
    WebElement sponsorLink1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[9]/input[1]")
    @CacheLookup
    WebElement openSoon1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[10]/button[1]")
    @CacheLookup
    WebElement create1;

    public void confirmApp() throws InterruptedException {
        Thread.sleep(3000);
        WebElement ele = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[1]/button[1]"));
        ele.click();
        Thread.sleep(3000);
        park1.sendKeys("CodePrism");
        Thread.sleep(3000);
        city1.sendKeys("HYDERABAD");
        Thread.sleep(3000);
        state1.sendKeys("Telangana");
        Thread.sleep(3000);
        street1.sendKeys("YesBank Front");
        Thread.sleep(3000);
        latitude1.sendKeys("17.4305753");
        Thread.sleep(3000);
        longitude1.sendKeys("78.4081614");
        Thread.sleep(3000);
        sponsorName1.sendKeys("SSSSSSS");
        Thread.sleep(3000);
        sponsorLink1.sendKeys("https://www.youtube.com/");
        Thread.sleep(3000);
        openSoon1.click();
        Thread.sleep(3000);
        create1.click();
        Thread.sleep(3000);
        ldriver.quit();
    }



}
