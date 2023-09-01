package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_login extends BasePage{
    public P02_login(WebDriver driver) {
        super(driver);
    }
    By EmailField = By.id("Email");
    By PasswordField = By.id("Password");
    By RemembermeOption = By.id("RememberMe");
    By ForgetPassword = By.linkText("Forgot password?");
    By LoginButton = By.xpath("//button[@class='button-1 login-button']");
    public void EnterEmail(){
        SetElementText(EmailField,"test@example.com");
    }
    public void EnterUnValidEmail(){SetElementText(EmailField,"wrong@example.com");}
    public void EnterPassword(){
        SetElementText(PasswordField,"P@ssw0rd");
    }
    public void ClickOnRememberme(){
        ClickOnElement(RemembermeOption);
    }
    public void ClickOnForgetPassword(){
        ClickOnElement(ForgetPassword);
    }
    public void ClickOnLoginButton(){
        ClickOnElement(LoginButton);
    }
}
