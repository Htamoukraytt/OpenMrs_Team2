package com.open_mrs.stepdef;

import com.utils.BrowsersUtils;
import com.utils.ConfigReader;
import com.utils.DriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class hookClass {

     WebDriver driver;

      @Before
      public void setup(){
          driver= DriverHelper.getDriver();
      }



      @After
    public void tearDown(Scenario scenario){
         BrowsersUtils.getScreenShotWithCucumber(driver,scenario);
          //driver.quit();
      }









}
