package com.open_mrs.stepdef;

import com.open_mrs.page.MainPage;
import com.open_mrs.page.RegisterAPatient_Page;
import com.utils.DriverHelper;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class RegisterAPatient_StepDef {
    WebDriver driver= DriverHelper.getDriver();
    MainPage mainPage=new MainPage(driver);
    RegisterAPatient_Page registerAPatientPage=new RegisterAPatient_Page(driver);

    @Then("user navigates to the Register a patient page")
    public void user_navigates_to_the_register_a_patient_page() {
       mainPage.clickRegisterPatient();
    }
    @When("user checks the Unidentified patient box")
    public void user_checks_the_unidentified_patient_box() {
    registerAPatientPage.checkUndefinedPatientBox();
    }
    @Then("user chooses the gender from dropdown box and clicks the next step button")
    public void user_chooses_the_gender_from_dropdown_box_and_clicks_the_next_step_button() {
        registerAPatientPage.selectGender("Female");
        registerAPatientPage.clickNextButton();

    }
    @Then("user clicks the confirm button")
    public void user_clicks_the_confirm_button() {
       registerAPatientPage.clickConfirmButton();
    }
    @Then("user validates patient's firstName and lastName are both UNKNOWN")
    public void user_validates_patient_s_first_name_and_last_name_are_both_unknown() {
    registerAPatientPage.validatePatientName("UNKNOWN","UNKNOWN");
    }

}
