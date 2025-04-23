package com.dos.step_definitions;

import com.dos.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStep {


    @When("user is in the Google search page")
    public void user_is_in_the_google_search_page() {

        Driver.getDriver().get("https://www.google.com/");

    }
    @Then("user should see the title is Google")
    public void user_should_see_the_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Google",actualTitle);

        System.out.println("actualTitle = " + actualTitle);

        Driver.closeDriver();
    }






}
