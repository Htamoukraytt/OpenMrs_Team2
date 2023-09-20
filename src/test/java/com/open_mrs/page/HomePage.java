package com.open_mrs.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath ="(//a[@type='button'][1]")
    WebElement  FindPatientRecord;

    @FindBy(xpath ="//a[@type='button'][2]")
    WebElement     ActiveVisits;

    @FindBy(xpath ="//a[@type='button'][3]")
    WebElement  CaptureVitals;

    @FindBy(xpath ="//a[@type='button'][4]")
    WebElement  Register_a_patient;

    @FindBy(xpath ="//a[@type='button'][5]")
    WebElement  AppointmentScheduling;

    @FindBy(xpath ="(//a[@type='button'][6]")
    WebElement  Reports;

    @FindBy(xpath ="//a[@type='button'][7]")
    WebElement  DataManagement;

    @FindBy(xpath ="//a[@type='button'][8]")
    WebElement   ConfigureMetadata;


    @FindBy(xpath ="//a[@type='button'][9]")
    WebElement   SystemAdministration;





    public void chooseHomeFeature(String option){

        switch (option){

            case "Find Patient Record" :  FindPatientRecord.click();     ;break;

            case "ActiveVisits" : ActiveVisits.click(); break;

            case "Capture Vitals" :  CaptureVitals.click(); break;

            case "Register a patient" : Register_a_patient.click(); break;

            case "Appointment Scheduling" :  AppointmentScheduling.click(); break;

            case "Reports" :  Reports.click(); break;

            case "Data Management" :  DataManagement.click(); break;

            case "Configure Metadata" :  ConfigureMetadata.click(); break;


            case "System Administration" : SystemAdministration.click(); break;


            default:
                System.out.println("WRONG HOME FEATURE!");
                Assert.assertTrue(false); break;


        }



    }







}
