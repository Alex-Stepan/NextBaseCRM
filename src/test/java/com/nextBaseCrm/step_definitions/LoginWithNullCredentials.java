package com.nextBaseCrm.step_definitions;

import com.nextBaseCrm.pages.AuthorizationPage;
import com.nextBaseCrm.utilities.DriverTestBase;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class LoginWithNullCredentials extends DriverTestBase {

    @When("User verifies login functionality with Null")
    public void user_verifies_login_functionality_with_null() throws InterruptedException {

        //1.
        setupWebDriver();

        //2.
        driver.get("https://login2.nextbasecrm.com/auth/?backurl=%2Fworkgroups%2F");

        //3.
        Actions actions = new Actions(driver);

        //4.
        AuthorizationPage authorizationPage = new AuthorizationPage();

        //7. Navigate to Login Button & click()
        actions.moveToElement(authorizationPage.LoginBttn).click().perform();
        Thread.sleep(2000); //2000 = 2 sec

        //8.
        System.out.println( "is \"Incorrect login or password message\" message displayed? " +
                authorizationPage.ErrorText.isDisplayed() );

        //9. close Chrome
        driver.quit();

    }



}
