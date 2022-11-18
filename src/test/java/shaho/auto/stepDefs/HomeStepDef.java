package shaho.auto.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import shaho.auto.pages.HomePage;

import java.time.Duration;

import static shaho.auto.stepDefs.Hooks.driver;

public class HomeStepDef {
    HomePage homePage = new HomePage();

//    @When("user open home page")
//    public void userOpenHomePage() {
//        homePage.clickOnHomePageLink();
//    }

    @Then("home page opened and contains welcome image")
    public void homePageOpenedAndContainsWelcomeImage() {
        Assert.assertEquals(homePage.welcomeImageWebEle.isDisplayed(), true, "Assert on Image");
    }
}
