package com.nfc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Users {
    public WebDriver ldriver;
    public Users(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "/html/body/div[2]/button/div")
    @CacheLookup
    WebElement menu ;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/button[1]/p[1]")
    @CacheLookup
    WebElement menuCancel ;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
    @CacheLookup
    WebElement user ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/input[1]")
    @CacheLookup
    WebElement Field1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[2]/input[1]")
    @CacheLookup
    WebElement Field2;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/button[1]")
    @CacheLookup
    WebElement btn1;
    public void clickUser() throws InterruptedException {
        Field1.sendKeys("akshaydafade@peppersquare.com");
        Thread.sleep(2000);
        Field2.sendKeys("Reset$123");
        Thread.sleep(2000);
        btn1.click();
        Thread.sleep(5000);
        menu.click();
        Thread.sleep(2000);
        user.click();
        Thread.sleep(2000);
    }
    @FindBy(xpath = "/html/body/main/section/div/div/div/div/qwik-react/div/div[1]/table/tbody/tr[1]/td[1]/span/input")
    @CacheLookup
    WebElement chkbox ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/qwik-react[1]/div[1]/div[2]/div[1]/button[2]")
    @CacheLookup
    WebElement delete ;
    public void selectCheckBox() throws InterruptedException {
        chkbox.click();
        Thread.sleep(2000);
        delete.click();
        Thread.sleep(4000);
    }
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/qwik-react[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/button[1]")

    @CacheLookup
    WebElement show ;
    public void clickShow() throws InterruptedException {
        show.click();
        Thread.sleep(3000);
    }
    @FindBy(xpath = "/html/body/main/section/div/div/div/div/div/div[2]/div[1]/input")
    @CacheLookup
    WebElement search ;
    public void sendSearch() throws InterruptedException {
        search.sendKeys("swadhin");
        Thread.sleep(2000);
        WebElement ele = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div[1]/input"));
        ele.clear();
        ldriver.navigate().refresh();
        Thread.sleep(5000);
    }
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]")
    @CacheLookup
    WebElement dateJoined ;
    public void clickDate() throws InterruptedException {
        dateJoined.click();
        Thread.sleep(2000);


        String year = "2019";
        String month = "may";
        String date = "10";
        while (true) {
            String monthYear = ldriver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[1]/div[2]/div/div[1]/div/button[2]")).getText();
            String arr[] = monthYear.split(" ");
            String mon = arr[0];
            String yr = arr[1];
            if (mon.equalsIgnoreCase(month) && yr.equals(year))
                break;
            else
                ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
        }
        List<WebElement> allDates = ldriver.findElements(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div/div"));
        for (WebElement ele : allDates) {
            String dt = ele.getText();
            if (dt.equals(date)) {
                ele.click();
                break;
            }
        }
        Thread.sleep(10000);
    }
    public void clickDate2() throws InterruptedException {
        String year1 = "2022";
        String month1 = "apr";
        String date1 = "20";
        while(true){
            String data = ldriver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[1]/div[2]/div/div[1]/div/button[2]")).getText();
            String arr[] = data.split(" ");
            String mon = arr[0];
            String yr = arr[1];
            if (mon.equalsIgnoreCase(month1) && yr.equals(year1))
                break;
            else
                ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[3]")).click();
        }
        List<WebElement> allDates1 = ldriver.findElements(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div/div"));
        for(WebElement ele1: allDates1){
            String dt1 = ele1.getText();
            if(dt1.equals(date1)){
                ele1.click();
                break;
            }
        }
        Thread.sleep(3000);
        WebElement ele = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]"));
        ele.click();
        Thread.sleep(2000);
        WebElement dateJoin = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]"));
        dateJoin.click();
        Thread.sleep(1000);
        WebElement today = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]"));
        today.click();
        Thread.sleep(2000);
        WebElement dateJoin1 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]"));
        dateJoin1.click();
        Thread.sleep(2000);
        WebElement pastSeven = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]"));
        pastSeven.click();
        Thread.sleep(2000);
        WebElement dateJoin2 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]"));
        dateJoin2.click();
        Thread.sleep(2000);
        WebElement thisMonth = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]"));
        thisMonth.click();
        Thread.sleep(2000);
        WebElement dateJoin3 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]"));
        dateJoin3.click();
        Thread.sleep(2000);
        WebElement thisYear = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/button[1]"));
        thisYear.click();
        Thread.sleep(2000);
        WebElement can = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[1]/div[1]/div[2]/span[1]"));
        can.click();
        Thread.sleep(2000);
    }
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/qwik-react[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]")
    @CacheLookup
    WebElement clickRow ;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[3]/ul[1]/li[2]")
    @CacheLookup
    WebElement clickRow1 ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/qwik-react[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]")
    @CacheLookup
    WebElement clickRow2 ;
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[3]/ul[1]/li[3]")
    @CacheLookup
    WebElement clickRow3 ;
    public void scroll() throws InterruptedException {
        clickRow.click();
        Thread.sleep(2000);
        clickRow1.click();
        Thread.sleep(2000);
        clickRow2.click();
        Thread.sleep(2000);
        clickRow3.click();
        Thread.sleep(2000);

        // Scrolling down the page till the element is found
        JavascriptExecutor js = ((JavascriptExecutor) ldriver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    public void clickExport() throws InterruptedException {
        WebElement expAll = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/qwik-react[1]/div[1]/div[2]/div[1]/button[1]"));
        expAll.click();
        Thread.sleep(3000);
        for(int i=1;i<=5;i++){
            String ele = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/qwik-react[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[1]/span[1]/input[1]";
            WebElement ele2 = ldriver.findElement(By.xpath(ele));
            ele2.click();
            Thread.sleep(1000);
        }
        Thread.sleep(3000);
        WebElement expSelected = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/qwik-react[1]/div[1]/div[2]/div[1]/button[1]"));
        expSelected.click();
        Thread.sleep(2000);
        for(int i=5;i>=1;i--){
            String ele3 = "/html/body/main/section/div/div/div/div/qwik-react/div/div[1]/table/tbody/tr["+i+"]/td[1]/span/input";
            WebElement ele4 = ldriver.findElement(By.xpath(ele3));
            ele4.click();
            Thread.sleep(1000);
        }
        Thread.sleep(3000);

    }
    public void clickFilters() throws InterruptedException {
        WebElement filter = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div[2]"));
        filter.click();
        Thread.sleep(4000);
        WebElement cityF = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div[2]/div[2]/div[1]"));
        cityF.click();
        Thread.sleep(4000);
        List<WebElement> allElement = ldriver.findElements(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/p"));
        for(WebElement ele : allElement){
            if(ele.getText().equals("Albany, NY")){
                ele.click();
                break;
            }
        }
        Thread.sleep(3000);
        cityF.click();
        Thread.sleep(2000);
        WebElement all1 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/p[1]"));
        all1.click();
        Thread.sleep(4000);



        WebElement stateF = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]"));
        stateF.click();
        Thread.sleep(4000);
        List<WebElement> allElement2 = ldriver.findElements(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/p"));
        for(WebElement ele2 : allElement2){
            if(ele2.getText().equals("California")){
                ele2.click();
                break;
            }
        }
        Thread.sleep(3000);
        stateF.click();
        Thread.sleep(2000);
        WebElement all2 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/p[1]"));
        all2.click();
        Thread.sleep(4000);



        WebElement genderF = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div[2]/div[2]/div[3]"));
        genderF.click();
        Thread.sleep(4000);
        List<WebElement> allElement3 = ldriver.findElements(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/p"));
        for(WebElement ele3 : allElement3){
            if(ele3.getText().equals("male")){
                ele3.click();
                break;
            }
        }
        Thread.sleep(3000);
        genderF.click();
        Thread.sleep(2000);
        WebElement all3 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/p[1]"));
        all3.click();
        Thread.sleep(4000);


        WebElement ageF = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div[2]/div[2]/div[4]"));
        ageF.click();
        Thread.sleep(2000);
        List<WebElement> allElement4 = ldriver.findElements(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/div[2]/p"));
        for(WebElement ele4 : allElement4){
            if(ele4.getText().equals("18-29")){
                ele4.click();
                break;
            }
        }
        Thread.sleep(3000);
        ageF.click();
        Thread.sleep(2000);
        WebElement all4 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/div[2]/p[1]"));
        all4.click();
        Thread.sleep(4000);


        WebElement fi = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div[2]/input"));
        fi.click();
        Thread.sleep(2000);
    }
    public void clickFilters2() throws InterruptedException {
        WebElement filter = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div[2]"));
        filter.click();
        Thread.sleep(4000);
        WebElement cityF = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div[2]/div[2]/div[1]"));
        cityF.click();
        Thread.sleep(4000);
        List<WebElement> allElement = ldriver.findElements(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/p"));
        for(WebElement ele : allElement){
            if(ele.getText().equals("Albany, NY")){
                ele.click();
                break;
            }
        }
        Thread.sleep(3000);


//        WebElement filter2 = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div[2]"));
//        filter2.click();
//        Thread.sleep(4000);
        WebElement stateF = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]"));
        stateF.click();
        Thread.sleep(4000);
        List<WebElement> allElement2 = ldriver.findElements(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/p"));
        for(WebElement ele2 : allElement2){
            if(ele2.getText().equals("California")){
                ele2.click();
                break;
            }
        }
        Thread.sleep(3000);

//        WebElement filter3 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]"));
//        filter3.click();
//        Thread.sleep(6000);
        WebElement genderF = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div[2]/div[2]/div[3]"));
        genderF.click();
        Thread.sleep(4000);
        List<WebElement> allElement3 = ldriver.findElements(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/p"));
        for(WebElement ele3 : allElement3){
            if(ele3.getText().equals("male")){
                ele3.click();
                break;
            }
        }
        Thread.sleep(3000);

//        WebElement filter4 = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]"));
//        filter4.click();
//        Thread.sleep(2000);
        WebElement ageF = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div[2]/div[2]/div[4]"));
        ageF.click();
        Thread.sleep(2000);
        List<WebElement> allElement4 = ldriver.findElements(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/div[2]/p"));
        for(WebElement ele4 : allElement4){
            if(ele4.getText().equals("18-29")){
                ele4.click();
                break;
            }
        }
        Thread.sleep(3000);
        WebElement fi = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div/div/div[2]/div[2]/input"));
        fi.click();
        Thread.sleep(2000);
        ldriver.quit();

    }

}
