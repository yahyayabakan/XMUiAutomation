package com.XM.pages;

import com.XM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.WeakHashMap;

public class RiskWarning {
    public RiskWarning(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "a[href='/assets/pdf/new/docs/XM-Risk-Disclosures-for-Financial-Instruments.pdf?v5']")
    public WebElement hereRiskWarning;
}
