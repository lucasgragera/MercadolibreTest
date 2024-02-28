package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.mercadolibre.pages.HomePage;
import com.solvd.carina.demo.gui.mercadolibre.pages.SearchPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WebMLTest implements IAbstractTest{
    @Test
    @MethodOwner(owner = "Lucas")
    public void verifySearchTest(){
        HomePage  homePage =  new HomePage(getDriver());
        SearchPage searchPage = new SearchPage(getDriver());

        homePage.open();
        homePage.typeSearchInput("auriculares");
        homePage.clickSearchBtn();

        assertTrue(searchPage.isTitlePresent(), "Tiltle isn't correct");
    }
}
