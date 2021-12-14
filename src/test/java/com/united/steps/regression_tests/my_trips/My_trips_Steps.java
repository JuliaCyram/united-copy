package com.united.steps.regression_tests.my_trips;

import com.united.pages.My_trips_Page;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class My_trips_Steps {

    @Then("verify that section have ink to find United Travel Credits page")
    public void verify_that_section_have_ink_to_find_united_travel_credits_page() {
        My_trips_Page my_trips_page = new My_trips_Page(driver);
        String text = my_trips_page.getTravel_credits_link().getAttribute("aria-label");
        Assert.assertEquals(text, "Find your travel credits");
    }
    @Then("verify that user see error messages when searched without filling up")
    public void verify_that_user_see_error_messages_when_searched_without_filling_up() {
        My_trips_Page my_trips_page = new My_trips_Page(driver);
        String error = my_trips_page.getMy_trips_error_message().getText();
        Assert.assertFalse(error.contains("error"));

    }
    @Then("verify that user have link to find my trips sign in page")
    public void verify_that_user_have_link_to_find_my_trips_sign_in_page() {
        My_trips_Page my_trips_page = new My_trips_Page(driver);
        boolean link = my_trips_page.getMy_trips_sign_in_link().isDisplayed();
        Assert.assertTrue(link);

    }
}
