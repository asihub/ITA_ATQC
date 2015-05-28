package automation.pageobjectspattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Class contains after and before methods, that will run each time a test case is executed
 * There's no need to provide before & after methods is a test class
 */
public class TestRunner {
    protected WebDriver driver;

    protected TestRunner(){
        // for defeating instantiation outside inherited classes
    }

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
