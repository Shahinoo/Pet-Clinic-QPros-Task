package shaho.auto.stepDefs;

import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import shaho.auto.pages.HomePage;

public class HomeStepDef {
    HomePage homePage = new HomePage();

    @Then("verify that home page contains welcome image")
    public void verifyHomePage() {
        SoftAssert softAssert = new SoftAssert();
        // Assert on Welcome image
        softAssert.assertEquals(homePage.welcomeImageWebEle.isDisplayed(), true, "Assert on welcome Image");
        // Assert on Welcome image
        softAssert.assertEquals(homePage.qProsImageWebEle.isDisplayed(), true, "Assert on Qpros image");
        softAssert.assertAll();
    }
}
