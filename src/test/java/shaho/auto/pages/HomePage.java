package shaho.auto.pages;

import org.openqa.selenium.By;

import static shaho.auto.stepDefs.Hooks.driver;

public class HomePage {
    // Home page locators
    By veterinarianLink = By.xpath("//a[@title='veterinarians']");

    // Home Functions
    public void clickOnVeterinarianLink() {
        driver.findElement(veterinarianLink).click();
    }
}
