package com.united.pages.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leaving_going_Section {
    public WebElement getRemove_button_going_to() {
        return remove_button_going_to;
    }

    @FindBy(css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__nearbyAirPort--1dCq7 > div > div:nth-child(1) > div > div > div.app-components-BookFlightForm-bookFlightForm__destinationPickupContainer--1_8vd > div > button")
    private WebElement remove_button_going_to;

    public WebElement getRemove_button_in_leaving_from() {
        return remove_button_in_leaving_from;
    }

    @FindBy(css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__nearbyAirPort--1dCq7 > div > div:nth-child(1) > div > div > div.app-components-BookFlightForm-bookFlightForm__pickupContainer--Gekxg > div > button.atm-c-btn.app-components-QueryBuilder-styles__clearButton--dzha6.app-components-QueryBuilder-styles__panelIsOpen--2oyfn.atm-c-btn--bare")
    private WebElement remove_button_in_leaving_from;


    public WebElement getLeaving_from_field() {
        return leaving_from_field;
    }

    @FindBy(css = "#bookFlightOriginInput")
    private WebElement leaving_from_field;

    public WebElement getArrows_switch() {
        return arrows_switch;
    }

    @FindBy(css = "#bookFlightForm > div.app-components-BookFlightForm-bookFlightForm__nearbyAirPort--1dCq7 > div > div:nth-child(1) > div > div > button")
    private WebElement arrows_switch;

    public WebElement getGoing_to_field() {
        return going_to_field;
    }

    public void fill_out_leaving_and_going_field() {
        leaving_from_field.sendKeys("Washington IAD");
        going_to_field.sendKeys("Moscow MOW");
    }

    @FindBy(css = "#bookFlightDestinationInput")
    private WebElement going_to_field;


    public Leaving_going_Section(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
