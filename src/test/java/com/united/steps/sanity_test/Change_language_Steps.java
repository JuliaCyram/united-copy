package com.united.steps.sanity_test;

import com.united.pages.Home_Page;
import com.united.utils.Common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class Change_language_Steps {

    @Given("click select language button on the home page")
    public void click_select_language_button_on_the_home_page() {
        Home_Page home_page = new Home_Page(driver);
        home_page.getLanguage_selector_modal_button().click();

    }

    @Then("click select language")
    public void click_select_language() {
        Home_Page home_page = new Home_Page(driver);
        home_page.getSelect_language_listbox().click();
        Common.waitUntil(home_page.getSelect_language_listbox());
    }

    @Then("choose {string} language")
    public void choose_language(String string) {
        Home_Page home_page = new Home_Page(driver);
        home_page.getDeutsch_language().click();
    }

    @Then("click change button")
    public void click_change_button() throws InterruptedException {
        Home_Page home_page = new Home_Page(driver);
        home_page.getChange_language_button().click();
        Thread.sleep(2000);
    }

    @Then("verify that language was changed")
    public void verify_that_language_was_changed() {
        Home_Page home_page = new Home_Page(driver);
        String text = driver.findElement(By.cssSelector("#hp-sdl-comp-75-30097 > div > div > div > div > h2")).getText();
        Assert.assertTrue(text.contains("Reiseplanung leicht gemacht"));
    }

}
