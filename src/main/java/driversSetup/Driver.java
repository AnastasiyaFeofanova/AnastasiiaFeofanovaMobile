package driversSetup;

/* Initialize a driver with test properties*/

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import properties.TestProperties;

import java.io.IOException;

public class Driver extends TestProperties {
    protected AppiumDriver driver;
    protected DesiredCapabilities capabilities;
    protected WebDriverWait wait;
    // Properties to be read
    protected String AUT; //(mobile) app under testing
    protected String SUT; //site under testing
    protected String TEST_PLATFORM;
    protected String DRIVER;

    // Constructor initializes properties on driver creation
    protected Driver(String propName) throws IOException {
        AUT = getProp(propName,"aut");
        String t_sut = getProp(propName,"sut");
        SUT = t_sut == null ? null : "https://" + t_sut;
        TEST_PLATFORM = getProp(propName,"platform");
        DRIVER = getProp(propName,"driver");
    }
}
