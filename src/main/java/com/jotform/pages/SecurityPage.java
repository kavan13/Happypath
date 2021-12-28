package com.jotform.pages;

import com.jotform.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SecurityPage.class.getName());

    public SecurityPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='input_11']")////span[@class='jfDropdown-toggle']
    WebElement security;

    @FindBy(css = "#input_11")
    WebElement clickquestion;

    @FindBy(css = "#input_12")
    WebElement answer;

    @FindBy(css = "#form-pagebreak-next_13")
    WebElement submit;
    @FindBy(css = "#form-pagebreak-next_14")
    WebElement next12;

    @FindBy(xpath = "//button[@id='input_2']")
    WebElement submit1;

    public void selectsecurity(int value) {
        selectByIndexFromDropDown(security, value);
        log.info("Select security Question " + security.toString() + "<br>");
    }


    public void selectAnswer(String name) {
        sendTextToElement(answer, name);
        log.info("clicking on answer " + answer.toString() + "<br>");
    }

    public void clickOnSubmitButton() {
        clickOnElement(submit);
        log.info("clicking on Submit " + submit.toString() + "<br>");
    }

    public void clickOnNext() {
        clickOnElement(next12);
        log.info("clicking on nextbutton " + next12.toString() + "<br>");
    }
    public void selectSubmit1(){
        clickOnElement(submit1);
      //  log.info("clicking on Submit1 " + submit1.toString() + "<br>");
    }
}