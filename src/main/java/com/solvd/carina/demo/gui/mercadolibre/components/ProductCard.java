package com.solvd.carina.demo.gui.mercadolibre.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductCard extends AbstractUIObject {

    @FindBy(xpath = ".//*[@class= 'ui-search-item__title']")
    private ExtendedWebElement titleElement;
    protected ProductCard(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    public ExtendedWebElement getTitleElement(){
        return titleElement;
    }
    public String getTitleText(){
        return titleElement.getText();
    }
}
