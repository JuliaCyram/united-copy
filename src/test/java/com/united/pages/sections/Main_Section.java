package com.united.pages.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class Main_Section {

    public WebElement getAdvanced_search_link() {
        return advanced_search_link;
    }

    @FindBy (css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__basicEconomyToggle--1VE5O > div > div:nth-child(1) > div > div > div.app-components-BookFlightForm-bookFlightForm__allSearchOptions--28ZhM > button")
    private WebElement advanced_search_link;

    public WebElement getTraveler_selector_field() {
        return traveler_selector_field;
    }

    @FindBy(css = "#passengerSelector")
    private WebElement traveler_selector_field;

    public WebElement getReturn_date_field() {
        return return_date_field;
    }

    @FindBy(css = "#ReturnDate")
    private WebElement return_date_field;

    public WebElement getMy_trips_tab() {
        return my_trips_tab;
    }

    @FindBy(css = "#tripsTab")
    private WebElement my_trips_tab;

    public WebElement getCheckIn_tab() {
        return checkIn_tab;
    }

    @FindBy(css = "#checkInTab")
    private WebElement checkIn_tab;

    public WebElement getFlight_status_tab() {
        return flight_status_tab;
    }

    @FindBy(css = "#statusTab")
    private WebElement flight_status_tab;

    public WebElement getBook_cruise_tab() {
        return book_cruise_tab;
    }

    @FindBy(css = "#bookCruiseTab")
    private WebElement book_cruise_tab;

    public WebElement getBook_package_tab() {
        return book_package_tab;
    }

    @FindBy(css = "#bookPackageTab")
    private WebElement book_package_tab;

    public WebElement getBook_car_tab() {
        return book_car_tab;
    }

    @FindBy(css = "#bookCarTab")
    private WebElement book_car_tab;

    public WebElement getBook_hotel_tab() {
        return book_hotel_tab;
    }

    @FindBy(css = "#bookHotelTab")
    private WebElement book_hotel_tab;

    public WebElement getBook_flight_tab() {
        return book_flight_tab;
    }

    @FindBy(css = "#bookFlightTab")
    private WebElement book_flight_tab;

    public WebElement getTraveler_infant_plus_button() {
        return traveler_infant_plus_button;
    }

    @FindBy(css = "#passengerMenuId > div.app-components-PassengerSelector-passengers__passengerMenu__items--lgmNz > div:nth-child(1) > div:nth-child(3) > div > button:nth-child(3)")
    private WebElement traveler_infant_plus_button;

    public WebElement getTraveler_adult_plus_button() {
        return traveler_adult_plus_button;
    }

    @FindBy(css = "#passengerMenuId > div.app-components-PassengerSelector-passengers__passengerMenu__items--lgmNz > div:nth-child(1) > div:nth-child(1) > div > button:nth-child(3)")
    private WebElement traveler_adult_plus_button;

    public WebElement getSwitch_prev_month() {
        return switch_prev_month;
    }

    @FindBy(css = "#passengersSlidingInputContainer > div.app-components-BookFlightForm-bookFlightForm__bookCalendar--1f4qZ > div > div > div > div > div.SingleDatePicker_picker.SingleDatePicker_picker_1.SingleDatePicker_picker__directionLeft.SingleDatePicker_picker__directionLeft_2 > div > div > div:nth-child(1) > div.DayPicker_focusRegion.DayPicker_focusRegion_1 > div.DayPickerNavigation.DayPickerNavigation_1.DayPickerNavigation__horizontal.DayPickerNavigation__horizontal_2 > button.app-containers-BookCalendar-bookCalendar__prevIconContainer--1CBAY")
    private WebElement switch_prev_month;

    public WebElement getDepartDate_field() {
        return departDate_field;
    }

    @FindBy(css = "#DepartDate")
    private WebElement departDate_field;

    public WebElement getCalendar_day_window() {
        return calendar_day_window;
    }

    @FindBy(css = "[aria-label='Saturday, January 15, 2022. Prices from $574']")
    private WebElement calendar_day_window;

    public WebElement getOne_way_button() {
        return one_way_button;
    }

    @FindBy(css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__formHeader--2Hpvk > fieldset > div > label:nth-child(2) > span.app-components-BookFlightForm-bookFlightForm__checkmark--2DHJD")
    private WebElement one_way_button;


    public WebElement getFlightInformationBaseCard() {
        return flightInformationBaseCard;
    }

    @FindBy(css = "#flightResults-content > div.app-components-Shopping-ResultGrid-styles__flightsContainer--3sApV > div:nth-child(1) > div > div:nth-child(1) > div.app-components-Shopping-FlightBaseCard-styles__flightBaseCardContainer--3unlI > div")
    private WebElement flightInformationBaseCard;

    public WebElement getFind_flight_button() {
        return find_flight_button;
    }

    @FindBy(css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__basicEconomyToggle--1VE5O > div > div:nth-child(1) > div > div > button")
    private WebElement find_flight_button;

    @FindBy(xpath = "(//ul[@role='tablist'])[2]/li")
    private List<WebElement> main_table;


    public WebElement getDestination_option() {
        return destination_option;
    }

    @FindBy(xpath = "//strong[contains(text(), 'Moscow')]")
    private WebElement destination_option;


    public WebElement getBookFlightDestinationInput_Menu() {
        return bookFlightDestinationInput_Menu;
    }

    @FindBy(id = "bookFlightDestinationInput")
    private WebElement bookFlightDestinationInput_Menu;


    @FindBy(css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__formHeader--2Hpvk > fieldset > div > label:nth-child(1) > span.app-components-BookFlightForm-bookFlightForm__checkmark--2DHJD")
    private WebElement roundtripButtonMainSection;


    public List<WebElement> getMain_table() {
        return main_table;
    }

    public WebElement getRoundtripButtonMainSection() {
        return roundtripButtonMainSection;
    }

    public Main_Section(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterDate(String date) {
        departDate_field.click();
        departDate_field.clear();
        departDate_field.sendKeys(date);

    }

}
