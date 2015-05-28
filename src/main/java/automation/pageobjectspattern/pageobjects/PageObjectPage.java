package automation.pageobjectspattern.pageobjects;

import org.openqa.selenium.WebDriver;

/**
 * Base for creating PageObject classes and injecting WebDriver interface
 */
public abstract class PageObjectPage {
    protected WebDriver driver;

    public PageObjectPage(WebDriver driver){
        this.driver = driver;
    }
}
