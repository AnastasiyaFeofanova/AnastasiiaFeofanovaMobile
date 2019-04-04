package webTests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import seleniumBase.SeleniumBase;

import java.io.IOException;

public class AndroidWebTest extends SeleniumBase {

    protected AndroidWebTest(String propName) throws IOException {
        super("androidWeb.properties");
    }

    @Test(groups = {"HW2"}, description = "Open website")
    public void webTest() throws InterruptedException {
        driver.get(SUT);
        //This waits up to 5 seconds before throwing a TimeoutException or if it finds the element will return it in 0 - 15 seconds
        WebDriverWait wait = new WebDriverWait (driver, 5);
        //wait.until(ExpectedConditions.titleIs("Software Testing Material - A site for Software Testers"));
       wait.until(ExpectedConditions.urlContains(SUT));
        // temporary solution; it would be better to use regexp
        System.out.println("Site "+SUT+" opening done");
    }
}
