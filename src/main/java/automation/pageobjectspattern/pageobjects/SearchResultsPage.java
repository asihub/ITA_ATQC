package automation.pageobjectspattern.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * Simple PageObject page representing Google search result page
 */
public class SearchResultsPage extends PageObjectPage {

    private String googleLogo;
    private final Properties properties;

    // Properties use for UI mapping
    private final String PROPERTY_FILE = "locators.properties";

    public SearchResultsPage(WebDriver driver) throws IOException {
        super(driver);

        PageFactory.initElements(driver, this);
        properties = new Properties();
        properties.load(getClass().getClassLoader().getResourceAsStream(PROPERTY_FILE));

        setProperties();
    }

    /**
     * Clicks a Google logo, returns a new HomePage object
     * @return
     */
    public HomePage clickGoogleLogo() {
        driver.findElement(By.xpath(googleLogo)).click();

        return new HomePage(driver);
    }

    /**
     * Sets up all properties
     */
    private void setProperties(){
        googleLogo = properties.getProperty("google.logo");
    }
}
