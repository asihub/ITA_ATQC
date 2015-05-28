package automation.webdriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExportedWebDriverBacked {
    private Selenium selenium;

    @BeforeTest
    public void setUp() throws Exception {
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://docs.seleniumhq.org/";
        selenium = new WebDriverBackedSelenium(driver, baseUrl);
    }

    @Test
    public void testExportedWebDriverBacked() throws Exception {
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
