package com.united.steps.regression_tests.flights;

import com.united.pages.sections.Main_Section;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.united.base.Hooks.driver;


public class Advanced_search_Steps {
    @Then("click advanced search")
    public void click_advanced_search() throws InterruptedException {
        Main_Section main_section = new Main_Section(driver);
        main_section.getAdvanced_search_link().click();
        Thread.sleep(2000);

    }

    @Then("verify that after click open a separate page with more advanced search fields")
    public void verify_that_after_click_open_a_separate_page_with_more_advanced_search_fields() throws InterruptedException {
        Main_Section main_section = new Main_Section(driver);
        Thread.sleep(3000);
        String currentURL = driver.getCurrentUrl();
        String actualURL = "https://www.united.com/en/us/";
        Assert.assertNotEquals(currentURL, actualURL);
    }
}
