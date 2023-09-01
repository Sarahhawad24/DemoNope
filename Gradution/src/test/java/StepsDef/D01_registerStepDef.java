package StepsDef;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_homePage;
import pages.P01_register;

public class D01_registerStepDef extends TestBase {
    P03_homePage HomepageObject = new P03_homePage(driver);
    P01_register registerpageObject = new P01_register(driver);

    @Given("user is in homepage")
    public void user_is_in_homepage() {
        HomepageObject.NavigatetoHomePage();
        Assert.assertEquals(driver.getTitle(), "nopCommerce demo store");
    }

    @And("user click on register link button")
    public void userClickOnRegisterLinkButton() {
        HomepageObject.ClickOnRegisterLinkButton();
    }

    @And("user select gender type")
    public void userSelectGenderType() {
        registerpageObject.ClickOnMrsButton();
    }

    @And("user enter firstname")
    public void userEnterFirstname() {
        registerpageObject.EnterFirstName();
    }

    @And("user enter lastname")
    public void userEnterLastname() {
        registerpageObject.EnterLastName();
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        registerpageObject.EnterDays();
        registerpageObject.EnterMonths();
        registerpageObject.EnterYears();
    }

    @And("user enter email")
    public void userEnterEmail() {
        registerpageObject.EnterEmail();
    }

    @And("user enter password")
    public void userEnterPassword() {
        registerpageObject.EnterPassword();
    }

    @And("user confirm password")
    public void userConfirmPassword() {
        registerpageObject.ConfirmPassword();
    }

    @And("user click on register button")
    public void userClickOnRegisterButton() {
        registerpageObject.ClickOnRegisterButton();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        Assert.assertEquals(driver.findElement(By.cssSelector("div.page-body>div")).getText(), "Your registration completed");
    }


}

