package com.jotform.cucumber.steps;

import com.jotform.pages.HomePage;
import com.jotform.pages.SecurityPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HappyPathTest {
    @Given("^I am on happypath homepage$")
    public void iAmOnHappypathHomepage() {
    }

    @When("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String name)  {
       new HomePage().clickOnFirstname(name);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String last)  {
        new HomePage().clickOnLastName(last);

    }

    @And("^I click on next button on name page$")
    public void iClickOnNextButtonOnNamePage() {
        new HomePage().clickOnNextButton1();
    }

    @And("^I select file to upload$")
    public void iSelectFileToUpload() {
        new HomePage().uploadFile();
    }

    @And("^I click on next button on file upload page$")
    public void iClickOnNextButtonOnFileUploadPage() {
    new  HomePage().clickOnNextButton2();
    }

    @And("^I send signature\"([^\"]*)\"$")
    public void iSendSignature(String sign)  {
        new HomePage().sendSignature();
    }

    @And("^I click on next button on signature page$")
    public void iClickOnNextButtonOnSignaturePage() {
        new HomePage().setClickOnnextButton3();

    }

    @And("^I enter date$")
    public void iEnterDate() {
        new HomePage().selectDate();
    }

    @And("^I click on next button on date$")
    public void iClickOnNextButtonOnDate() {
    new HomePage().clickOnnext();
    }

    @And("^I select security question \"([^\"]*)\"$")
    public void iSelectSecurityQuestion(int value)  {
     new SecurityPage().selectsecurity(value);
    }

    @And("^I enter answer of security question \"([^\"]*)\"$")
    public void iEnterAnswerOfSecurityQuestion(String ans)  {
     new SecurityPage().selectAnswer(ans);
    }

    @And("^I click on next button on security question page$")
    public void iClickOnNextButtonOnSecurityQuestionPage() {
    new SecurityPage().clickOnSubmitButton();
    }

    @And("^I click on next$")
    public void iClickOnNext() {
        new SecurityPage().clickOnNext();
    }

    @And("^I select submit$")
    public void iSelectSubmit() {
        new SecurityPage().selectSubmit1();
    }

    @Then("^I should see successful submission message \"([^\"]*)\"$")
    public void iShouldSeeSuccessfulSubmissionMessage(String arg0)  {
      new HomePage().getYoursubmissionreceivedText();
    }

    @And("^I select date$")
    public void iSelectDate() {
        new HomePage().clickOnDate();
    }
}
