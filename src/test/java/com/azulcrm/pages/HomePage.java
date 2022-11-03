package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){ PageFactory.initElements(Driver.getDriver(),this);  }


    @FindBy(id= "search-textbox-input")
    public WebElement searchBox;

    @FindBy(className = "user-name")
    public WebElement userName;

    @FindBy(id = "user-block")
    public WebElement userNameBtn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]")
    public WebElement logOutLink;

}
