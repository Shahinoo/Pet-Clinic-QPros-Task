package shaho.auto.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import shaho.auto.pages.HomePage;
import shaho.auto.pages.OwnerPage;

public class OwnersStepDef {
    HomePage homePage = new HomePage();
    OwnerPage ownerPage = new OwnerPage();

    @When("user navigate to findOwner page")
    public void userNavigateToFindOwnerPage() {
        homePage.clickOnFindOwnerPageLink();
    }

    @And("user click on findOwner Button")
    public void userClickOnFindOwnerButton() {
        ownerPage.clickOnFindOwnerButton();
    }

    @Then("user find all listed owners")
    public void userFindAllListedOwners() {
        ownerPage.printOwnerTableElements();

    }
}
