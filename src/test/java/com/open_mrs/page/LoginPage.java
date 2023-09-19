package com.open_mrs.page;

import com.utils.BrowsersUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {


    // HICHAM BRANCH
 /*
     THIS IS MY BRANCH PLEAS DO NOT TOUCH
     THANK YOU



  */




  // Cons
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    // elements
    @FindBy(xpath = "//input[@id='username']")
    WebElement  userNameInput;
    @FindBy(xpath = "//input[@id='password']")
    WebElement  passWordInput;

   // locations
    @FindBy(xpath = "//li[@id='Inpatient Ward']")
    WebElement  InpatientWardOption;
    @FindBy(xpath = "//li[@id='Isolation Ward']")
    WebElement IsolationWardOption;
    @FindBy(xpath = "//li[@id='Laboratory']")
    WebElement  LaboratoryOption;
    @FindBy(xpath = "//li[@id='Outpatient Clinic']")
    WebElement  OutpatientClinicOption;
    @FindBy(xpath = "//li[@id='Pharmacy']")
    WebElement  PharmacyOption;
    @FindBy(xpath = "//li[@id='Registration Desk']")
    WebElement  RegistrationDeskOption;

    // LogIn
    @FindBy(xpath = "//input[@id='loginButton']")
    WebElement LogInButton;

    @FindBy(xpath = "//h4")
    WebElement actualLoginMessage;

     // error Message (negative)
     @FindBy(xpath = "//div[@id='error-message']")
     WebElement actualErrorMessage;





    // Method For happyPath LogIn
     public void positiveCredentials(String userName , String password){
         userNameInput.clear();
         userNameInput.sendKeys(userName);
         passWordInput.clear();
         passWordInput.sendKeys(password);
     }

   public void loginLocation(String location){
       switch (location){
           case "Inpatient Ward": InpatientWardOption.click();break;
           case "Laboratory": LaboratoryOption.click();break;
           case "Isolation Ward": IsolationWardOption.click();break;
           case "Outpatient Clinic": OutpatientClinicOption.click();break;
           case "Pharmacy": PharmacyOption.click();break;
           case "Registration Desk": RegistrationDeskOption.click();break;

           default:
               System.out.println("WRONG LOCATION!");
               Assert.assertTrue(false); break;
       }
   }

   public void clickLogin(){
       LogInButton.click();
   }

   public String ValidatePositiveLogin(WebDriver driver){
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
       wait.until(ExpectedConditions.visibilityOf(actualLoginMessage));

       return BrowsersUtils.getText(actualLoginMessage);
   }




    // negative login
    public void negativeCredentials(String userName , String password){
        userNameInput.clear();
        userNameInput.sendKeys(userName);
        passWordInput.clear();
        passWordInput.sendKeys(password);
    }

   public String validateNegativeLogin(WebDriver driver){
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
       wait.until(ExpectedConditions.visibilityOf(actualErrorMessage));

       return BrowsersUtils.getText(actualErrorMessage);

   }




}
