package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class P03_homePage extends BasePage {
    By RegisterLinkButton = By.linkText("Register");
    By LoginLinkButton = By.linkText("Log in");
    //By Currency = By.id("customerCurrency");
    By Slider = By.cssSelector("div.nivoSlider>a");
    By FaceBookLink = By.linkText("Facebook");
    By TwitterLink = By.linkText("Twitter");
    By RssLink = By.linkText("RSS");
    By YouTubeLink = By.linkText("YouTube");
    By WishListButton = By.cssSelector("div.buttons>button.add-to-wishlist-button");
    By WishListSuccessMessage = By.className("content");
    By WishListLink = By.className("ico-wishlist");
    public P03_homePage(WebDriver driver) {
        super(driver);
    }
    public void SetTextOfSuccessbar(){}

    public void ClickOnRegisterLinkButton() {
        ClickOnElement(RegisterLinkButton);
    }

    public void NavigatetoHomePage() {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    public void ClickOnLoginLinkButton() {
        ClickOnElement(LoginLinkButton);
    }



   public void SelectCurrencies() {
       Select Currency = new Select(driver.findElement(By.id("customerCurrency")));
       Currency.selectByVisibleText("Euro");
       for (int i=0 ; i<=3 ; i++){
       String Currensies =driver.findElements(By.className("actual-price")).get(i).getText();
       Currensies.charAt(0);
       }
   }
    public void ClickOnFirstSlider() {
        driver.findElements(Slider).get(0).click();
    }

    public void ClickOnSeconedSlider() {
        driver.findElements(Slider).get(0).click();
    }

    public void ClickOnFaceBookIcon() {
        ClickOnElement(FaceBookLink);
        ArrayList <String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));


    }

    public void ClickOnTwitterIcon() {
        ClickOnElement(TwitterLink);
        ArrayList <String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
    }

    public void ClickOnRssIcon() {
        ClickOnElement(RssLink);

    }

    public void ClickOnYouTubeIcon() {
        ClickOnElement(YouTubeLink);
        ArrayList <String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(3));
    }

    public void ClickOnFirstWishListButton() {
        ScrollElementView(WishListButton);
        driver.findElements(WishListButton).get(0).click();
    }

    public void ClickOnSecondWishListButton() {
        ScrollElementView(WishListButton);
        driver.findElements(WishListButton).get(1).click();
    }

    public void ClickOnHTCWishListButton() {

        ScrollElementView(WishListButton);
        driver.findElements(WishListButton).get(2).click();
    }

    public void ClickOnFourthWishListButton() {
        ScrollElementView(WishListButton);
        driver.findElements(WishListButton).get(3);
    }
public String WishListSuccessMessage(){
        return
        GetText(WishListSuccessMessage);

}
    public void ClickOnWishListLink() {
        ClickOnElement(WishListLink);
    }
}