package com.solvd.carina.demo.gui.mercadolibre.pages;

import com.solvd.carina.demo.gui.mercadolibre.components.ProductCard;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends AbstractPage {
    @FindBy(xpath = ".//*[contains(@class= 'ui-search-item__title'])")
    private ExtendedWebElement cards;

    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public boolean isTitlePresent(){
        return cards.isElementPresent();
    }

}
