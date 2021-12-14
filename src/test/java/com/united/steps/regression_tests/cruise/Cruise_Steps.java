package com.united.steps.regression_tests.cruise;

import com.united.pages.Cruise_Page;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class Cruise_Steps {

    @Then("click book cruise link")
    public void click_book_cruise_link() {
        Cruise_Page cruise_page = new Cruise_Page(driver);
        cruise_page.getCruise_link().click();

    }

    @Then("verify that after click user navigate to United Cruises page")
    public void verify_that_after_click_user_navigate_to_united_cruises_page() {
        Cruise_Page cruise_page = new Cruise_Page(driver);
        String currentURL = driver.getCurrentUrl();
        String actualURL = "https://cruises.united.com/?cm_mmc=Link-_-UAL-Site_Referral-_-20150925-HP_SW-_-Generic_HP&utm_medium=partner_site_hp_sw&utm_source=ual-united.com&utm_campaign=20180801&utm_content=home_sw";
        Assert.assertNotEquals(currentURL, actualURL);
    }
}
