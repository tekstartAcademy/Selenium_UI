package org.example.tests;

import org.example.base.BaseTest;
import org.example.pages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testTwo() {
        SearchResultPage searchPage = new SearchResultPage();
        searchPage.searchFor("Selenium WebDriver");

        Assert.assertTrue(searchPage.searchResult().isDisplayed());
        Assert.assertTrue(searchPage.searchResult().getText().contains("Selenium"));
        //Assert.assertEquals(searchPage.getSearchResult().getText(), "Selenium WebDriver");
    }
}