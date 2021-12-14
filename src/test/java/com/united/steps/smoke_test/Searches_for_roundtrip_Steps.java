package com.united.steps.smoke_test;

import com.united.pages.sections.Dates_Section;
import com.united.pages.sections.Main_Section;
import com.united.utils.Common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;


import static com.united.base.Hooks.driver;

public class Searches_for_roundtrip_Steps {

    @Given("click roundtrip in a main section")
    public void click_roundtrip_in_a_main_section()  {
        Main_Section main_section = new Main_Section(driver);
        Common.waitUntil(main_section.getRoundtripButtonMainSection());
        main_section.getRoundtripButtonMainSection().click();
    }

    @Then("enter {string} Flight Destination Input")
    public void enter_flight_destination_input(String string) throws InterruptedException {
        Main_Section main_section = new Main_Section(driver);
        Common.waitUntil(main_section.getBookFlightDestinationInput_Menu());
        main_section.getBookFlightDestinationInput_Menu().sendKeys("Moscow");
        Thread.sleep(2000);
        main_section.getDestination_option().click();
        Thread.sleep(1000);
    }

    @Then("enter depart date")
    public void enter_depart_date() {
        Dates_Section dates_section = new Dates_Section(driver);
        dates_section.getDepart_date().sendKeys("Dec 18");
    }

    @Then("enter date return date")
    public void enter_date_return_date() {
        Dates_Section dates_section = new Dates_Section(driver);
        dates_section.getReturn_day().click();
    }

    @Then("click {string} button")
    public void click_button(String string)  {
        Main_Section main_section = new Main_Section(driver);
        Common.waitUntil(main_section.getFind_flight_button());
        main_section.getFind_flight_button().click();
    }

    @Then("verify that user seen available flights are displayed")
    public void verify_that_user_seen_available_flights_are_displayed()  {
        Main_Section main_section = new Main_Section(driver);
        Common.waitUntil(main_section.getFlightInformationBaseCard());
        boolean flight_info = driver.findElement(By.cssSelector("#flightResults-content > div.app-components-Shopping-ResultGrid-styles__flightsContainer--3sApV > div:nth-child(1) > div > div:nth-child(1) > div.app-components-Shopping-FlightBaseCard-styles__flightBaseCardContainer--3unlI > div")).isDisplayed();
        Assert.assertTrue(flight_info);
    }
}
