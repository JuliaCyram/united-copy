package com.united.steps.regression_tests.packages;

import com.united.pages.Packages_Page;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class Packages_Steps {

    @Then("fill out package form")
    public void fill_out_package_form() {
        Packages_Page packages_page = new Packages_Page(driver);
        packages_page.fill_out_vacation_form();

    }

    @Then("verify that user seen vacation search")
    public void verify_that_user_seen_vacation_search() {
        Packages_Page packages_page = new Packages_Page(driver);
        String currentURL = driver.getCurrentUrl();
        String actualURL = "https://packages.united.com/shop/search/?refclickid=uaweb-home-tab1&utm_source=united.com&utm_medium=referral&utm_campaign=hometab&id=31cdd88e-0d27-403b-9940-637171689c67&index=0";
        Assert.assertNotEquals(currentURL, actualURL);
    }

    @Then("verify that room option have only {int} rooms")
    public void verify_that_room_option_have_only_rooms(Integer int1) {
        Packages_Page packages_page = new Packages_Page(driver);
        for (int i = 0; i < 4; i++) {
            packages_page.getVacation_counter_rooms().get(i).click();

        }
    }
    @Then("click {int} rooms option on the package panel")
    public void click_rooms_option_on_the_package_panel(Integer int1) {
        Packages_Page packages_page = new Packages_Page(driver);
        packages_page.getVacation_select_room().click();

    }
    @Then("verify that user seen {string} on the packages")
    public void verify_that_user_seen_on_the_packages(String string) throws InterruptedException {
        Packages_Page packages_page = new Packages_Page(driver);
        String text = packages_page.getVacation_select_room().getAttribute("value");
        Thread.sleep(2000);
        Assert.assertEquals(text, "2 rooms");
    }
}
