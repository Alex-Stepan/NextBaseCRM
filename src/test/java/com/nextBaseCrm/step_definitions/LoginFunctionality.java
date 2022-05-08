package com.nextBaseCrm.step_definitions;

import com.nextBaseCrm.utilities.DriverTestBase;
import com.nextBaseCrm.utilities.DriverUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;

public class LoginFunctionality extends DriverTestBase {


        @Given("User is on default page")
        public void user_is_on_default_page() {
            setupWebDriver();
            driver.get("https://login2.nextbasecrm.com/auth/?backurl=%2Fworkgroups%2F");
        }


    @When("User verifies login functionality to Home page")
    public void user_verifies_login_functionalities() {
        Actions actions = new Actions(driver);

        ArrayList<String> loginList = new ArrayList<>();
            loginList.add("helpdesk29@cybertekschool.com");
            loginList.add("marketing29@cybertekschool.com");
            loginList.add("hr29@cybertekschool.com");

        ArrayList<String> listTitle = new ArrayList<>();

        for (int i = 0; i < loginList.size(); i++) {
                //4. Locate LoginBox
            WebElement LoginInput = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
                //5. Navigate to LoginBox
            actions.click(LoginInput).doubleClick().sendKeys(Keys.DELETE).pause(2000).perform();
                //6. Input credentials and click()
            actions.sendKeys(loginList.get(i)).pause(2000).perform();
                //8. Locate PasswordBox
            WebElement PasswordBox = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
                //9. Navigate to PasswordBox
            actions.click(PasswordBox).doubleClick().sendKeys(Keys.DELETE).pause(2000).perform();
                //10. Input credentials and click()
            actions.sendKeys("UserUser").pause(2000).perform();
                //12. Locate LoginButton
            WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
                //13. Click() Login Button
            actions.moveToElement(LoginButton).pause(2000).click().perform();
                DriverUtilities.waitFor(5);


                //2. Logout process
            actions.moveToElement(driver.findElement(By.id("user-block"))).click().perform();
                DriverUtilities.waitFor(5);

            actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]/span[2]"))).click().perform();
                DriverUtilities.waitFor(5);
        }
    }
//    @When("gets title of the page")
//    public void navigates_to_home_page() {
//
//        driver.getTitle();
//    }


    @Then("User close the browser")
    public void user_close_the_browser() {
        //14. close Chrome
        driver.quit();
    }

}
