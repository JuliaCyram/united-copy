package com.united.steps.regression_tests.flights;

import com.united.pages.sections.Flight_classes_Section;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class Flight_classes_Steps {

    @Then("select Premium economy class")
    public void select_premium_economy_class() throws InterruptedException {
        Flight_classes_Section flight_classes_section = new Flight_classes_Section(driver);
        flight_classes_section.getFlight_class_field().click();
        Thread.sleep(2000);
        flight_classes_section.getPremium_economy_class().click();
        Thread.sleep(2000);

    }

    @Then("verify that user choose Premium economy class")
    public void verify_that_user_choose_premium_economy_class() {
        Flight_classes_Section flight_classes_section = new Flight_classes_Section(driver);
        String text = flight_classes_section.getFlight_class_field().getAttribute("aria-label");
        Assert.assertEquals(text, "Selected Premium economy");
    }

    @Then("select Business or First class")
    public void select_business_or_first_class() throws InterruptedException {
        Flight_classes_Section flight_classes_section = new Flight_classes_Section(driver);
        flight_classes_section.getFlight_class_field().click();
        Thread.sleep(2000);
        flight_classes_section.getBusiness_first_class().click();
        Thread.sleep(2000);
    }

    @Then("verify that user choose Business or First class")
    public void verify_that_user_choose_business_or_first_class() {
        Flight_classes_Section flight_classes_section = new Flight_classes_Section(driver);
        String text = flight_classes_section.getFlight_class_field().getAttribute("aria-label");
        Assert.assertEquals(text, "Selected Business or First");
    }

    @Then("select Economy class")
    public void select_economy_class() throws InterruptedException {
        Flight_classes_Section flight_classes_section = new Flight_classes_Section(driver);
        flight_classes_section.getFlight_class_field().click();
        Thread.sleep(2000);
    }

    @Then("verify that user choose Economy class")
    public void verify_that_user_choose_economy_class() {
        Flight_classes_Section flight_classes_section = new Flight_classes_Section(driver);
        String text = flight_classes_section.getEconomy_class().getAttribute("aria-label");
        Assert.assertEquals(text, "Economy");
    }
}
