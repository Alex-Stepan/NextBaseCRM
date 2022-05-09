package com.nextBaseCrm.pages;

import com.nextBaseCrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {
    //------------------------------------------------------//

    /** 1. Initialization of the page: */
    public AuthorizationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //------------------------------------------------------//


    /** 2. WebElements: */
        // Login Box for username
    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"))
    public WebElement LoginBox;

        // Password Box
    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"))
    public WebElement PasswordBox;

        // Login Button
    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[2]/input"))
    public WebElement LoginBttn;

        // Drop List
    @FindBy(id = "user-block")
    public WebElement FunctionallityList;

        // Logout Button
    @FindBy(xpath = ("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]/span[2]"))
    public WebElement LogOutBttn;

        // Incorrect login or password message
    @FindBy(xpath = ("//*[@id=\"login-popup\"]/div[2]" ))
    public WebElement ErrorText;

        // Forgot Your Password Button
    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[2]/a"))
    public WebElement ForgotYourPasswordButton;


}
