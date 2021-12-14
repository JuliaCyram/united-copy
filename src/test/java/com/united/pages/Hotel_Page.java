package com.united.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Page {

    public void fill_out_hotel_form() throws InterruptedException {
        hotel_going_to_field.sendKeys("Moscow");
        hotel_date_check_in.sendKeys("Jan 17");
        hotel_date_check_out.sendKeys("Jan 19");
        Thread.sleep(1000);
        randomPlace.click();
        Thread.sleep(1000);
        find_hotel_button.click();
    }

    @FindBy(css = "header[role='banner']")
    private WebElement randomPlace;

    @FindBy(css = "#bookHotelTab-panel > form > button")
    private WebElement find_hotel_button;

    @FindBy(css = "#bookHotelInput")
    private WebElement hotel_going_to_field;

    @FindBy(css = "#bookHotelCheckinDate")
    private WebElement hotel_date_check_in;

    @FindBy(css = "#bookHotelCheckoutDate")
    private WebElement hotel_date_check_out;

    public WebElement getSelect_maximum_room() {
        return select_maximum_room;
    }

    @FindBy(css = "#roomsDropdown > div")
    private WebElement select_maximum_room;

    public WebElement getHotel_children_plusBtn() {
        return hotel_children_plusBtn;
    }

    @FindBy(css = "#Children\\ plusBtn")
    private WebElement hotel_children_plusBtn;

    public WebElement getHotel_adult_plusBtn() {
        return hotel_adult_plusBtn;
    }

    @FindBy(css = "#Adults\\ plusBtn")
    private WebElement hotel_adult_plusBtn;


    public WebElement getHotel_number_travelers() {
        return hotel_number_travelers;
    }

    @FindBy(css = "#bookHotelModel\\.passengers")
    private WebElement hotel_number_travelers;

    public WebElement getHotel_room_field() {
        return hotel_room_field;
    }

    @FindBy(css = "#roomsDropdown")
    private WebElement hotel_room_field;


    public WebElement getBook_hotel_panel_form() {
        return book_hotel_panel_form;
    }

    @FindBy(css = "#bookHotelTab-panel>form")
    private WebElement book_hotel_panel_form;


    public Hotel_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
