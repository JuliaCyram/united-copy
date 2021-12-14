package com.united.pages.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import java.util.List;

public class Travelers_Section {

    public WebElement getAdd_pet_element() {
        return add_pet_element;
    }

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[2]/button/span")
    private WebElement add_pet_element;

    public WebElement getPet_number_element() {
        return pet_number_element;
    }

    @FindBy(css = "select[name='bookFlightModel.advancedSearch.petCabin']")
    private WebElement pet_number_element;

    public WebElement getTravel_with_pet_link() {
        return travel_with_pet_link;
    }

    @FindBy (css = "#passengerMenuId > div:nth-child(3) > button > span")
    private WebElement travel_with_pet_link;

    public WebElement getOne_traveler() {
        return one_traveler;
    }

    @FindBy(css = "#passengerSelector > button")
    private WebElement one_traveler;

    public List<WebElement> getAll_travelers_counter_inputs() {
        return all_travelers_counter_inputs;
    }

    @FindBy(xpath = "//div/div/div/button[text()='1']")
    private List<WebElement> all_travelers_counter_inputs;


    public List<WebElement> getAll_travelers_plus_button() {
        return all_travelers_plus_button;
    }

    @FindBy(xpath = "//div/div/div/button[text()='+']")
    private List<WebElement> all_travelers_plus_button;


    public Travelers_Section(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
