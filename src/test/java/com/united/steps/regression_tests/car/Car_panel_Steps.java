package com.united.steps.regression_tests.car;

import com.united.pages.Car_Page;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class Car_panel_Steps {

    @Then("verify that user can see all fields on a Car panel are located")
    public void verify_that_user_can_see_all_fields_on_a_car_panel_are_located() {
        Car_Page car_page = new Car_Page(driver);
        boolean car_panel = car_page.getBook_car_panel_form().isDisplayed();
        Assert.assertTrue(car_panel);
    }

    @Then("click return car to same location checkbox")
    public void click_return_car_to_same_location_checkbox() throws InterruptedException {
        Car_Page car_page = new Car_Page(driver);
        car_page.getReturn_car_checkbox().click();
        Thread.sleep(3000);

    }

    @Then("verify that drop off location disappear")
    public void verify_that_drop_off_location_disappear() {
        Car_Page car_page = new Car_Page(driver);
        int element = driver.findElements(By.cssSelector("#bookCarDropoffInput")).size();
        Assert.assertEquals(element, 0);
    }


    @Then("verify that age field disappear")
    public void verify_that_age_field_disappear() {
        Car_Page car_page = new Car_Page(driver);
        int element = driver.findElements(By.cssSelector("#driversAge")).size();
        Assert.assertEquals(element, 0);
    }

    @Then("fill out car panel form")
    public void fill_out_car_panel_form() {
        Car_Page car_page = new Car_Page(driver);
        car_page.fill_out_car_form();
    }


    @Then("verify that user navigate to a separate tab")
    public void verify_that_user_navigate_to_a_separate_tab() {
        Car_Page car_page = new Car_Page(driver);
        String currentURL = driver.getCurrentUrl();
        String actualURL = "https://cars.united.com/en-us/book?clientId=569367&pickupId=3702&returnId=3702&pickupDateTime=2021-12-19T10%3A00&returnDateTime=2021-12-21T10%3A00&age=26&&currency=USD&utm_source=loyalty&utm_medium=uacom&utm_campaign=uacom_carsearchbox&utm_content=car_earn#/vehicles";
        Assert.assertNotEquals(currentURL, actualURL);
    }

    @Then("add an age lesser than {int}")
    public void add_an_age_lesser_than(Integer int1) throws InterruptedException {
        Car_Page car_page = new Car_Page(driver);
        car_page.getBook_car_pickup_location().sendKeys("Washington");
        car_page.getBook_car_pickup_date().sendKeys("Dec 19");
        car_page.getBook_car_dropoff_date().sendKeys("Dec 28");
        car_page.getRandom_place().click();
        Thread.sleep(3000);
        car_page.getAge_checkbox().click();
        car_page.getDriver_age().sendKeys("18");
        car_page.getFind_car_button().click();
    }
    @Then("verify that user seen {string}")
    public void verify_that_user_seen(String string) {
        Car_Page car_page = new Car_Page(driver);
        String currentURL = driver.getCurrentUrl();
        String actualURL = "https://cars.united.com/en-us/book?clientId=569367&pickupId=3702&returnId=3702&pickupDateTime=2021-12-19T10%3A00&returnDateTime=2021-12-21T10%3A00&age=26&&currency=USD&utm_source=loyalty&utm_medium=uacom&utm_campaign=uacom_carsearchbox&utm_content=car_earn#/vehicles";
        Assert.assertNotEquals(currentURL, actualURL);
        String text = driver.findElement(By.cssSelector("#ct-availability-list-no-result > div > div.ct-panel-content.ct-padding > div:nth-child(1)")).getText();
        Assert.assertTrue(text.contains("Some car rental suppliers do not rent to young drivers. If you are travelling with an older person, it may help to make them your main driver."));
    }
}
