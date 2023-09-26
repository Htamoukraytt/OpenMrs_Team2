package com.open_mrs.page;

import com.utils.BrowsersUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FindPatientPage {

    // constructor
    public FindPatientPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    // elements from Register page
    @FindBy(xpath = "//div[@class='float-sm-right']//span")
    WebElement customerID;

    @FindBy(xpath = "//div[@class='logo']")
    WebElement homePage;
    @FindBy(xpath ="//a[@type='button'][1]")
    WebElement  FindPatientRecord;

    // elements for this page
    @FindBy(xpath ="//input[@id='patient-search']")
    WebElement patient_search;


    @FindBy(xpath = "//div[@class='dataTables_info']")
    WebElement idResult;










    // METHOD TO VALIDATE THAT THE USER IS UNIQUE AFTER WE REGISTER SUCCESSFULLY

    public String validateIdIsUnique(WebDriver driver) throws InterruptedException {
        // storing id
        String id= BrowsersUtils.getText(customerID);

        homePage.click();     // going to home page
        Thread.sleep(500);

        FindPatientRecord.click();   // clicking this feature to look up our id we stored
        Thread.sleep(500);


         patient_search.sendKeys(id);   // used our stored id


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));  // waiting for result how many id
        wait.until(ExpectedConditions.visibilityOf(idResult));



       return      BrowsersUtils.getText(idResult);  // returning the actual message

    }



    // ulan method

    public void searchForPatient(String nameOrId){
       patient_search.sendKeys(nameOrId,Keys.ENTER);
    }

}
