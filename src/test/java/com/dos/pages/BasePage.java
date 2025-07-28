package com.dos.pages;

import com.dos.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage  {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
