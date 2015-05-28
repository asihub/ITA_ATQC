package automation.pageobjectspattern;

import automation.pageobjectspattern.pageobjects.HomePage;
import automation.pageobjectspattern.pageobjects.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * This is a test class. Contains PageObject calls and assertions,
 * extends TestRunner to avoid providing before & after methods
 */
public class VerifyGooglePages extends TestRunner {

    private final String GOOGLE_URL = "https://google.com";

    @Test
    public void testMethod() throws IOException {
        driver.get(GOOGLE_URL);
        HomePage homePage = new HomePage(driver);

        final SearchResultsPage searchResultsPage = homePage.searchFor("happy");
        homePage = searchResultsPage.clickGoogleLogo();

        Assert.assertTrue(homePage.getInputFieldWebElement().isDisplayed(),
                "Input field not displayed");
    }
}
