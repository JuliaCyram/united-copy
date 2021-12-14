package com.united.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cruise_Page {

    public Cruise_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getCruise_link() {
        return cruise_link;
    }

    @FindBy(css = "#travelTab-panel > div > div > div.app-components-BookFlight-bookFlight__tabListWrapper--1-5vz > div > ul > li.app-components-BookFlight-bookFlight__noPadding--1iEms")
    private WebElement cruise_link;

}
