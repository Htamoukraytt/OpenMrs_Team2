package com.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverHelper {


    // encapsulation
    // special room ...  private room ( no body to see )
    // nobody can create object from it and manipulate
    private static WebDriver driver ;

    private  DriverHelper(){  // made the constructor private ==> nobody can create an object
        // and manipulate my driver from this class
    }


    //-
    // Method
    public static WebDriver getDriver(){
        if(driver==null || ((RemoteWebDriver)driver).getSessionId()==null){
           // String browser="chrome"; // **
               String  browser= System.getProperty("browser","chrome");
            switch (browser){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            // driver.manage().deleteAllCookies();   // clearing data starts fresh its under suite
        }

        return  driver;
    }
















}
