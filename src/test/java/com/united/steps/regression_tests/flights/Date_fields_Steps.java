package com.united.steps.regression_tests.flights;

import com.united.pages.sections.Dates_Section;
import com.united.pages.sections.Main_Section;
import io.cucumber.java.en.Then;
import org.junit.Assert;


import static com.united.base.Hooks.driver;

public class Date_fields_Steps {

    @Then("verify that user seen departing and return date fields")
    public void verify_that_user_seen_departing_and_return_date_fields() {
        Main_Section main_section = new Main_Section(driver);
        boolean depart_date = main_section.getDepartDate_field().isDisplayed();
        boolean return_date = main_section.getReturn_date_field().isDisplayed();
        Assert.assertTrue(depart_date);
        Assert.assertTrue(return_date);
    }

    @Then("verify that user seen departing date field")
    public void verify_that_user_seen_departing_date_field() {
        Main_Section main_section = new Main_Section(driver);
        boolean depart_date = main_section.getDepartDate_field().isDisplayed();
        Assert.assertTrue(depart_date);
    }

    @Then("click flexible dates button")
    public void click_flexible_dates_button() {
        Dates_Section dates_section = new Dates_Section(driver);
        dates_section.getFlexible_dates_option().click();
    }

    @Then("verify that change the Dates field to month and days dropdown")
    public void verify_that_change_the_dates_field_to_month_and_days_dropdown() {
        Dates_Section dates_section = new Dates_Section(driver);
        boolean element = dates_section.getDepart_date().isDisplayed();
        Assert.assertTrue(element);


    }
}
