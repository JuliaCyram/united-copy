package com.united.pages.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Header_Section {

    public Header_Section(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getHeaders_tabs() {
        return headers_tabs;
    }

    @FindBy (css = "div[role=\"tablist\"] a")
    List<WebElement> headers_tabs;
}
