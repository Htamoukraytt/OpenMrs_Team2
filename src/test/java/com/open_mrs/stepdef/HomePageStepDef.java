package com.open_mrs.stepdef;

import com.open_mrs.page.HomePage;
import com.open_mrs.page.LoginPage;
import com.utils.DriverHelper;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class HomePageStepDef {



    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginpage = new LoginPage(driver);
    HomePage homePage=new HomePage(driver);





    @And("user chooses from home features {string}")
    public void userChoosesFromHomeFeaturesRegisterAPatient(String option) {
         homePage.chooseHomeFeature(option);
    }


}
