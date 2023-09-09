package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.masterthought.cucumber.json.Hook;
import org.example.pageObject.ChartPage;
import org.example.pageObject.LoginPage;
import org.example.pageObject.SalesPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SalesSteps {  //nama class
    private WebDriver webDriver;
    public SalesSteps(){
        super();
        this.webDriver= Hooks.webDriver;
    }
    @Then("User already on sales page")  //lockator
    public void verifySalesPage(){
        SalesPage salesPage = new SalesPage(webDriver);
        Assert.assertTrue(salesPage.verifySalesPage());
    }
    @When("User sort product list by \"(.*)\"")
    public void sortProduct (String sort){
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.setSortProduct(sort);

    }
    @And("User pick 2 item from the basket Sauce Labs Onesie and Sauce Labs Bike Light")
    public void click2Product(){
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.clickBasket1();
        salesPage.clickBasket2();

    }
    @And("User click chart button")
    public void clickChart(){
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.addChart();

    }
    @Then("Verify Chart Page")  //lockator
    public void verifyChartPage(){
        SalesPage salesPage = new SalesPage(webDriver);
        Assert.assertTrue(salesPage.verifyChartPage());
    }
    @And("User Remove 1 item")
    public void removeItem(){
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.removeChart();
    }
    @Then("User click Checkout")
    public void checkout(){
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.checkOut2();

    }

    @When("User input \"(.*)\" as firstName , input \"(.*)\" as lastName and input \"(.*)\" as posCode")
    public void inputCredential(String firstName,String lastName, String posCode){
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.setFirstName(firstName);
        salesPage.setLastName(lastName);
        salesPage.setPosCode(posCode);
        salesPage.btnLanjut();
    }
    @Then("Verify button finish")
    public void clickFinish() {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.clickFinish();
    }
}
