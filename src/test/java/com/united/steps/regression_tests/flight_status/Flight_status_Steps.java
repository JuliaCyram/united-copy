package com.united.steps.regression_tests.flight_status;

import com.united.pages.Flight_status_Page;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class Flight_status_Steps {

    @Then("fill out leaving from and going to")
    public void fill_out_leaving_from_and_going_to() {
        Flight_status_Page flight_status_page = new Flight_status_Page(driver);
        flight_status_page.getFlight_status_from().sendKeys("Washington");
        flight_status_page.getFlight_status_to().sendKeys("Moscow");
    }

    @Then("click search button")
    public void click_search_button() {
        Flight_status_Page flight_status_page = new Flight_status_Page(driver);
        flight_status_page.getFlight_status_search_button().click();
    }

    @Then("verify that user can see new page with flights")
    public void verify_that_user_can_see_new_page_with_flights() {
        Flight_status_Page flight_status_page = new Flight_status_Page(driver);
        String currentURL = driver.getCurrentUrl();
        String actualURL = "https://www.united.com/en/us/flightstatus/results/route/2021-12-13/IAD/MOW/UA";
        Assert.assertNotEquals(currentURL, actualURL);
    }

    @Then("enter flight invalid number")
    public void enter_flight_invalid_number() throws InterruptedException {
        Flight_status_Page flight_status_page = new Flight_status_Page(driver);
        flight_status_page.getFlight_status_to().sendKeys("Moscow");
        flight_status_page.getFlight_status_destination_search_button().click();
        Thread.sleep(2000);
        flight_status_page.getFlight_status_number().sendKeys("9999");
        flight_status_page.getFlight_status_search_button().click();
        Thread.sleep(3000);
    }

    @Then("verify that user seen error message")
    public void verify_that_user_seen_error_message() throws InterruptedException {
        Flight_status_Page flight_status_page = new Flight_status_Page(driver);
        Thread.sleep(2000);
        boolean error_message = flight_status_page.getFlight_not_found_message().isDisplayed();
        Assert.assertTrue(error_message);

    }
}
