package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class P01_register extends BasePage{
    By MrsButton = By.id("gender-female");
By FirstNameField = By.id("FirstName");
By LastNameField = By.id("LastName");
By RegisterEmailField = By.id("Email");
By CompanyNameField = By.id("Company");
By NewsletterButton = By.id("Newsletter");
By PasswordField = By.id("Password");
By ConfirmPasswordField=By.id("ConfirmPassword");
By RegisterButton = By.id("register-button");

    public P01_register(WebDriver driver) {
        super(driver);
    }


    public void ClickOnMrsButton (){
        ClickOnElement(MrsButton);
    }
    public void EnterFirstName(){
        SetElementText(FirstNameField,"automation");
    }
    public void EnterLastName(){
        SetElementText(LastNameField,"test");
    }
    public void EnterDays(){
        Select Day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        Day.selectByValue("24");
    }
    public void EnterMonths(){
        Select Month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        Month.selectByValue("9");
    }
    public void EnterYears(){
        Select Year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        Year.selectByValue("2000");
    }
    public void EnterEmail(){
        SetElementText(RegisterEmailField , "test@example.com");
    }
    public void EnterCompanyName(){
        SetElementText(CompanyNameField,"A");
    }
    public void SelectNewSletterOption(){
        ClickOnElement(NewsletterButton);
    }
    public void EnterPassword(){
        SetElementText(PasswordField,"P@ssw0rd");
    }
    public void ConfirmPassword(){
        SetElementText(ConfirmPasswordField,"P@ssw0rd");
    }
    public void ClickOnRegisterButton(){
        ClickOnElement(RegisterButton);
    }
}
