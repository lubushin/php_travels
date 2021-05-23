package travel.StepDefinitions;

import io.cucumber.java.en.*;
import travel.Pages.loginPage;
import travel.Pages.functionHomePage;
import travel.Utilities.BrowserUtils;

public class HomePageStepDefinition extends loginPage{
loginPage log = new loginPage();
functionHomePage fHP = new functionHomePage();

    @Given("user is on HOME page")
    public void user_is_on_home_page() {
    log.urlLogin();
    log.login();
    BrowserUtils.sleep(3);
    fHP.homeButton.click();
    }

    @Then("user see Latest on Blogs news")
    public void user_see_latest_on_blogs_news() {

    }

    @Then("user click on visa button")
    public void user_click_on_visa_button() {

    }

}
