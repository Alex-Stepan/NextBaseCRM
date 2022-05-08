package com.nextBaseCrm.step_definitions;

import com.nextBaseCrm.utilities.DriverTestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AuthorizationPage_LoginTo_HomePage extends DriverTestBase {

    /** Background: ------------------------------------------- */
    @Given("User is on the Authorization Page")
    public void user_is_on_the_authorization_page() {
        //1. Setup Chrome
        setupWebDriver();
        //2. Navigate to Authorization Page
        driver.get("https://login2.nextbasecrm.com/auth/?backurl=%2Fworkgroups%2F");
    }


    /** Scenario: --------------------------------------------- */

    @When("User enter login")
    public void user_enter_login(io.cucumber.datatable.DataTable dataTable) {
        //3. Setup Actions for Chrome
        Actions actions = new Actions(driver);
        //4. Locate LoginBox
        WebElement LoginInput = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
        //5. Navigate to LoginBox
        actions.click(LoginInput).pause(2000).perform();
        //6. Input credentials and click()
        actions.sendKeys("helpdesk29@cybertekschool.com").pause(2000).perform();
    }


    @When("User enter password")
    public void user_enter_password(io.cucumber.datatable.DataTable dataTable) {
        //7. Setup Actions for Chrome
        Actions actions = new Actions(driver);
        //8. Locate PasswordBox
        WebElement PasswordBox = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
        //9. Navigate to PasswordBox
        actions.click(PasswordBox).pause(2000).perform();
        //10. Input credentials and click()
        actions.sendKeys("UserUser").pause(2000).perform();
    }


    @Then("User should navigate to the NextBaseCRM Home page")
    public void user_should_navigate_to_the_next_base_crm_home_page() {
        //11. Setup Actions for Chrome
        Actions actions = new Actions(driver);
        //12. Locate LoginButton
        WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
        //13. Click() Login Button
        actions.moveToElement(LoginButton).pause(2000).click().perform();
    }

}
