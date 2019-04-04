package webTests;

import driversSetup.DriverSetup;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSimpleTestWeb extends DriverSetup {

    @BeforeClass(description = "Prepare driver to run test(s)")
    public void setUp() throws Exception {
        prepareAndroidWeb();
    }

    @AfterClass(description = "Close driver on all tests completion")
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test(description = "Open website")
    public void webTest() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Site opening done");
    }
}

