package com.united.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Packages_Page {

    public WebElement getVacation_select_room() {
        return vacation_select_room;
    }
    public List<WebElement> getVacation_counter_rooms() {
        return vacation_counter_rooms;
    }

    @FindBy (xpath = "'#bookVacationForm > div.atm-c-box.app-components-BookVacationForm-bookVacationForm__packageBlockHomePage--3DZMP > div:nth-child(3) > div > div > div > div > ul'")
    private List<WebElement> vacation_counter_rooms;

    @FindBy (css = "#selectedRooms")
    private WebElement vacation_select_room;

    public void fill_out_vacation_form(){
        vacation_location_from.sendKeys("Washington");
        vacation_destination_to.sendKeys("Moscow");
        vacation_depart_date.sendKeys("Dec 30");
        vacation_return_date.sendKeys("Jan 12");
        vacation_random_place_click.click();
        find_trips_button.click();
    }
    public WebElement getFind_trips_button() {
        return find_trips_button;
    }

    @FindBy(css = "#bookVacationForm > div.app-components-BookVacationForm-bookVacationForm__formRow--2inpd.app-components-BookVacationForm-bookVacationForm__noMargin--iXPoj.app-components-BookVacationForm-bookVacationForm__alignRight--3k16h > button")
    private WebElement find_trips_button;

    public WebElement getVacation_random_place_click() {
        return vacation_random_place_click;
    }

    @FindBy(css = "#app > div > div > div > div.page > div.relativePosition > header")
    private WebElement vacation_random_place_click;

    public WebElement getVacation_depart_date() {
        return vacation_depart_date;
    }

    public WebElement getVacation_return_date() {
        return vacation_return_date;
    }

    @FindBy(css = "#DepartDate")
    private WebElement vacation_depart_date;

    @FindBy(css = "#ReturnDate")
    private WebElement vacation_return_date;

    public WebElement getVacation_destination_to() {
        return vacation_destination_to;
    }

    @FindBy(css = "#vacationDestinationInput")
    private WebElement vacation_destination_to;


    public WebElement getVacation_location_from() {
        return vacation_location_from;
    }

    @FindBy(css = "#vacationOriginInput")
    private WebElement vacation_location_from;


    public Packages_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
