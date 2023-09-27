package com.open_mrs.stepdef;

import com.open_mrs.page.FindPatientPage;
import com.open_mrs.page.HomePage;
import com.open_mrs.page.LoginPage;
import com.open_mrs.page.RegisterPatientPage;
import com.utils.DriverHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class FindPatientStepDef {

    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginpage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    RegisterPatientPage register = new RegisterPatientPage(driver);

    FindPatientPage find=new FindPatientPage(driver);


    @Then("user clicks homepage , find patient , search for id and validates the id is unique , {string}")
    public void userClicksHomepageFindPatientSearchForIdAndValidatesTheIdIsUnique(String expectedMessage) throws InterruptedException {
        Assert.assertTrue(find.validateIdIsUnique(driver).contains(expectedMessage));
    }

    // sabina's step
    @And("user provides the id {string}")
    public void userProvidesTheId(String id ) {
        find.searchForPatient(id);}

    @And("user searches for {string}")
    public void userSearchesForUNKNOWN(String idOrName) {
        find.searchForPatientAndEnter(idOrName);

    }

    @Then("user validates the id is unique , {string}")
    public void userValidatesTheIdIsUniqueShowingTo(String expectedMessage) throws InterruptedException {
        Assert.assertTrue(find.validateTheId().contains(expectedMessage));

    }
}
