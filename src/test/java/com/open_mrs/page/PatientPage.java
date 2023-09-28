package com.open_mrs.page;

import com.utils.BrowsersUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientPage {

    public PatientPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(text(),' Start Visit')]")
    WebElement startVisitButton;

    @FindBy(xpath = "//button[@id='start-visit-with-visittype-confirm']")
    WebElement confirmButton;

    @FindBy(xpath = "//div[@id='end-visit-dialog']//button[@class='confirm right'][normalize-space()='Yes']")
    WebElement confirmForEndVisit;

@FindBy(xpath = "//ul[@class='float-left d-none d-lg-block']//div[@class='col-11 col-lg-10'][normalize-space()='End Visit']")
WebElement endButton;



    public void setStartVisit(){
        try{
        if(BrowsersUtils.getText(startVisitButton).contains("Start")){
            startVisitButton.click();
            confirmButton.click();
            Thread.sleep(2000);
        }else if (BrowsersUtils.getText(endButton).contains("End")){
            endButton.click();
            confirmForEndVisit.click();
            Thread.sleep(2000);
            startVisitButton.click();
            confirmButton.click();
        }}catch (Exception E){

            System.out.println("start/End visit Level ");
        }

    }


public void endVisit(){
        endButton.click();
        confirmForEndVisit.click();
}






}
