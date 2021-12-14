package com.united.steps.smoke_test;

import com.united.pages.sections.Main_Section;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



import static com.united.base.Hooks.driver;

public class Searches_for_one_way_Steps {

    @Given("click one way in a main section")
    public void click_one_way_in_a_main_section() {
        Main_Section main_section = new Main_Section(driver);
        main_section.getOne_way_button().click();
    }

    @Then("enter date {string}")
    public void enter_date(String date) {
        Main_Section main_section = new Main_Section(driver);
        main_section.enterDate(date);
    }

}
