package com.nextBaseCrm.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    /** 1. create obj for manipulations inside methods */
    private static WebDriver driver;

    /** 2. Create Driver() */
    private Driver() {
    }

    /** 3. Create getDriver() in case if Driver was null */
    public static WebDriver getDriver() {
        //3.1. create obj-browserName using ConfigReader//read(String key)
        String browserName = ConfigReader.getProperty("browser");

        //3.2. conditions for the driver:
        if(driver == null){
            switch (browserName){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                default:
                    driver = null;
                    System.out.println("We are not working with this type of browser");
            }
        }else {
            return driver;
        }

        //3.3.
        return driver;
    }

    /** 4. Closing driver */
    public static void closeBrowser(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

    /** 5.  */

}
