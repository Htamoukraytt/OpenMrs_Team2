package com.open_mrs.stepdef;

import com.open_mrs.page.HomePage;
import com.open_mrs.page.LoginPage;
import com.open_mrs.page.RegisterPatientPage;
import com.utils.DriverHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class RegisterStepDef {


    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginpage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    RegisterPatientPage register = new RegisterPatientPage(driver);

    @And("user provides correct info   givenName, {string}, FamilyName  , {string},")
    public void userProvidesCorrectInfoGivenNameFamilyName(String givenName, String familyName) {
        register.insertFullName(givenName, familyName);
    }

    @And("user clicks next")
    public void userClicksNext() {
        register.clickNext();
    }

    @And("user chooses gender , Male or Female {string}")
    public void userChoosesGenderMaleOrFemaleM(String gender) throws InterruptedException {
        register.insertGender(gender);
    }

    @And("user provides birth date , {string} , {string} , {string}")
    public void userProvidesBirthDateMay(String day, String month, String year) throws InterruptedException {

        register.insertBirthDate(day, month, year);

    }


    @And("user provides address , {string} , {string} , {string} , {string}  , {string}")
    public void userProvidesAddressStreetAddressCityIlUsa(String address, String city, String state, String country, String postCode) throws InterruptedException {
    register.insertAddressInfo(address,city,state,country,postCode);
    }

    @And("user provides phone number {string}")
    public void userProvidesPhoneNumber(String phoneNumber) throws InterruptedException {
      register.insertPhoneNumber(phoneNumber);
    }

    @And("user clicks confirm")
    public void userClicksConfirm() throws InterruptedException {
        register.clickConfirm();

    }


}
