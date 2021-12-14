package com.united.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_trips_Page {
    public WebElement getMy_trips_sign_in_link() {
        return my_trips_sign_in_link;
    }

    @FindBy(css = "#bookMyTrips > div.app-components-MyTripsForm-myTripsForm__myTripsDetails--1T4pL > span > a")
    private WebElement my_trips_sign_in_link;

    public WebElement getMy_trips_error_message() {
        return my_trips_error_message;
    }

    @FindBy(css = "#myTripsLastName_aria")
    private WebElement my_trips_error_message;

    public WebElement getTravel_credits_link() {
        return travel_credits_link;
    }

    @FindBy(css = "#bookMyTrips > div.app-components-MyTripsForm-myTripsForm__findTravelCredits--1wte7 > a")
    private WebElement travel_credits_link;

    public My_trips_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
