package com.united.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Car_Page {

    public WebElement getAge_checkbox() {
        return age_checkbox;
    }

    @FindBy (css = "#bookCarForm > div.app-components-BookCarForm-bookCar__middlePanel--H4EFk > div.app-components-BookCarForm-bookCar__checkboxWrapper--3ZxVu.app-components-BookCarForm-bookCar__bookCarDriverAge--1IQr1 > label")
    private WebElement age_checkbox;

    public WebElement getRandom_place() {
        return random_place;
    }

    @FindBy (css = "#app > div > div > div > div.page > div.relativePosition > div > div > div:nth-child(1) > div > main > section")
    private WebElement random_place;


    public WebElement getDriver_age() {
        return driver_age;
    }

    @FindBy (css = "#driversAge")
    private WebElement driver_age;


    public void fill_out_car_form(){
        book_car_pickup_location.sendKeys("Washington");
        book_car_pickup_date.sendKeys("Dec 19");
        book_car_dropoff_date.sendKeys("Dec 26");
        find_car_button.click();
    }

    public WebElement getFind_car_button() {
        return find_car_button;
    }

    @FindBy (css = "#bookCarForm > div.app-components-BookCarForm-bookCar__submitPanel--3dJcx > div.app-components-BookCarForm-bookCar__submitBtnContainer--1lzBn > button")
    private WebElement find_car_button;


    public WebElement getBook_car_dropoff_date() {
        return book_car_dropoff_date;
    }

    @FindBy (css = "#bookCarDropoffDate")
    private WebElement book_car_dropoff_date;


    public WebElement getBook_car_pickup_date() {
        return book_car_pickup_date;
    }

    @FindBy (css = "#bookCarPickupDate")
    private WebElement book_car_pickup_date;


    @FindBy (css = "#bookCarPickupInput")
    private WebElement book_car_pickup_location;

    @FindBy (css = "#driversAge")
    private WebElement car_age_field;

    @FindBy(css = "#hideAgeBox")
    private WebElement driver_age_checkbox;

    @FindBy(css = "#bookCarForm")
    private WebElement book_car_panel_form;

    @FindBy(css = "#showDropOffLocation")
    private WebElement return_car_checkbox;

    public WebElement getBook_car_panel_form() {
        return book_car_panel_form;
    }
    public WebElement getReturn_car_checkbox() {
        return return_car_checkbox;
    }
    public WebElement getDriver_age_checkbox() {
        return driver_age_checkbox;
    }
    public WebElement getCar_age_field() {
        return car_age_field;
    }

    public WebElement getBook_car_pickup_location() {
        return book_car_pickup_location;
    }

    public Car_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
