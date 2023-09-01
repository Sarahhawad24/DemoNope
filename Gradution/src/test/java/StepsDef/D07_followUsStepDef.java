package StepsDef;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.P03_homePage;

public class D07_followUsStepDef extends TestBase {
    P03_homePage HomepageObject = new P03_homePage(driver);

    @And("user click on facebook icon")
    public void userClickOnFacebookIcon() {
        HomepageObject.ClickOnFaceBookIcon();
    }

    @Then("user redirect to facebook account page")
    public void userRedirectToFacebookAccountPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce");
    }


    @And("user click on twitter icon")
    public void userClickOnTwitterIcon() {
        HomepageObject.ClickOnTwitterIcon();
    }

    @Then("user redirect to twitter account page")
    public void userRedirectToTwitterAccountPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://twitter.com/nopCommerce");
    }


    @And("user click on RSS icon")
    public void userClickOnRSSIcon() {
        HomepageObject.ClickOnRssIcon();
    }

    @Then("user redirect to RSS account page")
    public void userRedirectToRSSAccountPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open");
    }

    @And("user click on youtube icon")
    public void userClickOnYoutubeIcon() {
        HomepageObject.ClickOnYouTubeIcon();
    }

    @Then("user redirect to youtube page")
    public void userRedirectToYoutubePage() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
    }
}
