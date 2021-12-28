package com.jotform.pages;

import com.jotform.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.xpath;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='jfCard-welcome-start']")
    WebElement nextButton;

    @CacheLookup
    @FindBy(css = "#first_3")
    WebElement firstName;

    @CacheLookup
    @FindBy(css = "#last_3")
    WebElement lastName;

    @CacheLookup
    @FindBy(css = "#form-pagebreak-next_5")
     WebElement nextButton1;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Browse Files')]")
    WebElement browseFiles;
    @CacheLookup
    @FindBy(css = "#form-pagebreak-next_4")
    WebElement nextButton2;
     @CacheLookup
     @FindBy(xpath = "//canvas[@aria-label='E-Signature Field']")
     WebElement signature;
     @CacheLookup
     @FindBy(css = "#form-pagebreak-next_8")
     WebElement nextButton3;

     @CacheLookup
     @FindBy(xpath = "//img[@id='input_9_pick']")
     WebElement date;
     @CacheLookup
     @FindBy(xpath = "//td[contains(text(),'23')]")
     WebElement clickdate;

     @CacheLookup
     @FindBy(css = "#form-pagebreak-next_10")
     WebElement nextButton4;



     @CacheLookup
     @FindBy(xpath = "//p[contains(text(),'Your submission has been received.')]")
     WebElement verifyText;
public void clickOnNextButton(){
    clickOnElement(nextButton);
    log.info("clicking on nextbutton " + nextButton.toString() + "<br>");

}
public void clickOnFirstname(String name){
    sendTextToElement(firstName,name);
    log.info("Enter First Name " + firstName.toString() + "<br>");
}
public void clickOnLastName(String name){
    sendTextToElement(lastName,name);
    log.info("Enter last Name " + lastName.toString() + "<br>");
}
public void clickOnBrowsefile(){
    clickOnElement(browseFiles);
}
    public void clickOnNextButton1(){
        clickOnElement(nextButton1);
        log.info("Click On NextButton " + nextButton1.toString() + "<br>");
    }
    public void clickOnNextButton2(){
        clickOnElement(nextButton2);
        log.info("Click On NextButton2 " + nextButton2.toString() + "<br>");
    }
    public void sendSignature(){
        Actions a = new Actions(driver);
        Action b = a.moveToElement(signature).clickAndHold().moveToElement(signature,-50,-30)
                .moveByOffset(-30,-50).moveByOffset(50,40)
                .moveByOffset(-20,60).moveByOffset(30,-30).release(signature).build();
        b.perform();

    }
    public void setClickOnnextButton3(){
    clickOnElement(nextButton3);
        log.info("Click On NextButton3 " + nextButton3.toString() + "<br>");
    }
  public void selectDate(){
    clickOnElement(date);
      log.info("Click On date " + date.toString() + "<br>");
  }
  public void clickOnDate(){
    clickOnElement(clickdate);
      log.info("Click On Select date " + clickdate.toString() + "<br>");
  }
  public void clickOnnext(){
    clickOnElement(nextButton4);
      log.info("Click On NextButton4 " + nextButton4.toString() + "<br>");
  }
    public String getYoursubmissionreceivedText() {
        String message = getTextFromElement(verifyText);
        return message;
    }

    public void uploadFile() {
    WebElement add = driver.findElement(xpath("//input[@id='input_6']"));
       add.sendKeys("C:\\Users\\Toshiba\\Desktop\\file.txt");
           }


}
