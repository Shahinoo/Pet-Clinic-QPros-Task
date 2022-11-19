package shaho.auto.pages;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import shaho.auto.data.JsonDataReader;

import java.io.IOException;
import java.util.List;

import static shaho.auto.stepDefs.Hooks.driver;

public class OwnerPage {

    // locators of owners/find page
    private By findOwnerButton = By.xpath("//button[@type='submit']");
    private By ownersTable = By.id("owners");
    private By addOwnerButton = By.xpath("//a[@href='/owners/new']");

    // Find Owners table rows
    public WebElement getOwnerTableWebEle() {
        return driver.findElement(ownersTable);
    }

    public List<WebElement> getOwnersTableRows() {
        return getOwnerTableWebEle().findElements(By.tagName("tr"));
    }

    // locators of owners/new (Form of add new owner)
    private By firstNameTxtFld = By.id("firstName");
    private By lastNameTxtFld = By.id("lastName");
    private By addressTxtFld = By.id("address");
    private By cityTxtFld = By.id("city");
    private By telephoneTxtFld = By.id("telephone");
    private By addNewOwnerButton = By.xpath("//button[@class='btn btn-default']");


    // locators for Owner Information (used for assertions)
    private By ownerName = By.xpath("//table[1]/tbody/tr[1]/td");
    private By ownerAddress = By.xpath("//table[1]/tbody/tr[2]/td");
    private By ownerCity = By.xpath("//table[1]/tbody/tr[3]/td");
    private By ownerTelephone = By.xpath("//table[1]/tbody/tr[4]/td");

    public WebElement getOwnerNameFromTable() {
        return driver.findElement(ownerName);
    }

    public WebElement getOwnerAddressFromTable() {
        return driver.findElement(ownerAddress);
    }

    public WebElement getOwnerCityFromTable() {
        return driver.findElement(ownerCity);
    }

    public WebElement getOwnerTelephoneFromTable() {
        return driver.findElement(ownerTelephone);
    }

    // locators of adding new Pet
    private By addNewPetButton = By.xpath("//a[2]");
    private By petNameTxtFld = By.id("name");
    private By petBirthdateTxtFld = By.id("birthDate");
    private By petTypeDDL = By.id("type");
    private By submitPetButton = By.cssSelector("[type='submit']");

    public WebElement petTypeListWebEle() {
        return driver.findElement(petTypeDDL);
    }

    // locators for pet Information (used for assertions)
    private By petNameInfo = By.xpath("//dl/dd[1]");
    private By petBirthdateInfo = By.xpath("//dl/dd[2]");
    private By petTypeInfo = By.xpath("//dl/dd[3]");

    public WebElement getPetNameInfo() {
        return driver.findElement(petNameInfo);
    }

    public WebElement getPetBirthdateInfo() {
        return driver.findElement(petBirthdateInfo);
    }

    public WebElement getTypeInfo() {
        return driver.findElement(petTypeInfo);
    }

    // Actions of owners/find page
    public void printOwnerTableElements() {
        for (WebElement row : getOwnersTableRows()) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.println(col.getText());
            }
            System.out.println();
        }
    }

    public void clickOnFindOwnerButton() {
        driver.findElement(findOwnerButton).click();
    }

    public void clickOnAddOwnerButton() {
        driver.findElement(addOwnerButton).click();
    }

    // Actions of Add new owner (owners/new)
    public void addNewOwner(String firstName, String lastName, String address, String city, String telephone) {
        driver.findElement(firstNameTxtFld).sendKeys(firstName);
        driver.findElement(lastNameTxtFld).sendKeys(lastName);
        driver.findElement(addressTxtFld).sendKeys(address);
        driver.findElement(cityTxtFld).sendKeys(city);
        driver.findElement(telephoneTxtFld).sendKeys(telephone);
        driver.findElement(addNewOwnerButton).click();
    }

    // Actions of Add new Pet
    public void clickOnAddNewPetButton() {
        driver.findElement(addNewPetButton).click();
    }

    public void addNewPet(String name, String birthdate, String type) {
        driver.findElement(petNameTxtFld).sendKeys(name);
        driver.findElement(petBirthdateTxtFld).sendKeys(birthdate);
        Select selectOption = new Select(petTypeListWebEle());
        selectOption.selectByValue(type);
        driver.findElement(submitPetButton).click();

    }
}
