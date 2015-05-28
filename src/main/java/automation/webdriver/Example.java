package automation.webdriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Example {

    private WebDriver driver;

    @BeforeTest
    public void setUpClass() {
        driver = new FirefoxDriver();
        driver.get("http://docs.seleniumhq.org/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testExample() {
        driver.findElement(By.linkText("Download")).click();
        driver.findElement(By.linkText("Maven Information")).click();
        driver.findElement(By.id("maven")).click();

        try {
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File("c:\\Users\\student\\Desktop\\20.05.15\\screenshot.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void tearDownClass() {
        driver.quit();
    }
}
