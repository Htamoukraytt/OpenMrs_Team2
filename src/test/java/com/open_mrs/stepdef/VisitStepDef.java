package com.open_mrs.stepdef;

import com.open_mrs.page.LoginPage;
import com.open_mrs.page.PatientPage;
import com.open_mrs.page.VisitPage;
import com.utils.DriverHelper;
import org.openqa.selenium.WebDriver;

public class VisitStepDef {


    WebDriver driver = DriverHelper.getDriver();
LoginPage logIn= new LoginPage(driver);
PatientPage patientPage= new PatientPage(driver);
VisitPage visitPage= new VisitPage(driver);




























}
