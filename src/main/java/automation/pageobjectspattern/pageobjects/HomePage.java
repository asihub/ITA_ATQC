package automation.pageobjectspattern.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import java.io.IOException;

/**
 * Simple PageObject page representing Google home page
 */
public class HomePage extends PageObjectPage {

    // PageFactory use for UI mapping
    @FindBy(xpath = ".//*[@id='lst-ib']")
    private WebElement inputField;

    public HomePage(WebDriver driver) {
        super(driver);
        // initialize all WebElement objects with a FindBy annotation
        PageFactory.initElements(driver, this);
    }

    /**
     * Searches for a given searchTerm, returns a new SearchResultPage object
     * @param searchTerm
     * @return
     * @throws IOException
     */
    public SearchResultsPage searchFor(String searchTerm) throws IOException {
        // no need to call driver.findElement(By.xpath("locator")) since inputField is a WebElement already
        inputField.sendKeys(searchTerm);
        inputField.sendKeys(Keys.ENTER);

        return new SearchResultsPage(driver);
    }

    /**
     * Returns the inputField element
     * @return
     */
    public WebElement getInputFieldWebElement(){
        return inputField;
    }
}
