package seleniumBase;

import driversSetup.PrepareDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class SeleniumBase extends PrepareDriver {
    protected SeleniumBase(String propName) throws IOException {
        super(propName);
    }

    @BeforeClass(alwaysRun = true)
    /**
     * Prepare driver to run test(s)
     */
    public void setUp() throws Exception {
        prepareDriver();
    }

    @AfterClass(alwaysRun = true)
    /**
     * Close driver on all tests completion
     */
    public void tearDown() throws Exception {
        driver.quit();
    }
}
