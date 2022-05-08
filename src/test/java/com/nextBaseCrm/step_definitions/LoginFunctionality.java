package com.nextBaseCrm.step_definitions;

    import com.nextBaseCrm.pages.AuthorizationPage;
    import com.nextBaseCrm.utilities.DriverTestBase;
    import com.nextBaseCrm.utilities.DriverUtilities;
    import io.cucumber.java.en.Given;
    import io.cucumber.java.en.Then;
    import io.cucumber.java.en.When;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.interactions.Actions;
    import java.util.ArrayList;


public class LoginFunctionality extends DriverTestBase {


            @Given("User is on default page")
            public void user_is_on_default_page() {

                //1.
                setupWebDriver();
                //2.
                driver.get("https://login2.nextbasecrm.com/auth/?backurl=%2Fworkgroups%2F");
            }


    @When("User verifies login functionality to Home page")
    public void user_verifies_login_functionalities() throws InterruptedException {

            //3.
        Actions actions = new Actions(driver);
            //4.
        ArrayList<String> loginList = new ArrayList<>();
            loginList.add("helpdesk29@cybertekschool.com");
            loginList.add("marketing29@cybertekschool.com");
            loginList.add("hr29@cybertekschool.com");
            //5.
        AuthorizationPage authorizationPage = new AuthorizationPage();

            //6.
        for (int i = 0; i < loginList.size(); i++) {
                //6.1. Navigate to LoginBox & input username from the List:
            actions.click(authorizationPage.LoginBox).doubleClick().sendKeys(Keys.DELETE).perform();
                Thread.sleep(2000); //2000 = 2 sec
            actions.sendKeys(loginList.get(i)).perform();
                Thread.sleep(2000); //2000 = 2 sec

                //6.2. Navigate to PasswordBox & input password:
            actions.click(authorizationPage.PasswordBox).doubleClick().sendKeys(Keys.DELETE).perform();
                Thread.sleep(2000); //2000 = 2 sec
            actions.sendKeys("UserUser").perform();
                Thread.sleep(2000); //2000 = 2 sec

            //6.3. Navigate to Login Button & click()
            actions.moveToElement(authorizationPage.LoginBttn).click().perform();
            Thread.sleep(2000); //2000 = 2 sec
//            DriverUtilities.waitFor(3);

                //6.4. Logout process
            actions.moveToElement(authorizationPage.FunctionallityList).click().perform();
                Thread.sleep(2000); //2000 = 2 sec
            actions.moveToElement(authorizationPage.LogOutBttn).click().perform();
                Thread.sleep(2000); //2000 = 2 sec

        }
    }


    @Then("User close the browser")
    public void user_close_the_browser() {
        //7. close Chrome
        driver.quit();
    }

}
