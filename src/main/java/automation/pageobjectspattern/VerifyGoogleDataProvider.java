package automation.pageobjectspattern;

import automation.pageobjectspattern.pageobjects.HomePage;
import automation.pageobjectspattern.pageobjects.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This is a test class. Contains PageObject calls and assertions,
 * extends TestRunner to avoid providing before & after methods
 */
public class VerifyGoogleDataProvider extends TestRunner {

    private final String GOOGLE_URL = "https://google.com";

    @Test(dataProvider = "testDataIterator")
    public void testMethod(final String searchTerm) throws IOException {
        driver.get(GOOGLE_URL);
        HomePage homePage = new HomePage(driver);

        final SearchResultsPage searchResultsPage = homePage.searchFor(searchTerm);
        homePage = searchResultsPage.clickGoogleLogo();

        Assert.assertTrue(homePage.getInputFieldWebElement().isDisplayed(),
                "Input field not displayed");
    }

    /**
     * This is a data provider method, returns array of Objects array
     * @return
     */
    @DataProvider(name = "testData")
    public Object[][] getTestData(){
        return new Object[][]{{"happy"}, {"not happy"}};
    }

    /**
     * This is a data provider method, returns iterator to array of objects
     * @return
     */

    @DataProvider(name = "testDataIterator")
    public Iterator<Object[]> getTestDataasIterator(){
        final List<Object[]> testDataList = new ArrayList<Object[]>();

        testDataList.add(new Object[] {"happy"});
        testDataList.add(new Object[] {"not happy"});

        return testDataList.iterator();
    }
}
