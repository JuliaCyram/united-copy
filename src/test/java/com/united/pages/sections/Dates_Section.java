package com.united.pages.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dates_Section {

    public WebElement getReturn_day() {
        return return_day;
    }

    @FindBy(css = "#flexDay")
    private WebElement return_day;


    public WebElement getDepart_date() {
        return depart_date;
    }

    @FindBy(css = "#passengersSlidingInputContainer > div.app-components-BookFlightForm-bookFlightForm__bookCalendar--1f4qZ > div > div.app-components-FlexibleDates-flexibleDates__expandFlexMonth--3otlX > div")
    private WebElement depart_date;

    public Dates_Section(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getFlexible_dates_option() {
        return flexible_dates_option;
    }

    @FindBy(css = "#flexDatesLabel")
    private WebElement flexible_dates_option;


}
