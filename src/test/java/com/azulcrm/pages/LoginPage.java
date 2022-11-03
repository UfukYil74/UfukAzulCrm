package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public  LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);   }

    @FindBy(name = "USER_LOGIN")
     public WebElement usernameBox;

    @FindBy(name = "USER_PASSWORD")
     public WebElement passwordBox;

    @FindBy(className = "login-btn")
     public WebElement loginBtn;

    @FindBy(className = "errortext")
    public WebElement alertText;

    @FindBy(className = "login-link-forgot-pass")
    public WebElement forgotPasswordLink;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMe;



}
