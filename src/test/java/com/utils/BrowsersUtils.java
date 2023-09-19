package com.utils;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;

public class BrowsersUtils {

    // Select Class ==>  getting element text and trim it to avoid repeating it in the code ,
    public static String getText(WebElement element) {
        return element.getText().trim();
    }


    // Select Class   Text || value || index
    public static void selectBy(WebElement location, String value, String methodName) {

        Select select = new Select(location);


        switch (methodName) {

            case "text":
                select.selectByVisibleText(value);
                break;

            case "value":
                select.selectByValue(value);
                break;

            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;

            default:
                System.out.println("Your Method name is not correct");
                Assert.fail();
                break;

        }
    }

    /// ----------------------- JS Methods ----------

    public static String getTitleWithJS(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("return document.title").toString().trim();
    }


    // JS CLICK
    public static void clickWithJS(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }


    //SCROLL INTO VIEW JS
    public static void scrollWithJS(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    // GET WINDOW HANDEL METHOD 1 ===> FOR ONLY TOW TAPS

    public static void switchById2(WebDriver driver) {

        String mainPageID = driver.getWindowHandle(); // main Page Id
        Set<String> allPagesId = driver.getWindowHandles();  // all ides
        for (String each : allPagesId) {

            if (!each.equals(mainPageID)) { // avoiding main page id
                driver.switchTo().window(each);  // move to it
                break; // stop loop
            }

        }

    }


    //  GIT window method 2 ===> for all windows
    public static void switchByTitle(WebDriver driver, String title) {


        Set<String> allPagesId = driver.getWindowHandles();

        for (String eachId : allPagesId) {
            driver.switchTo().window(eachId);
            if (driver.getTitle().equals(title)) {
                break;
            }
        }
    }

    // ScreenShot Logic
    public static void getScreenShot(WebDriver driver, String packageName) {

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String location = System.getProperty("st/test/" + packageName);

        try {
            FileUtils.copyFile(file, new File(location + System.currentTimeMillis()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    // Hover Over With JS
       public static void MoveToElementWithJs(WebDriver driver ,WebElement element){
           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].dispatchEvent(new Event('mouseover'))",element);
       }


    public static void getScreenShotWithCucumber(WebDriver driver, Scenario scenario) {

        Date currentDate = new Date();
        String screenShotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");

        if (scenario.isFailed()) {
            File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenShotFile, new File("src/test/java/screenshot/" + screenShotFileName + ".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }


}
