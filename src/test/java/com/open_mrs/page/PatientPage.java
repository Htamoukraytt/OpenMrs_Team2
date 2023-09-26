package com.open_mrs.page;

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



    public void setStartVisit(){
        startVisitButton.click();
        confirmButton.click();
    }









}
