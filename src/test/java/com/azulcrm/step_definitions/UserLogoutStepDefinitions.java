package com.azulcrm.step_definitions;

import com.azulcrm.pages.HomePage;
import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserLogoutStepDefinitions {

    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();


    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginBtn.click();

    }
    @When("User click the user menu")
    public void user_click_the_user_menu() {
        homePage.userNameBtn.click();

    }
    @When("User click the Log out")
    public void user_click_the_log_out() {
        homePage.logOutLink.click();

    }


    @Then("User  should see the login page")
    public void userShouldSeeTheLoginPage() {
        Assert.assertEquals("Authorization",Driver.getDriver().getTitle());

    }

    @And("User  click the step back button")
    public void userClickTheStepBackButton() {
        Driver.getDriver().navigate().back();
    }

    @When("User  close the all tabs")
    public void user_close_the_all_tabs() {
        Driver.closeDriver();

    }

    @When("User open the  app url")
    public void user_open_the_app_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }



}
