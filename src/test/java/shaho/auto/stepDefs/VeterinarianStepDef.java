package shaho.auto.stepDefs;

import io.cucumber.java.en.When;
import org.testng.Assert;
import shaho.auto.pages.HomePage;
import shaho.auto.pages.VeterinarianPage;

public class VeterinarianStepDef {
    HomePage homePage = new HomePage();
    VeterinarianPage veterinarianPage = new VeterinarianPage();

    @When("Find veterinarian Title")
    public void findVeterinarianTitle() {
        homePage.clickOnVeterinarianLink();
        System.out.println(veterinarianPage.getVeterinarianTitle());
        Assert.assertEquals(veterinarianPage.getVeterinarianTitle(), "Veterinarians");
    }
}
