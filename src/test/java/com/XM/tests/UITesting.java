package com.XM.tests;
/*
import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.XM.pages.HomePage;
import com.XM.utilities.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITesting {
	WebDriver driverr;
	HomePage homePage = new HomePage();

	@ParameterizedTest
	@CsvSource({
		"chrome, 1920, 1080", //"chrome, 800, 600",
		//"edge, 1024, 768","edge, 800, 600",
		//"firefox, 1024, 768", "firefox, 1024, 768"
	})
    public void userCase(String browser, int width, int height) throws InterruptedException {
        //Driver.get().get("https://www.xm.com/");
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driverr = new ChromeDriver();
			driverr.manage().window().setSize(new org.openqa.selenium.Dimension(width, height));
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driverr = new EdgeDriver();
			driverr.manage().window().setSize(new org.openqa.selenium.Dimension(width, height));			
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driverr = new FirefoxDriver();
			driverr.manage().window().setSize(new org.openqa.selenium.Dimension(width, height));
		}
		driverr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driverr.get("https://www.xm.com/");
        homePage.acceptAll.click();
        
    }
}*/
