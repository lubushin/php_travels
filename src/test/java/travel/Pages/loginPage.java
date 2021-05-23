package travel.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import travel.Utilities.BrowserUtils;
import travel.Utilities.ConfigurationReader;
import travel.Utilities.Driver;

import java.util.List;

public class loginPage {
    public loginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//aside[@class='sidebar-wrapper']")
    public List<WebElement> menuHeaders;

    @FindBy(xpath = "//li[@class='d-none d-md-block fl']")
    public WebElement userAvatar;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//div[.='Invalid Email or Password']")
    public WebElement popUpAlert;

public void urlLogin(){
    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
public void login() {
    String username = ConfigurationReader.getProperty("usernameClient");
    String password = ConfigurationReader.getProperty("passwordClient");
    emailInput.sendKeys(username);
    passwordInput.sendKeys(password);
    loginButton.click();
}
public void logout(){
    userAvatar.click();
    BrowserUtils.sleep(2);
    logoutButton.click();
    Driver.closeDriver();
    }

    public void loginInvalidCredentials(){
        emailInput.sendKeys(ConfigurationReader.getProperty("usernameClient"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("passwordClientInv"));
        loginButton.click();
    }

}



