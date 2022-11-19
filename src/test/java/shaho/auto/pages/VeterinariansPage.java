package shaho.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static shaho.auto.stepDefs.Hooks.driver;

public class VeterinariansPage {

    // Veterinarian locators
    private By veterinarianTitle = By.xpath("//h2[.='Veterinarians']");
    private By veterinarianTable = By.id("vets");

    // for assertions
    public WebElement getVeterinarianTitleWebEle() {
        return driver.findElement(veterinarianTitle);
    }

    public WebElement getVeterinarianTableWebEl() {
        return driver.findElement(veterinarianTable);
    }

    public List<WebElement> getVeterinariansRows() {
        return getVeterinarianTableWebEl().findElements(By.tagName("tr"));
    }

    // actions
    public void printTableElements() {
        for (WebElement row : getVeterinariansRows()) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.println(col.getText());
            }
            System.out.println();
        }

    }
}
