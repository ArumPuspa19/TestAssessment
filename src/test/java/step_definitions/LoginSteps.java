package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver webDriver;

    public LoginSteps() {
        super();
        this.webDriver = Hooks.webDriver;

    }

    @When("User input \"(.*)\" as userName and input \"(.*)\" as password")
    public void inputCredential(String userName, String password){
        LoginPage loginPage = new LoginPage((webDriver));
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @Given("User already on website sauce demo")
    public void verifyLandingPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLandingPage());
    }
    @Given("User see error \"(.*)\" on login page")
    public void verifyErorText(String erorText){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(erorText, loginPage.verifyErorText());
    }

}
