package shaho.auto.pages;

import org.openqa.selenium.By;

import static shaho.auto.stepDefs.Hooks.driver;

public class VeterinarianPage {

    // Veterinarian locators
    private By veterinarianTitle = By.xpath("//h2[.='Veterinarians']");


    // Veterinarian functions (behaviors)

    // getters for assertions
    public String getVeterinarianTitle() {
        return driver.findElement(veterinarianTitle).getText();
    }
}
