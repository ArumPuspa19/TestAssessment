package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChartPage {
    private WebDriver driver;

    public ChartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    private WebElement verifyChartPage;


    public boolean verifyChartPage(){
        return verifyChartPage.isDisplayed();
    }

}
