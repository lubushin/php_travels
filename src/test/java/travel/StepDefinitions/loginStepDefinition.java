package travel.StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import travel.Pages.loginPage;
import travel.Utilities.BrowserUtils;
import travel.Utilities.ConfigurationReader;
import travel.Utilities.Driver;

public class loginStepDefinition extends loginPage {
    loginPage log = new loginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        log.urlLogin();
    }

    @When("user enter Email,password,click Login Button")
    public void user_enter_email_password_click_login_button() {
        log.login();
        BrowserUtils.sleep(2);
    }

    @Then("user logout")
    public void user_logout() {
        log.logout();
    }

    @When("user enter Email,invalid password,click Login Button")
    public void user_enter_email_invalid_password_click_login_button() {
    log.loginInvalidCredentials();
        BrowserUtils.sleep(2);
    }

    @When("Invalid Email or Password message pop up")
    public void verificationText() {
        String actualText = log.popUpAlert.getText();
        String expectedText = "Invalid Email or Password";
        Assert.assertEquals(actualText, expectedText);

        Driver.closeDriver();
    }
}

//@Then("user is able to see headTables on landing page")
//public void user_is_able_to_see_headTables() {
      /* List<String> actualOptions = BrowserUtils.getElementsText(log.menuHeaders);
        BrowserUtils.sleep(3);
       System.out.println("expectedOptions = " + expectedOptions);
        System.out.println("actualOptions = " + actualOptions);

        Assert.assertEquals(actualOptions,expectedOptions);
        BrowserUtils.sleep(3);*/
//}

   /* Then user is able to see headTables on landing page
      | BOOKING    |
              | MY PROFILE |
              | WISHLIST   |
              | NEWSLETTER |*/