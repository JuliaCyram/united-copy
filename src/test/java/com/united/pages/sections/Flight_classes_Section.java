package com.united.pages.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight_classes_Section {

    public WebElement getEconomy_class() {
        return economy_class;
    }

    @FindBy (css = "#cabinType_item-0")
    private WebElement economy_class;

    public WebElement getBusiness_first_class() {
        return business_first_class;
    }

    @FindBy(css = "#cabinType_item-2")
    private WebElement business_first_class;

    public WebElement getPremium_economy_class() {
        return premium_economy_class;
    }

    @FindBy(css = "#cabinType_item-1")
    private WebElement premium_economy_class;


    public WebElement getFlight_class_field() {
        return flight_class_field;
    }

    @FindBy(css = "#cabinType")
    private WebElement flight_class_field;


    public Flight_classes_Section(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
