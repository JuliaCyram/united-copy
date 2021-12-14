package com.united.steps.regression_tests.flights;

import com.united.pages.sections.Main_Section;
import com.united.pages.sections.Travelers_Section;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import static com.united.base.Hooks.driver;


public class Travelers_count_Steps {
    @Then("click travelers selector")
    public void click_travelers_selector() {
        Main_Section main_section = new Main_Section(driver);
        main_section.getTraveler_selector_field().click();

    }

    @Then("choose travelers {int} adults")
    public void choose_travelers_adults(Integer int1) {
        Main_Section main_section = new Main_Section(driver);
        for (int i = 0; i < 10; i++) {
            main_section.getTraveler_adult_plus_button().click();
        }
    }

    @Then("verify that user seen {int} travelers")
    public void verify_that_user_seen_travelers(Integer int1) {
        Main_Section main_section = new Main_Section(driver);
        String text = main_section.getTraveler_selector_field().getText();
        Assert.assertTrue(text.contains("9 Adults"));
    }

    @Then("select one traveler from every single passenger type")
    public void select_one_traveler_from_every_single_passenger_type() {
        Travelers_Section travelers_section = new Travelers_Section(driver);
        for (int i = 1; i < 8; i++) {
            travelers_section.getAll_travelers_plus_button().get(i).click();
        }

    }

    @Then("verify that user seen {int} for every single passenger type")
    public void verify_that_user_seen_for_every_single_passenger_type(Integer int1) {
        Travelers_Section travelers_section = new Travelers_Section(driver);
        for (WebElement i : travelers_section.getAll_travelers_counter_inputs()) {
            String result = i.getAttribute("value");
            Assert.assertEquals(result, "i");
        }
    }

    @Then("verify that user seen {int} traveler")
    public void verify_that_user_seen_traveler(Integer int1) {
        Main_Section main_section = new Main_Section(driver);
        String text = main_section.getTraveler_selector_field().getText();
        Assert.assertTrue(text.contains("1 Adult"));
    }

    @Then("click travel with pet")
    public void click_travel_with_pet() throws InterruptedException {
        Travelers_Section travelers_section = new Travelers_Section(driver);
        travelers_section.getTravel_with_pet_link().click();
        Thread.sleep(2000);
        travelers_section.getPet_number_element().click();
        Thread.sleep(2000);
    }

    @Then("verify that user can choose only one pet")
    public void verify_that_user_can_choose_only_one_pet() throws InterruptedException {
        Travelers_Section travelers_section = new Travelers_Section(driver);
        String result = travelers_section.getAdd_pet_element().getAttribute("value");
        Thread.sleep(2000);
        Assert.assertEquals(result, "1 pet");
    }
}

