package shaho.auto.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.testng.asserts.SoftAssert;
import shaho.auto.data.JsonDataReader;
import shaho.auto.pages.HomePage;
import shaho.auto.pages.OwnerPage;

import java.io.IOException;

public class OwnersStepDef {
    HomePage homePage = new HomePage();
    OwnerPage ownerPage = new OwnerPage();
    JsonDataReader jsonDataReader = new JsonDataReader();

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

    @When("user click on AddOwner Button")
    public void userClickOnAddOwnerButton() {
        ownerPage.clickOnAddOwnerButton();
    }

    @And("user add owner with valid data")
    public void userAddOwnerWithValidData() throws IOException, ParseException {
        jsonDataReader.JsonReader();
        ownerPage.addNewOwner(
                jsonDataReader.firstName,
                jsonDataReader.lastName,
                jsonDataReader.address,
                jsonDataReader.city,
                jsonDataReader.telephone);
    }

    @Then("owner is added Successfully")
    public void ownerIsAddedSuccessfully() throws IOException, ParseException {
        SoftAssert softAssert = new SoftAssert();
        jsonDataReader.JsonReader();

        // Verify and assert on name
        System.out.println(ownerPage.getOwnerNameFromTable().getText());
        softAssert.assertEquals(ownerPage.getOwnerNameFromTable().getText(), jsonDataReader.firstName + " " + jsonDataReader.lastName);
        // Verify and assert on address
        System.out.println(ownerPage.getOwnerAddressFromTable().getText());
        softAssert.assertEquals(ownerPage.getOwnerAddressFromTable().getText(), jsonDataReader.address);
        // Verify and assert on city
        System.out.println(ownerPage.getOwnerCityFromTable().getText());
        softAssert.assertEquals(ownerPage.getOwnerCityFromTable().getText(), jsonDataReader.city);
        // Verify and assert on telephone
        System.out.println(ownerPage.getOwnerTelephoneFromTable().getText());
        softAssert.assertEquals(ownerPage.getOwnerTelephoneFromTable().getText(), jsonDataReader.telephone);
        softAssert.assertAll();
    }

    @When("user click on AddNewPet Button")
    public void userClickOnAddNewPetButton() {
        ownerPage.clickOnAddNewPetButton();
    }

    @And("user add pet for the owner with valid data")
    public void userAddPetForTheOwnerWithValidData() throws IOException, ParseException {
        jsonDataReader.JsonReader();
        ownerPage.addNewPet(
                jsonDataReader.petName,
                jsonDataReader.petBirthdate,
                jsonDataReader.type);
    }

    @Then("pet is added successfully")
    public void petIsAddedSuccessfully() throws IOException, ParseException {
        SoftAssert softAssert = new SoftAssert();
        jsonDataReader.JsonReader();
        // Verify and Assert on pet name
        System.out.println(ownerPage.getPetNameInfo().getText());
        softAssert.assertEquals(ownerPage.getPetNameInfo().getText(), jsonDataReader.petName);
        // Verify and Assert on pet birthdate
        System.out.println(ownerPage.getPetBirthdateInfo().getText());
        softAssert.assertEquals(ownerPage.getPetBirthdateInfo().getText(), jsonDataReader.petBirthdate);
        // Verify and Assert on pet type
        System.out.println(ownerPage.getTypeInfo().getText());
        softAssert.assertEquals(ownerPage.getTypeInfo().getText(), jsonDataReader.type);

    }
}
