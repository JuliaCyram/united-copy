package com.united.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight_status_Page {

    @FindBy(css = "#bookMyTrips > div.app-components-MyTripsForm-myTripsForm__submitCheckinBtnContainer--1e9sE")
    private WebElement flight_status_search_button;

    public WebElement getFlight_status_destination_search_button() {
        return flight_status_destination_search_button;
    }

    @FindBy(css = "#flightStatusDestinationInput-menu-item-0 > button")
    private WebElement flight_status_destination_search_button;

    public WebElement getFlight_not_found_message() {
        return flight_not_found_message;
    }

    @FindBy(css = "#app > div > div > div > div.page > div.relativePosition > div > div > div:nth-child(1) > div > main > section > div > div > div.app-components-HomeTop-homeTop__rightPanelStyle--26pHj > div.app-components-HomeTopRightPanel-homeTopRightPanel__gridParent--1Dqqt > div > div > p")
    private WebElement flight_not_found_message;

    public WebElement getFlight_status_number() {
        return flight_status_number;
    }

    @FindBy(css = "#flightStatusModel\\.flightNumber")
    private WebElement flight_status_number;


    public WebElement getFlight_status_search_button() {
        return flight_status_search_button;
    }


            public WebElement getFlight_status_to(){
            return flight_status_to;
            }

            @FindBy(css = "#flightStatusDestinationInput")
            private WebElement flight_status_to;


            public WebElement getFlight_status_from(){
            return flight_status_from;
            }

            @FindBy(css = "#flightStatusOriginInput")
            private WebElement flight_status_from;

            public Flight_status_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
