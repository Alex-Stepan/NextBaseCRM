package com.nextBaseCrm.step_definitions;

import com.nextBaseCrm.pages.AuthorizationPage;
import com.nextBaseCrm.utilities.DriverTestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class LoginWrongFunctionality extends DriverTestBase{

    @When("User verifies login functionality with wrong credentials")
    public void user_verifies_login_functionalities_with_wrong_credentials() throws InterruptedException {

        //1.
        setupWebDriver();

        //2.
        driver.get("https://login2.nextbasecrm.com/auth/?backurl=%2Fworkgroups%2F");

        //3.
        Actions actions = new Actions(driver);

        //4.
        AuthorizationPage authorizationPage = new AuthorizationPage();

        //5. Navigate to LoginBox & input Wrong username:
        actions.click(authorizationPage.LoginBox).doubleClick().sendKeys(Keys.DELETE).perform();
            Thread.sleep(2000); //2000 = 2 sec
        actions.sendKeys("wrong@cybertekschool@com").perform();
            Thread.sleep(2000); //2000 = 2 sec

        //6. Navigate to PasswordBox & input Wrong password:
        actions.click(authorizationPage.PasswordBox).doubleClick().sendKeys(Keys.DELETE).perform();
            Thread.sleep(2000); //2000 = 2 sec
        actions.sendKeys("WrongUser").perform();
            Thread.sleep(2000); //2000 = 2 sec

        //7. Navigate to Login Button & click()
        actions.moveToElement(authorizationPage.LoginBttn).click().perform();
            Thread.sleep(2000); //2000 = 2 sec

        //8.
        System.out.println( "is \"Incorrect login or password message\" message displayed? " +
                authorizationPage.ErrorText.isDisplayed() );

    }

    @Then("User close this browser")
    public void user_close_this_browser() {

        //7. close Chrome
        driver.quit();
    }


}
