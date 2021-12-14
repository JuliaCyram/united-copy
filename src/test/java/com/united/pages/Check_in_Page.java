package com.united.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_in_Page {

    public WebElement getCheck_in_MilesPlus_link() {
        return check_in_MilesPlus_link;
    }

    @FindBy (css = "#checkInTab-panel > div > div > div.mm-qr-code-btn-container > div > div > button")
    private WebElement check_in_MilesPlus_link;

    public WebElement getCheck_in_details_link() {
        return check_in_details_link;
    }

    @FindBy (css = "#checkInTab-panel > div > div > div.mm-checkin-is-available-at-container > div")
    private WebElement check_in_details_link;


    public WebElement getError_message() {
        return error_message;
    }

    @FindBy (css = "#\\31 4_error > div")
    private WebElement error_message;


    public WebElement getContinue_button_new_page() {
        return continue_button_new_page;
    }

    @FindBy (css = "#qPnacAxoG7R > form > button")
    private WebElement continue_button_new_page;


    public WebElement getContinue_check_in_button() {
        return continue_check_in_button;
    }

    @FindBy (css = "#checkInTab-panel > div > div > div.mm-qr-code-btn-container > button > span")
     private WebElement continue_check_in_button;



    public Check_in_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
