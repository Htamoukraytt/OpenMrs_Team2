package com.open_mrs.page;

import com.utils.BrowsersUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAPatient_Page {
    public RegisterAPatient_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    //elements:
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement undefinedPatientBox;
    @FindBy(xpath = "//select[@name='gender']")
    private  WebElement genderOptions;
    @FindBy(css = "#next-button")
    private WebElement nextButton;
    @FindBy(css = "#submit")
    private WebElement confirmButton;
    @FindBy(css = ".PersonName-givenName")
    private  WebElement givenName;
    @FindBy(css = ".PersonName-familyName")
    private WebElement familyName;


    //methods:
    public void checkUndefinedPatientBox(){
        undefinedPatientBox.click();
    }
    public void selectGender(String gender){
        BrowsersUtils.selectBy(genderOptions,gender,"text");
    }
    public void clickNextButton(){
        nextButton.click();
    }
    public void clickConfirmButton(){
        confirmButton.click();
    }
    public void validatePatientName(String firstName, String lastName){
        Assert.assertEquals(firstName,BrowsersUtils.getText(givenName));
        Assert.assertEquals(lastName,BrowsersUtils.getText(familyName));
    }












}
