package com.united.steps.regression_tests.check_in;

import com.united.pages.Check_in_Page;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class Check_in_Steps {

    @Then("click continue to check-in button")
    public void click_continue_to_check_in_button() {
        Check_in_Page check_in_page = new Check_in_Page(driver);
        check_in_page.getContinue_button_new_page().click();
    }

    @Then("click continue button on the new check-in page")
    public void click_continue_button_on_the_new_check_in_page() {
        Check_in_Page check_in_page = new Check_in_Page(driver);
        check_in_page.getContinue_button_new_page().click();
    }

    @Then("verify that user seen error message when searched without filling up")
    public void verify_that_user_seen_error_message_when_searched_without_filling_up() {
        Check_in_Page check_in_page = new Check_in_Page(driver);
        String text = check_in_page.getError_message().getText();
        Assert.assertTrue(text.contains("Error: Please enter your last name."));
    }
    @Then("click details link")
    public void click_details_link() {
        Check_in_Page check_in_page = new Check_in_Page(driver);
        check_in_page.getCheck_in_details_link();

    }
    @Then("verify that after click link user navigates to correct page")
    public void verify_that_after_click_link_user_navigates_to_correct_page() {
        Check_in_Page check_in_page = new Check_in_Page(driver);
        String currentURL = driver.getCurrentUrl();
        String actualURL = "https://www.united.com/ual/en/US/fly/travel/airport/process.html";
        Assert.assertNotEquals(currentURL, actualURL);
    }
    @Then("click MilesPlus link")
    public void click_miles_plus_link() throws InterruptedException {
        Check_in_Page check_in_page = new Check_in_Page(driver);
        check_in_page.getCheck_in_MilesPlus_link().click();
        Thread.sleep(2000);
    }
    @Then("verify that after click MilesPlus link user navigates to correct page")
    public void verify_that_after_click_miles_plus_link_user_navigates_to_correct_page() {
        Check_in_Page check_in_page = new Check_in_Page(driver);
        String currentURL = driver.getCurrentUrl();
        String actualURL = "https://www.united.com/en/us/checkin";
        Assert.assertNotEquals(currentURL, actualURL);
    }
}
