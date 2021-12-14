package com.united.steps.sanity_test;

import com.united.pages.sections.Header_Section;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.united.base.Hooks.driver;

public class Header_tabs_Steps {
    @Given("click book tab on the header")
    public void click_book_tab_on_the_header() {
        Header_Section headerSection = new Header_Section(driver);
        headerSection.getHeaders_tabs().size();

    }

    @Then("verify that user seen correct book panel")
    public void verify_that_user_seen_correct_book_panel() {

    }

    @Then("click my trips tab on the header")
    public void click_my_trips_tab_on_the_header() {

    }

    @Then("verify that user seen correct my trips panel")
    public void verify_that_user_seen_correct_my_trips_panel() {

    }

    @Then("click travel info tab in the header")
    public void click_travel_info_tab_in_the_header() {

    }

    @Then("verify that user seen correct travel info panel")
    public void verify_that_user_seen_correct_travel_info_panel() {

    }

    @Then("click MILEAGEPLUS PROGRAM tab in the header")
    public void click_mileageplus_program_tab_in_the_header() {

    }

    @Then("verify that user seen correct MILEAGEPLUS PROGRAM panel")
    public void verify_that_user_seen_correct_mileageplus_program_panel() {

    }

    @Then("click deals tab on the header")
    public void click_deals_tab_on_the_header() {

    }

    @Then("verify that user seen correct deals panel")
    public void verify_that_user_seen_correct_deals_panel() {

    }

    @Then("click help tab on the header")
    public void click_help_tab_on_the_header() {

    }

    @Then("verify that user seen correct help panel")
    public void verify_that_user_seen_correct_help_panel() {


    }
}
