package com.nfc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Movements {
    public WebDriver ldriver;

    public Movements(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "/html/body/div[2]/button/div")
    @CacheLookup
    WebElement menu ;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/button[1]/p[1]")
    @CacheLookup
    WebElement menuCancel ;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/ul[1]/li[6]/a[1]")
    @CacheLookup
    WebElement move ;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/input[1]")
    @CacheLookup
    WebElement Field1;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[2]/input[1]")
    @CacheLookup
    WebElement Field2;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/button[1]")
    @CacheLookup
    WebElement btn1;
    public void clickMovement() throws InterruptedException {
        Field1.sendKeys("akshaydafade@peppersquare.com");
        Thread.sleep(3000);
        Field2.sendKeys("Reset$123");
        Thread.sleep(3000);
        btn1.click();
        Thread.sleep(5000);
        menu.click();
        Thread.sleep(3000);
        move.click();
        Thread.sleep(3000);
    }
    public void createCategory() throws InterruptedException {
        WebElement createBtn = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
        createBtn.click();
        Thread.sleep(2000);
        WebElement catName = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        catName.sendKeys("Core");
        Thread.sleep(2000);
        WebElement catSerial = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]"));
        catSerial.sendKeys("1");
        Thread.sleep(2000);
        WebElement categoryIcon = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[3]/div/label/input"));
        categoryIcon.sendKeys("/Users/codeprismtechnologies/Downloads/Screenshot 2023-05-03 at 5.56.14 PM.png");
        Thread.sleep(4000);

        // Scrolling down the page till the element is found
        JavascriptExecutor js = ((JavascriptExecutor) ldriver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);

        WebElement categorySectionIcon = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[4]/div/label/input"));
        categorySectionIcon.sendKeys("/Users/codeprismtechnologies/Downloads/Screenshot 2023-05-03 at 5.56.00 PM.png");
        Thread.sleep(4000);

        // Scrolling down the page till the element is found
//        JavascriptExecutor js = ((JavascriptExecutor) ldriver);
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//        Thread.sleep(2000);

        WebElement Btn = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[5]/button[1]"));
        Btn.click();
        Thread.sleep(5000);
    }
    public void clickOneCategory() throws InterruptedException {
        WebElement clk = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        clk.click();
        Thread.sleep(3000);
    }
    public void createMovementVideo() throws InterruptedException {
        WebElement createMove = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[2]"));
        createMove.click();
        Thread.sleep(2000);
        WebElement moveTitle = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        moveTitle.sendKeys("PLANK");
        Thread.sleep(2000);
        WebElement level = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/qwik-react[1]/div[1]/div[1]/div[1]/div[1]"));
        level.click();
        Thread.sleep(2000);
        WebElement big = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[1]"));
        big.click();
        Thread.sleep(2000);
//        level.click();
//        Thread.sleep(2000);
//        WebElement inter = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[2]"));
//        inter.click();
//        Thread.sleep(2000);
//        level.click();
//        Thread.sleep(2000);
//        WebElement adv = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[3]"));
//        adv.click();
//        Thread.sleep(2000);
        //Thumbnail
        WebElement thumb = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[3]/div/label/input"));
        thumb.sendKeys("/Users/codeprismtechnologies/Downloads/download.jpeg");
        Thread.sleep(3000);

        // Scrolling down the page till the element is found
        JavascriptExecutor js = ((JavascriptExecutor) ldriver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);

        //Video
        WebElement vid = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[4]/div/label/input"));
        vid.sendKeys("/Users/codeprismtechnologies/Downloads/pexels-ketut-subiyanto-4812848-3840x2160-25fps.mp4");
        Thread.sleep(5000);
        //Video Thumbnail
        WebElement vidThumb = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[5]/div/label/input"));
        vidThumb.sendKeys("/Users/codeprismtechnologies/Downloads/istockphoto-1072395722-612x612.jpg");
        Thread.sleep(3000);
        WebElement btn = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[6]/button[1]"));
        btn.click();
        Thread.sleep(30000);

    }
    public void createMovementVideo2() throws InterruptedException {
        WebElement cor = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
        cor.click();
        Thread.sleep(3000);
        WebElement createMove = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[2]"));
        createMove.click();
        Thread.sleep(2000);
        WebElement moveTitle = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        moveTitle.sendKeys("GLUTE BRIDGE");
        Thread.sleep(2000);
        WebElement level = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/qwik-react[1]/div[1]/div[1]/div[1]/div[1]"));
        level.click();
        Thread.sleep(2000);
//        WebElement big = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[1]"));
//        big.click();
//        Thread.sleep(2000);
//        level.click();
//        Thread.sleep(2000);
        WebElement inter = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[2]"));
        inter.click();
        Thread.sleep(2000);
//        level.click();
//        Thread.sleep(2000);
//        WebElement adv = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[3]"));
//        adv.click();
//        Thread.sleep(2000);
        //Thumbnail
        WebElement thumb = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[3]/div/label/input"));
        thumb.sendKeys("/Users/codeprismtechnologies/Downloads/download.jpeg");
        Thread.sleep(3000);

        // Scrolling down the page till the element is found
        JavascriptExecutor js = ((JavascriptExecutor) ldriver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);

        //Video
        WebElement vid = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[4]/div/label/input"));
        vid.sendKeys("/Users/codeprismtechnologies/Downloads/pexels-ketut-subiyanto-4812848-3840x2160-25fps.mp4");
        Thread.sleep(5000);
        //Video Thumbnail
        WebElement vidThumb = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[5]/div/label/input"));
        vidThumb.sendKeys("/Users/codeprismtechnologies/Downloads/istockphoto-1072395722-612x612.jpg");
        Thread.sleep(3000);
        WebElement btn = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[6]/button[1]"));
        btn.click();
        Thread.sleep(30000);
    }
    public void createMovementVideo3() throws InterruptedException {
        WebElement cor = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
        cor.click();
        Thread.sleep(3000);
        WebElement createMove = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[2]"));
        createMove.click();
        Thread.sleep(2000);
        WebElement moveTitle = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        moveTitle.sendKeys("ALTERING KNEE\n" +
                "TUCK");
        Thread.sleep(2000);
        WebElement level = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/qwik-react[1]/div[1]/div[1]/div[1]/div[1]"));
        level.click();
        Thread.sleep(2000);
//        WebElement big = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[1]"));
//        big.click();
//        Thread.sleep(2000);
//        level.click();
//        Thread.sleep(2000);
//        WebElement inter = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[2]"));
//        inter.click();
//        Thread.sleep(2000);
//        level.click();
//        Thread.sleep(2000);
        WebElement adv = ldriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/ul[1]/li[3]"));
        adv.click();
        Thread.sleep(2000);
        //Thumbnail
        WebElement thumb = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[3]/div/label/input"));
        thumb.sendKeys("/Users/codeprismtechnologies/Downloads/download.jpeg");
        Thread.sleep(3000);

        // Scrolling down the page till the element is found
        JavascriptExecutor js = ((JavascriptExecutor) ldriver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);

        //Video
        WebElement vid = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[4]/div/label/input"));
        vid.sendKeys("/Users/codeprismtechnologies/Downloads/pexels-ketut-subiyanto-4812848-3840x2160-25fps.mp4");
        Thread.sleep(5000);
        //Video Thumbnail
        WebElement vidThumb = ldriver.findElement(By.xpath("/html/body/main/section/div/div/div/div[2]/div[5]/div/label/input"));
        vidThumb.sendKeys("/Users/codeprismtechnologies/Downloads/istockphoto-1072395722-612x612.jpg");
        Thread.sleep(3000);
        WebElement btn = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[6]/button[1]"));
        btn.click();
        Thread.sleep(30000);
    }
    public void updateMoveVideo() throws InterruptedException {
        WebElement cor = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        cor.click();
        Thread.sleep(2000);
        WebElement row = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]"));
        row.click();
        Thread.sleep(3000);
        WebElement moveTitle = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        moveTitle.clear();
        Thread.sleep(2000);
        moveTitle.sendKeys("Mountain Climb 2");
        Thread.sleep(2000);
        WebElement remove = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/button[1]"));
        remove.click();
        Thread.sleep(2000);
        WebElement insert = ldriver.findElement(By.xpath("//*[@id=\"dropzone-file\"]"));
        insert.sendKeys("/Users/codeprismtechnologies/Downloads/istockphoto-1072395722-612x612.jpg");
        Thread.sleep(3000);
        WebElement btn = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[6]/button[1]"));
        btn.click();
        Thread.sleep(5000);
    }
    public void deleteMoveVideo() throws InterruptedException {
        WebElement cor = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        cor.click();
        Thread.sleep(2000);
        WebElement chkBox = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/input[1]"));
        chkBox.click();
        Thread.sleep(2000);
        WebElement deleteBtn = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/qwik-react[1]/div[1]/div[2]/div[1]/button[2]"));
        deleteBtn.click();
        Thread.sleep(3000);
    }
    public void updateCategory() throws InterruptedException {
        WebElement cor = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        cor.click();
        Thread.sleep(2000);
        WebElement btn = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[3]"));
        btn.click();
        Thread.sleep(2000);
        WebElement serial = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]"));
        serial.clear();
        Thread.sleep(3000);
        serial.sendKeys("9");
        Thread.sleep(3000);
        WebElement updateCate = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[5]/button[1]"));
        updateCate.click();
        Thread.sleep(3000);
    }
    public void deleteCategory() throws InterruptedException {
//        WebElement cor = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
//        cor.click();
//        Thread.sleep(2000);
//        WebElement delBtn = ldriver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[4]"));
//        delBtn.click();
        Thread.sleep(3000);
    }

}
