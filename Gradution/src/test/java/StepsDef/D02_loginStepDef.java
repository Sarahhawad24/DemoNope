package StepsDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_homePage;
import pages.P02_login;

import base.TestBase;

public class D02_loginStepDef extends TestBase {
    P03_homePage HomepageObject = new P03_homePage(driver);
    P02_login loginpageObject = new P02_login(driver);

    @And("user click on loginlink button")
    public void userClickOnLoginlinkButton() {
        HomepageObject.ClickOnLoginLinkButton();
    }

    @Then("user redirect to the login page")
    public void userRedirectToTheLoginPage() {
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store. Login");
    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
        loginpageObject.ClickOnLoginButton();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
//        Assert.assertEquals(driver.findElement(By.cssSelector("div.topic-block-title > h2")),"Welcome to our store");
        Assert.assertEquals(driver.findElement(By.linkText("My account")).getText(),"My account");
        
    }

    @And("user enter unvalid email")
    public void userEnterUnvalidEmail() {
        loginpageObject.EnterUnValidEmail();
    }

    @Then("an error message will appeare")
    public void anErrorMessageWillAppeare() {
        Assert.assertEquals(driver.findElement(By.cssSelector("form>div.message-error")).getText(),"Login was unsuccessful. Please correct the errors and try again.");
    }
}
