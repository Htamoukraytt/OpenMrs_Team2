package com.open_mrs.stepdef;

import com.open_mrs.page.LoginPage;
import com.utils.ConfigReader;
import com.utils.DriverHelper;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDef {

    // mustapha h
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginpage = new LoginPage(driver);



    @Given("user navigates to the application")
    public void userNavigatesToTheApplication() {
        driver.get(ConfigReader.readProperty("QA_OPEN-MRS_URL"));
    }

    @When("user provides correct credentials")
    public void user_provides_correct_credentials() {
        loginpage.positiveCredentials(ConfigReader.readProperty("QA_userName"), ConfigReader.readProperty("QA_password"));
    }

    @And("user chooses the location {string}")
    public void userChoosesTheLocationLocation(String location) {
        loginpage.loginLocation(location);
    }

    @When("user clicks Login")
    public void user_clicks_login() {
        loginpage.clickLogin();
    }

    @Then("user validates login was successfully {string}")
    public void user_validates_login_was_successfully(String expectedMessage) {
        Assert.assertEquals(expectedMessage, loginpage.ValidatePositiveLogin(driver));
    }



                          // negative

    @When("user provides wrong credentials {string} , {string}")
    public void userProvidesWrongCredentialsUserNamePassword(String userName , String password) {
        loginpage.negativeCredentials(userName,password);
    }


    @Then("user validates the login was not successfully {string}")
    public void userValidatesTheLoginWasNotSuccessfullyInvalidUsernamePasswordPleaseTryAgain(String errorMessage) {
        Assert.assertEquals(errorMessage,loginpage.validateNegativeLogin(driver));
    }
}
