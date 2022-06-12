package com.XM.tests;

import com.XM.pages.EconomicCalender;
import com.XM.pages.HomePage;
import com.XM.pages.RiskWarning;
import com.XM.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class UserCase {
    HomePage hp = new HomePage();
    EconomicCalender ec = new EconomicCalender();
    RiskWarning rw = new RiskWarning();
    @Test
    public void test() throws InterruptedException {
        Driver.get().get("https://www.xm.com/");
        hp.acceptAll.click();
        hp.researchAndEducation.click();
        hp.economicCalender.click();
        Driver.get().switchTo().frame(ec.iframe);
        ec.yesterday.click();
        WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(4));
        wait.until(ExpectedConditions.invisibilityOf(ec.yesterday));
        String yesterday = ec.theDay.getText();
        System.out.println(yesterday);
        //String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        String dateToday = new SimpleDateFormat("EEEEEEEEE, MMMMMMM d, yyyy").format(new Date());
        assertTrue(yesterday.compareTo(dateToday)<0);
        ec.today.click();
        Thread.sleep(1000);
        String today = ec.theDay.getText();
        assertEquals(today, dateToday);
        ec.tomorrow.click();
        wait.until(ExpectedConditions.visibilityOf(ec.theDay));
        String tomorrow = ec.theDay.getText();
        assertTrue(tomorrow.compareTo(today) < 0);


        //8. Click <here> link in the “disclaimer” block at the bottom (make any check here if needed).
        Driver.get().switchTo().defaultContent();
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(ec.hereDisclaimer);
        ec.hereDisclaimer.click();
        assertEquals(Driver.get().getCurrentUrl(), "https://www.xm.com/research/risk_warning");

        //9. Click <here> link in the “Risk Warning” block at the bottom.
        actions.moveToElement(ec.hereDisclaimer);

        wait.until(ExpectedConditions.elementToBeClickable(rw.hereRiskWarning));
        Thread.sleep(2000);
        rw.hereRiskWarning.click();
        String currentWindowHandle = Driver.get().getWindowHandle();

        Thread.sleep(2000);
        Set<String> windowHandles = Driver.get().getWindowHandles();
        System.out.println(windowHandles.size());
        for(String eachTab : windowHandles){

            if(!eachTab.equals(currentWindowHandle));
            Driver.get().switchTo().window(eachTab);

            break;


        }
        assertEquals(Driver.get().getTitle(), "XM-Risk-Disclosures-for-Financial-Instruments.pdf");
    }
}
