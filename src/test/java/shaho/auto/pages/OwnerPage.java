package shaho.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static shaho.auto.stepDefs.Hooks.driver;

public class OwnerPage {

    // locators
    private By findOwnerButton = By.xpath("//button[@type='submit']");
    private By ownersTable = By.id("owners");

    public WebElement getOwnerTableWebEle () {
        return driver.findElement(ownersTable);
    }
    // Find Owners table rows
    public List<WebElement> getOwnersTableRows() {
        return getOwnerTableWebEle().findElements(By.tagName("tr"));
    }
    // Actions
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
}
