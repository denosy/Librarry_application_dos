package com.dos.pages;

import com.dos.utilities.Driver;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BookManagement extends BasePage{

    @FindBy(xpath = "//span[text()='Books']")
    public WebElement BooksPanelBtn;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm add_book_btn']")
    public WebElement addBookBtn;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement BookName;

    @FindBy (xpath = "//input[@name='isbn']")
    public WebElement ISBN;

    @FindBy (xpath = "//input[@name='year']")
    public WebElement year;

    @FindBy (xpath = "//input[@name='author']")
    public WebElement author;

    @FindBy (xpath = "//select[@id='book_group_id']")
    public WebElement dropDown;

    public void selectBookGroupByValue(String BookCategory) {
        Select select = new Select(dropDown);
        select.selectByValue(BookCategory);
    }

    @FindBy (xpath = "//textarea[@id='description']")
    public WebElement description;

    public void BookDescription(String str){
        description.sendKeys(str);
    }

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement SaveNewBook;


    @FindBy (xpath = "//textarea[@id='description']")
    public WebElement BookCratedMessage;


    public void toastElement(){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement toastMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("toast-message")));
        String text = toastMessage.getText();
    }






}
