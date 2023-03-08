package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SeleniumTest {
    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll(){
        driver = browserGetter.getChromeDriver();

    }

    @Test
    public void OpenTheComPageAndCheckTheTitle(){
        String expectedComTitle = "Example Domain";
        driver.get("https://www.example.com");
        assertEquals(expectedComTitle, driver.getTitle());
    }

    @Test
    public void OpenTheOrgPageAndCheckTheTitle(){
        String expectedOrgTitle = "Example Domain";
        driver.get("https://www.example.org");
        assertEquals(expectedOrgTitle, driver.getTitle());
    }

    @AfterAll
    public void afterAll(){
        driver.quit();

    }
}
