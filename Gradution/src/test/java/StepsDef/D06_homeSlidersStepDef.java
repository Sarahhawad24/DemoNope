package StepsDef;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.P03_homePage;

public class D06_homeSlidersStepDef extends TestBase {
   P03_homePage HomepageObject = new P03_homePage(driver);

    @And("user click on first slider in homepage")
    public void userClickOnFirstSliderInHomepage() {
        HomepageObject.ClickOnFirstSlider();
    }

    @Then("the page will redirect to nokia page")
    public void thePageWillRedirectToNokiaPage() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @And("user click on second slider in homepage")
    public void userClickOnSecondSliderInHomepage() {
    HomepageObject.ClickOnSeconedSlider();
    }

    @Then("the page will redirect to iphone")
    public void thePageWillRedirectToIphone() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");
    }
}
