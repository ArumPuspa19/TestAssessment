package step_definitions;

import cucumber.api.java.en.Then;
import javafx.scene.chart.Chart;
import org.example.pageObject.ChartPage;
import org.example.pageObject.SalesPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ChartSteps {
    private WebDriver webDriver;
    public ChartSteps(){
        super();
        this.webDriver= Hooks.webDriver;
    }

    @Then("User already on chart page")
    public void verifyChartPage(){
        ChartPage chartPage = new ChartPage(webDriver);
        Assert.assertTrue(chartPage.verifyChartPage());
    }


}
