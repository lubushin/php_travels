package travel.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import travel.Utilities.Driver;

import java.util.List;

public class functionHomePage {
    public functionHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='home']")
    public WebElement homeButton;
//.='Home'
    @FindBy(xpath = "//nav[@class='menu-horizontal-02']")
    public WebElement menuBar;

    @FindBy(xpath = "//a[@data-name='visa']")
    public WebElement visa;

    @FindBy(xpath = "//div[@class='chosen-container chosen-container-single']")
    public WebElement selectCountry;

    @FindBy(xpath = "//h2[.='Latest on blogs']")
    List<WebElement> latestOnBlogs;



}
