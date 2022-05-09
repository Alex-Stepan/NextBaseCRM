package com.nextBaseCrm.step_definitions;

import com.nextBaseCrm.pages.AuthorizationPage;
import com.nextBaseCrm.pages.GetPasswordPage;
import com.nextBaseCrm.utilities.DriverTestBase;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class ResetPasswordByNull extends DriverTestBase {

    @When("Use Null to reset password")
    public void use_null_to_reset_password() throws InterruptedException{
        //1.
        setupWebDriver();

        //2.
        AuthorizationPage authorizationPage = new AuthorizationPage();

        //3.
        Actions actions = new Actions(driver);

        //4.
        driver.get("https://login2.nextbasecrm.com/auth/?backurl=%2Fworkgroups%2F");
        Thread.sleep(2000);

        //5.
        actions.moveToElement(authorizationPage.ForgotYourPasswordButton).click().perform();
        Thread.sleep(2000);

        //6.
        GetPasswordPage getPasswordPage = new GetPasswordPage();

        //8.
        actions.moveToElement(getPasswordPage.ResetPasswordButton).perform();
        Thread.sleep(3000);

        //9.
        System.out.println("Login or Email not found is displayed?  " +  getPasswordPage.ErrorNote.isDisplayed());


        //11.
        driver.quit();

    }
}
