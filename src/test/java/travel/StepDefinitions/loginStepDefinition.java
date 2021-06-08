package travel.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import travel.Pages.loginPage;
import travel.Utilities.BrowserUtils;
import travel.Utilities.Driver;

import java.util.List;

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

    @Then("user is able to see headTables on landing page:")
    public void user_is_able_to_see_headTables(List<String> expectedOptions) {
        List<String> actualOptions = BrowserUtils.getElementsText(log.menuHeaders);


       // Assert.assertEquals(actualOptions,expectedOptions);
        System.out.println("expectedOptions = " + expectedOptions);
        System.out.println("actualOptions = " + actualOptions);

         //System.out.println("actualOptions.get(i) = " + actualOptions.get(i));
         //System.out.println("expectedOptions.get(i) = " + expectedOptions.get(i));
     }






    @Then("user logout")
    public void user_logout() {
        log.logout();

        Driver.closeDriver();
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