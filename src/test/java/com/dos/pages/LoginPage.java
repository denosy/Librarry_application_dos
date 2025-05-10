package com.dos.pages;

import com.dos.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


    @FindBy (id = "inputEmail")
    public WebElement emailBox;

    @FindBy (id = "inputPassword")
    public WebElement passwordBox;

    @FindBy (xpath = "//*[text()='Sign in']")
    public WebElement loginBtn;

    @FindBy (xpath = "//*[text()='Test Librarian 10']") ////a[@id="navbarDropdown"]/span
    public WebElement actualUserName;


    public void login(String username, String password) {
        emailBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginBtn.click();

    }

    public void environmentalLogin(String loginVAR, String passVAR){
        emailBox.sendKeys(System.getenv(loginVAR));
        passwordBox.sendKeys(System.getenv(passVAR));
        loginBtn.click();
    }


}

