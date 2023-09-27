package com.open_mrs.stepdef;

import com.open_mrs.page.LoginPage;
import com.open_mrs.page.PatientPage;
import com.open_mrs.page.VisitPage;
import com.utils.DriverHelper;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class VisitStepDef {


    WebDriver driver = DriverHelper.getDriver();
LoginPage logIn= new LoginPage(driver);
PatientPage patientPage= new PatientPage(driver);
VisitPage visitPage= new VisitPage(driver);



    @And("user clicks Start Visit")
    public void userClicksStartVisit() {
        patientPage.setStartVisit();
    }

    @Then("user validates show contact info button is visible and available")
    public void userValidatesShowContactInfoButtonIsVisibleAndAvailable() {
    visitPage.validateContactInfo();
    }


    @And("user validates Merge to another patient button is visible and available")
    public void userValidatesMergeToAnotherPatientButtonIsVisibleAndAvailable() {
        visitPage.validateMergeIntoAnotherPatient();
    }

    @And("user validates Actions button is visible and available")
    public void userValidatesActionsButtonIsVisibleAndAvailable() {
        visitPage.validateActions();
    }

    @And("user validates End visit button is visible and available")
    public void userValidatesEndVisitButtonIsVisibleAndAvailable() {
        visitPage.validateEndVisit();
    }

    @And("user validates Visit notes button is visible and available")
    public void userValidatesVisitNotesButtonIsVisibleAndAvailable() {
        visitPage.validateVisitNotes();
    }

    @And("user validates Admit patient button is visible and available")
    public void userValidatesAdmitPatientButtonIsVisibleAndAvailable() {
        visitPage.validateAdmitPatient();
    }

    @And("user validates Capture vitals button is visible and available")
    public void userValidatesCaptureVitalsButtonIsVisibleAndAvailable() {
        visitPage.validateCaptureVitals();
    }

    @And("user validates Attachments button is visible and available")
    public void userValidatesAttachmentsButtonIsVisibleAndAvailable() {
        visitPage.validateAttachments();
    }


//    @Then("user navigates to Actions and clicks Add past visit")
//    public void userNavigatesToActionsAndClicksAddPastVisit() {
//        visitPage.setAddPastVisit();
//    }
//
//    @And("user picks date and Confirms")
//    public void userPicksDateAndConfirms() throws InterruptedException {
//        visitPage.setCalender2();
//    }

    @Then("user clicks on Given name of patient")
    public void userClicksOnGivenNameOfPatient() throws InterruptedException {
        visitPage.clickFirsName();
    }



    @And("user clicks End Visit button")
    public void userClicksEndVisitButton() {
        patientPage.endVisit();
    }
}
