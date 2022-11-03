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


}
