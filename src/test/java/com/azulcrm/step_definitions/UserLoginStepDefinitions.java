package com.azulcrm.step_definitions;

import com.azulcrm.pages.HomePage;
import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class UserLoginStepDefinitions {

    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("User enters valid username {string}")
    public void user_enters_valid_username(String username) {
        loginPage.usernameBox.sendKeys(username);

    }

    @When("User enters valid password {string}")
    public void user_enters_valid_password(String password) {
        loginPage.passwordBox.sendKeys(password);

    }

    @When("User click login button")
    public void user_click_login_button() {
        loginPage.loginBtn.click();

    }

    @Then("user access the home page")
    public void user_access_the_home_page() {
        homePage.searchBox.isDisplayed();

    }

    @When("User enters any username {string}")
    public void user_enters_any_username(String username) {
        loginPage.usernameBox.sendKeys(username);

    }

    @When("User enters any password {string}")
    public void user_enters_any_password(String password) {
        loginPage.passwordBox.sendKeys(password);

    }

    @Then("user should see the warning message incorrect")
    public void user_should_see_the_warning_message_incorrect() {
        Assert.assertEquals(loginPage.alertText.getText(),"Incorrect login or password");

    }

    @Then("user should see warning message fill out")
    public void user_should_see_warning_message_fill_out() {
        Assert.assertEquals("Please fill out this field",loginPage.alertText.getText());

    }

    @When("User click Forgot your password link")
    public void user_click_forgot_your_password_link() {
        loginPage.forgotPasswordLink.click();

    }

    @Then("User land  on the Get Password page")
    public void user_land_on_the_get_password_page() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Get Password");
    }

    @Then("User click Remember Me link")
    public void user_click_remember_me_link() {
      loginPage.rememberMe.click();
      loginPage.rememberMe.isSelected();

    }

    @When("User enters any password")
    public void userEntersAnyPassword() {
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
    }


    @Then("User should see the password in bullet signs by default")
    public void user_should_see_the_password_in_bullet_signs_by_default() {
     Assert.assertNotEquals(ConfigurationReader.getProperty("password"),loginPage.passwordBox.getText());

    }

    @When("user enter valid username and password")
    public void user_enter_valid_username_and_password() {
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));

    }

    @When("user press ENTER")
    public void user_press_enter() {
        loginPage.loginBtn.sendKeys(Keys.ENTER);

    }


    @Then("user see hisher {string} ;")
    public void userSeeHisher(String username) {
        Assert.assertEquals(username,homePage.userName.getText());

    }
}
