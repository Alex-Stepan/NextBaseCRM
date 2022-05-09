package com.nextBaseCrm.step_definitions;

import com.nextBaseCrm.pages.AuthorizationPage;
import com.nextBaseCrm.pages.GetPasswordPage;
import com.nextBaseCrm.utilities.DriverTestBase;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class ResetPasswordByEmail extends DriverTestBase {


    @When("Use Email to reset password")
    public void use_email_to_reset_password() throws InterruptedException {

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

        // info
        ArrayList<String> loginList = new ArrayList<>();
        loginList.add("helpdesk29@cybertekschool.com");
        loginList.add("marketing29@cybertekschool.com");
        loginList.add("hr29@cybertekschool.com");

        //7. Navigate to LoginBox & input username from the List:
        actions.click(getPasswordPage.EmailBox).perform();
        Thread.sleep(2000);
        actions.sendKeys(loginList.get(1)).perform();
        Thread.sleep(2000); //2000 = 2 sec

        //8.
        actions.moveToElement(getPasswordPage.ResetPasswordButton).perform();
        Thread.sleep(3000);

        //9.
        System.out.println("A reset your password note is displayed?  " +  getPasswordPage.SentNote.isDisplayed());

        //10.
        Thread.sleep(2000);

        actions.moveToElement(getPasswordPage.AuthorizationLinkFromEmail).click().perform();
        Thread.sleep(2000);

        //11.
        driver.quit();
    }


}
