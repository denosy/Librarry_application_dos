package com.dos.step_definitions;

import com.dos.pages.LoginPage;
import com.dos.utilities.ConfigurationReader;
import com.dos.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class login_StepDef {

        LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("user should enter valid login and password")
    public void user_should_enter_valid_login_and_password() {

        //loginPage.environmentalLogin("EMAIL","PASSWORD");

        loginPage.login("librarian10@library","libraryUser");

    }

    @Then("user should see name on profile {string}")
    public void user_should_see_name_on_profile(String expectedUserName) {

        String actualName = loginPage.actualUserName.getText();

        Assert.assertEquals(expectedUserName,actualName);

        Driver.closeDriver();

    }

}

//in Step # 2 we are using Environmental variables to secure sensitivity data
//in other words we are created custom runner with credentials, and it's existing
//only in this runner and nowhere else