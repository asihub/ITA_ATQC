package automation.webdriver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// You need to start Selenium standalone server in order to run this class
public class ExportedRC {
    private Selenium selenium;

    @BeforeTest
    public void setUp() throws Exception {
        selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://docs.seleniumhq.org/");
        selenium.start();
    }

    @Test
    public void testExportedRC() throws Exception {
        selenium.open("/");
        selenium.click("link=Download");
        selenium.waitForPageToLoad("30000");

        Assert.assertEquals("Selenium IDE", selenium.getText("//div[@id='mainContent']/h3[6]"));
    }

    @AfterTest
    public void tearDown() throws Exception {
        selenium.stop();
    }
}
