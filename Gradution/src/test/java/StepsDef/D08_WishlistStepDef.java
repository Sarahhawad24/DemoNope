package StepsDef;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_homePage;

public class D08_WishlistStepDef extends TestBase {
    P03_homePage HomePageObject = new P03_homePage(driver);


    @And("user click on this product HTC")
    public void userClickOnThisProductHTC() {
        HomePageObject.ClickOnHTCWishListButton();
    }

    @Then("user will see the success message appear")
    public void userWillSeeTheSuccessMessageAppear() {
        Assert.assertEquals(HomePageObject.WishListSuccessMessage(), "The product has been added to your wishlist");
        String S = driver.findElement(By.className("bar-notification")).getCssValue("background-color");
        Assert.assertEquals( S, "rgba(75, 176, 122, 1)");
        System.out.println(S);

    }

    @And("click on WishListLink")
    public void clickOnWishListLink() {
        HomePageObject.ClickOnWishListLink();
    }
}
