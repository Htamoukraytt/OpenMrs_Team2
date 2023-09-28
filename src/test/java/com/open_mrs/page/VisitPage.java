package com.open_mrs.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class VisitPage {

    public VisitPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[@id='coreapps-showContactInfo']")
    WebElement contactInfo;

    @FindBy(xpath = "//a[@class='button task activelist'][1]")
    WebElement endVisit;

    @FindBy(xpath = "//input[@id='merge-button']")
    WebElement MergeIntoAnotherPatient;

    @FindBy(xpath = "//span[contains(text(),' Actions ')]")
    WebElement Actions;


    @FindBy(xpath = "//a[@class='button task activelist'][2]")
    WebElement visitNote;

    @FindBy(xpath = "//a[@class='button task activelist'][3]")
    WebElement  admitToInpatient;

    @FindBy(xpath = "//a[@class='button task activelist'][4]")
    WebElement   captureVitals;

    @FindBy(xpath = "//a[@class='button task activelist'][5]")
    WebElement   attachments;

    @FindBy(xpath = "//a[contains(text(),'Add Past Visit')]")
    WebElement addPastVisit;

    @FindBy(xpath = "//span[@id='retrospectiveVisitStartDate-wrapper']//span[@class='add-on']//i[@class='icon-calendar small']")
    WebElement calenderIcon;

    @FindBy(xpath = "/html/body/div[2]/div[3]/table/thead/tr[1]/th[2]")
    WebElement september;

    @FindBy(xpath = "/html/body/div[2]/div[3]/table/tbody/tr[4]/td[7]")
    WebElement dayOfMonth;

    //or second //div[2]//div[3]//table//tbody//tr//td[contains(text(),'23')]

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[3]/table[1]/tbody[1]/tr[2]/td[3]")
    WebElement dayOnCalender;

    @FindBy(xpath = "//div[@id='retrospective-visit-creation-dialog']//button[@class='confirm right'][normalize-space()='Confirm']")
    WebElement confirmDateButton;

    @FindBy(xpath = "//span[@class='PersonName-givenName']")
    WebElement patientName;


    public void validateContactInfo(){
        Assert.assertTrue(contactInfo.isDisplayed()&& contactInfo.isEnabled());
    }
    public void validateMergeIntoAnotherPatient(){
        Assert.assertTrue(MergeIntoAnotherPatient.isDisplayed()&& MergeIntoAnotherPatient.isEnabled());
    }
    public void validateActions(){
        Assert.assertTrue(Actions.isDisplayed()&& Actions.isEnabled());
    }
    public void validateEndVisit(){
        Assert.assertTrue(endVisit.isDisplayed()&& endVisit.isEnabled());
    }
    public void validateVisitNotes(){
        Assert.assertTrue(visitNote.isDisplayed()&& visitNote.isEnabled());
    }
    public void validateAdmitPatient(){
        Assert.assertTrue(admitToInpatient.isDisplayed()&& admitToInpatient.isEnabled());
    }
    public void validateCaptureVitals(){
        Assert.assertTrue(captureVitals.isDisplayed()&& captureVitals.isEnabled());
    }
    public void validateAttachments(){
        Assert.assertTrue(attachments.isDisplayed()&& attachments.isEnabled());
    }

    public void setAddPastVisit(){
        Actions.click();
        addPastVisit.click();
    }


//    public void setCalender(){
//        calenderIcon.click();
//        String month = "September";
//        String day = "23";
//
//        while (true){
//            september.getText();
//            if (september.equals(month)){
//                september.click();
//                break;
//            }
//        }
//
//        while(true){
//            dayOfMonth.getText();
//            if (dayOfMonth.equals(day)){
//                dayOfMonth.click();
//                break;
//            }
//        }

//    }


public void setCalender2() throws InterruptedException {
        dayOnCalender.click();
        confirmDateButton.click();
        Thread.sleep(2000);
}
public void clickFirsName() throws InterruptedException {
        patientName.click();
        Thread.sleep(2000);

}







}
