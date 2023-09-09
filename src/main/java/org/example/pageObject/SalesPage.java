package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.security.auth.x500.X500Principal;

public class SalesPage {
    private WebDriver driver;

    public SalesPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver =driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifySalesPage;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement sortProduct;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement basket1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement basket2;


    public boolean verifySalesPage(){

        return verifySalesPage.isDisplayed();
    }

    public void setSortProduct(String sort){
        Select a = new Select(sortProduct);
        a.selectByVisibleText(sort);
    }
    public void clickBasket1(){
        basket1.click();
    }
    public void clickBasket2(){
        basket2.click();
    }

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private  WebElement chart;

    public void addChart(){
        chart.click();
    }
    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private  WebElement remove;

    public void removeChart(){
        remove.click();
    }
    @FindBy(xpath = "//button[@id='checkout']")
    private  WebElement checkOut;

    public void checkOut2(){
        checkOut.click();
    }
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;
    public void setFirstName(String user) {
        firstName.sendKeys(user);
    }

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    public void setLastName(String user) {
        lastName.sendKeys(user);
    }

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement posCode;
    public void setPosCode(String user) {
        posCode.sendKeys(user);
    }

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement lanjut;
    public void btnLanjut(){
        lanjut.click();
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifychartPage;
    public boolean verifyChartPage(){

        return verifychartPage.isDisplayed();
    }

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finish1;
    public void clickFinish(){
        finish1.click();
    }

}

