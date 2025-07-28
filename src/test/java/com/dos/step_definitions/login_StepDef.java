package com.dos.step_definitions;

import com.dos.pages.LoginPage;
import com.dos.utilities.ConfigurationReader;
import com.dos.utilities.Driver;
import com.dos.utilities.log;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class login_StepDef {

        LoginPage loginPage = new LoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        log.info("navigating to URL");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("user should enter valid login and password")
    public void user_should_enter_valid_login_and_password() {

        log.info("we are on the page, putting credentials");
        //loginPage.environmentalLogin("EMAIL","PASSWORD");

        String librarianUsername = ConfigurationReader.getProperty("librarian_username10");
        String librarianPassword = ConfigurationReader.getProperty("librarian_password");

        loginPage.login(librarianUsername,librarianPassword);

    }

    @Then("user should see name on profile {string}")
    public void user_should_see_name_on_profile(String expectedUserName) {
        log.info("credentials are valid we are in account ");
        String actualName = loginPage.actualUserName.getText();

        Assert.assertEquals(expectedUserName,actualName);

        log.info("assertions passed test done ");

        Driver.closeDriver();

    }

}

//in Step # 2 we are using Environmental variables to secure sensitivity data
//in other words we are created custom runner with credentials, and it's existing
//only in this runner and nowhere else