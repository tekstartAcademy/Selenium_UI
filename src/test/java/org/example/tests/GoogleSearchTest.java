package org.example.tests;

import org.example.base.BaseTest;
import org.example.base.DriverManager;
import org.example.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void testGoogleSearch() {
        DriverManager.getDriver().get("https://www.google.com");

        HomePage homePage = new HomePage();
        Assert.assertTrue(
                homePage.search("Selenium WebDriver")
                        .isResultsFound(),
                "Results not found!"
        );
    }
}
