package shaho.auto.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import shaho.auto.pages.HomePage;
import shaho.auto.pages.VeterinariansPage;


public class VeterinariansStepDef {
    HomePage homePage = new HomePage();
    VeterinariansPage veterinarianPage = new VeterinariansPage();

    @When("user navigate to Veterinarians page")
    public void userNavigateToVeterinariansPage() {
        homePage.clickOnVeterinarianLink();
    }

    @Then("user find all listed Veterinarians")
    public void userFindAllListedVeterinarians() {
        SoftAssert softAssert = new SoftAssert();
        // print Veterinarians of the table
        veterinarianPage.printTableElements();
        // Assert on table title
        softAssert.assertTrue(veterinarianPage.getVeterinarianTitleWebEle().getText().contains("Veterinarians"), "Assert on Title");
        // Assert that table is existing
        softAssert.assertTrue(veterinarianPage.getVeterinarianTableWebEl().isDisplayed(), "Assert on displaying table");
        // Assert the size of table rows
        softAssert.assertEquals(7, veterinarianPage.getRows().size());
        softAssert.assertAll();
    }
}
