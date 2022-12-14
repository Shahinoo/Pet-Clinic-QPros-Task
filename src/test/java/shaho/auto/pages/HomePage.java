package shaho.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static shaho.auto.stepDefs.Hooks.driver;

public class HomePage {
    // Home page locators
    private By homePageLink = By.xpath("//a[@title='home page']");
    private By veterinarianPageLink = By.xpath("//a[@title='veterinarians']");
    private By findOwnerPageLink = By.xpath("//a[@title='find owners']");
    private By welcomeImage = By.cssSelector(".img-responsive");
    private By qProsImage = By.cssSelector("[alt='Sponsored by Pivotal']");

    // For assertions
    public WebElement getWelcomeImageWebEle() {
        return driver.findElement(welcomeImage);
    }

    public WebElement getQProsImageWebEle() {
        return driver.findElement(qProsImage);
    }


    // Home Functions
    public void clickOnVeterinarianLink() {
        driver.findElement(veterinarianPageLink).click();
    }

    public void clickOnFindOwnerPageLink() {
        driver.findElement(findOwnerPageLink).click();
    }

}
