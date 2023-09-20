package com.open_mrs.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //elements:
    @FindBy(xpath = "//a[contains(@id,'register')]")
    private WebElement registerAPatient;


    //methods for navigating to each page:
    public void clickRegisterPatient(){
        registerAPatient.click();
    }

}
