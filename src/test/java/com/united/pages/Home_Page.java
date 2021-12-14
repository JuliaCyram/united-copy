package com.united.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home_Page {

    public WebElement getDeutsch_language() {
        return deutsch_language;
    }

    @FindBy (xpath = "//li[@aria-label='Deutsch']")
    private WebElement deutsch_language;

    public WebElement getChange_language_button() {
        return change_language_button;
    }

    @FindBy (css = "#localization-content-wrapper > div.app-containers-LocalizationContent-localizationContent__dialogActions--3hn_2 > button")
    private WebElement change_language_button;


    public WebElement getSelect_language_listbox() {
        return select_language_listbox;
    }

    @FindBy (css = "#localization-language-selector_label-0")
    private WebElement select_language_listbox;


    public WebElement getLanguage_selector_modal_button() {
        return language_selector_modal_button;
    }

    @FindBy (css = "#app > div > div > div > div.page > div.relativePosition > header > div > div > div:nth-child(1) > div > div > div > div:nth-child(2) > nav > ul > li:nth-child(1) > div > div > button")
    private WebElement language_selector_modal_button;



    public Home_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
