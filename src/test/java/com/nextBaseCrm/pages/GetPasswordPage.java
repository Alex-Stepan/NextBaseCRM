package com.nextBaseCrm.pages;

import com.nextBaseCrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetPasswordPage {
    //------------------------------------------------------//

    /** 1. Initialization of the page: */
    public GetPasswordPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //------------------------------------------------------//


    /** 2. WebElements: */

    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[2]/div[1]/input"))
    public WebElement LoginBox;


    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[2]/div[2]/input"))
    public WebElement EmailBox;

    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[4]/button"))
    public WebElement ResetPasswordButton;

    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[4]/div/a"))
    public WebElement AuthorizationLinkFromLogin;

    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[3]/div/a"))
    public WebElement AuthorizationLinkFromEmail;

    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[2]"))
    public WebElement SentNote;

    @FindBy(xpath = ("//*[@id=\"login-popup\"]/form/div[2]"))
    public WebElement ErrorNote;



}


