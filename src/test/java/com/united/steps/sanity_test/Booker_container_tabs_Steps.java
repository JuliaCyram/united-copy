package com.united.steps.sanity_test;

import com.united.pages.sections.Main_Section;
import com.united.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class Booker_container_tabs_Steps {


    @Given("click book flight on the main section")
    public void click_book_flight_on_the_main_section() {
        Main_Section main_section = new Main_Section(driver);
        main_section.getBook_flight_tab().click();
        Common.waitUntil(main_section.getBook_flight_tab());
    }

    @And("verify that user seen book flight tab")
    public void verify_that_user_seen_book_flight_tab() {
        Main_Section main_section = new Main_Section(driver);
        String text = driver.findElement(By.cssSelector("#cabinType > div")).getText();
        Assert.assertTrue(text.contains("Economy"));
    }

    @Then("click book hotel on the main section")
    public void click_book_hotel_on_the_main_section() {
        Main_Section main_section = new Main_Section(driver);
        main_section.getBook_hotel_tab().click();
        Common.waitUntil(main_section.getBook_hotel_tab());
    }

    @And("verify that user seen book hotel tab")
    public void verify_that_user_seen_book_hotel_tab() {
        Main_Section main_section = new Main_Section(driver);
        String text = driver.findElement(By.cssSelector("#roomsDropdown")).getText();
        Assert.assertTrue(text.contains("room"));
    }

    @Then("click book car on the main section")
    public void click_book_car_on_the_main_section() {
        Main_Section main_section = new Main_Section(driver);
        main_section.getBook_car_tab().click();
    }

    @And("verify that user seen book car tab")
    public void verify_that_user_seen_book_car_tab() {
        Main_Section main_section = new Main_Section(driver);
        String text = driver.findElement(By.cssSelector("#bookCarForm > div.app-components-BookCarForm-bookCar__middlePanel--H4EFk > div.app-components-BookCarForm-bookCar__bookCarCalendar--3QenL.app-components-BookCarForm-bookCar__bookCarCalendarSameLocation--3IBAr > label")).getText();
        Assert.assertTrue(text.contains("Rental dates*"));
    }

    @Then("click book packages on the main section")
    public void click_book_packages_on_the_main_section() {
        Main_Section main_section = new Main_Section(driver);
        main_section.getBook_package_tab().click();
    }

    @And("verify that user seen book packages")
    public void verify_that_user_seen_book_packages() {
        Main_Section main_section = new Main_Section(driver);
        boolean text = driver.findElement(By.cssSelector("#bookVacationForm > div.app-components-BookVacationForm-bookVacationForm__formRow--2inpd.app-components-BookVacationForm-bookVacationForm__formRow__shorter--3XiEV > fieldset > div > ul > li:nth-child(2) > label")).isDisplayed();
        Assert.assertTrue(text);
    }

    @Then("click book cruise on the main section")
    public void click_book_cruise_on_the_main_section() {
        Main_Section main_section = new Main_Section(driver);
        main_section.getBook_cruise_tab().click();
        Common.waitUntil(main_section.getBook_cruise_tab());
    }

    @And("verify that user seen a new page with cruise")
    public void verify_that_user_seen_a_new_page_with_cruise() {
        Main_Section main_section = new Main_Section(driver);
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://cruises.united.com/?cm_mmc=Link-_-UAL-Site_Referral-_-20150925-HP_SW-_-Generic_HP&utm_medium=partner_site_hp_sw&utm_source=ual-united.com&utm_campaign=20180801&utm_content=home_sw";
        Assert.assertNotEquals(actualURL, expectedURL);
    }

    @Then("click flight status on the main section")
    public void click_flight_status_on_the_main_section() {
        Main_Section main_section = new Main_Section(driver);
        main_section.getFlight_status_tab().click();
        Common.waitUntil(main_section.getFlight_status_tab());
    }

    @And("verify that user seen flight status tab")
    public void verify_that_user_seen_flight_status_tab() {
        Main_Section main_section = new Main_Section(driver);
        boolean result = driver.findElement(By.cssSelector("#flightStatusModel a")).isDisplayed();
        Assert.assertTrue(result);
    }

    @Then("click check-in on the main section")
    public void click_check_in_on_the_main_section() {
        Main_Section main_section = new Main_Section(driver);
        main_section.getCheckIn_tab().click();
        Common.waitUntil(main_section.getCheckIn_tab());
    }

    @And("verify that user seen check-in tab")
    public void verify_that_user_seen_check_in_tab() {
        Main_Section main_section = new Main_Section(driver);
        Common.waitUntil(main_section.getCheckIn_tab());
        String text = driver.findElement(By.cssSelector("#checkInTab-panel > div > div > div.mm-qr-code-barcode-and-details > div.mm-qr-code-details-container > div > div:nth-child(3)")).getText();
        Assert.assertTrue(text.contains("Check your flight status"));
    }

    @Then("click my trips on the main section")
    public void click_my_trips_on_the_main_section() {
        Main_Section main_section = new Main_Section(driver);
        main_section.getMy_trips_tab().click();
        Common.waitUntil(main_section.getMy_trips_tab());
    }

    @And("verify that user seen my trips tab")
    public void verify_that_user_seen_my_trips_tab() {
        Main_Section main_section = new Main_Section(driver);
        String text = driver.findElement(By.cssSelector("#myTripsConfirmationNumber_label")).getText();
        Assert.assertTrue(text.contains("Confirmation number*"));
    }

}
