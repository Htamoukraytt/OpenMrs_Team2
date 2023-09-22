package com.open_mrs.page;

import com.utils.BrowsersUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPatientPage {


     // constructor
    public RegisterPatientPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    // home features/elements
    @FindBy(name = "givenName")
    WebElement  givenNameInput;
    @FindBy(name = "familyName")
    WebElement familyName;

    @FindBy(xpath = "//option[@value='M']")
    WebElement maleOption;
    @FindBy(xpath = "//option[@value='F']")
    WebElement femaleOption;
    @FindBy(name = "birthdateDay")
    WebElement birthdateDay;
    @FindBy(xpath = "//select[@id='birthdateMonth-field']")  // select
    WebElement birthdateMonthField;
    @FindBy(name = "birthdateYear")
    WebElement birthdateYear;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement address1;
    @FindBy(xpath = "//input[@id='cityVillage']")
    WebElement  cityVillage;

    @FindBy(xpath = "//input[@id='stateProvince']")
    WebElement stateProvince;
    @FindBy(xpath = "//input[@id='country']")
    WebElement country;
    @FindBy(xpath ="//input[@id='postalCode']")
    WebElement postalCode;

     @FindBy(name ="phoneNumber")
     WebElement phoneNumber;


    // next Button
    @FindBy(xpath= "//button[@id='next-button']")
    WebElement nextButton;

    @FindBy(xpath = "//input[contains(@class,'confirm')]")
    WebElement confirmButton;

    @FindBy(xpath = "//div[@class='float-sm-right']//span")
    WebElement customerID;

     // Home Page
    @FindBy(xpath = "//div[@class='logo']")
    WebElement homePage;

            //  vivian elements:
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement undefinedPatientBox;
    @FindBy(xpath = "//select[@name='gender']")
    private  WebElement genderOptions;
//    @FindBy(css = "#next-button")        DUPLICATED
//    private WebElement nextButton;
//    @FindBy(css = "#submit")             DUPLICATED
//    private WebElement confirmButton;
    @FindBy(css = ".PersonName-givenName")
    private  WebElement givenName;
     @FindBy(css = ".PersonName-familyName")
    private WebElement familyName1;




           // HICHAM'S METHOD

    // method for name and familyName
    public void insertFullName(String givenName , String lastName){
        givenNameInput.sendKeys(givenName);
        familyName.sendKeys(lastName);
    }


    // method for next button
    public void clickNext(){
        nextButton.click();
    }


    // insert Gender
    public void insertGender(String option) throws InterruptedException {
        switch (option){

            case "M":   maleOption.click();  break;
            case "F": femaleOption.click(); break;
            default:
                System.out.println("wrong gender !"); break;
        }
        Thread.sleep(500);
    }


    // method for birth date

    public void insertBirthDate(String day , String month , String year) throws InterruptedException {
        birthdateDay.sendKeys(day);
        birthdateMonthField.sendKeys(month);
        birthdateYear.sendKeys(year);
        Thread.sleep(500);
    }



    // method for address
    public void insertAddressInfo(String street, String city , String state , String country1 ,String postalCode1) throws InterruptedException {

        address1.sendKeys(street);
        cityVillage.sendKeys(city);
        stateProvince.sendKeys(state);
        country.sendKeys(country1);
        postalCode.sendKeys(postalCode1);

        Thread.sleep(500);

    }

   // method for phone number

    public void insertPhoneNumber(String phoneNumber1) throws InterruptedException {
        phoneNumber.sendKeys(phoneNumber1);
        Thread.sleep(500);
    }


     // method click confirm
    public void clickConfirm() throws InterruptedException {
         confirmButton.click();
         Thread.sleep(500);
    }


                     // VIVIAN methods:
    public void checkUndefinedPatientBox(){
        undefinedPatientBox.click();
    }
    public void validatePatientName(String firstName, String lastName){
        Assert.assertEquals(firstName,BrowsersUtils.getText(givenName));
        Assert.assertEquals(lastName, BrowsersUtils.getText(familyName1)); // unknown
    }

}
