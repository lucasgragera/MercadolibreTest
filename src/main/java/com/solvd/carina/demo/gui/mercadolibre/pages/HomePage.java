package com.solvd.carina.demo.gui.mercadolibre.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(xpath = "//*[@class= 'nav-search-input']")
    public ExtendedWebElement searchInput;
    @FindBy(xpath = "//*[@class= 'nav-search-btn']")
    public ExtendedWebElement searchBtn;
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void typeSearchInput(String search){
        searchInput.type(search);
    }
    public void clickSearchBtn(){
        searchBtn.click();
    }
}
