package com.XM.pages;

import com.XM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Watchable;

public class EconomicCalender {
    public EconomicCalender(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//*[.='here']")
    public WebElement hereDisclaimer;

    @FindBy(xpath = "//*[.='Yesterday']")
    public WebElement yesterday;

    @FindBy(xpath = "//*[@id='timeFrame_today']")
    public WebElement today;

    @FindBy(xpath = "//*[@id='timeFrame_tomorrow']")
    public WebElement tomorrow;

    @FindBy(className = "theDay")
    public WebElement theDay;

    @FindBy(xpath = "//*[@title='economicCalendar']")
    public WebElement iframe;
}
