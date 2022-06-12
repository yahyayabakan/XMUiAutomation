package com.XM.pages;

import com.XM.utilities.Driver;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){ PageFactory.initElements(Driver.get(), this);}

    @FindBy(xpath = "//*[.='ACCEPT ALL']")
    public WebElement acceptAll;

    @FindBy(xpath = "//*[@class='main_nav_research']")
    public WebElement researchAndEducation;

    @FindBy(xpath = "//*[@class='menu-research'][6]")
    public WebElement economicCalender;


}



