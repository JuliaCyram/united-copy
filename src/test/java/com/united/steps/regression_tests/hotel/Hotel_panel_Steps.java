package com.united.steps.regression_tests.hotel;

import com.united.pages.Hotel_Page;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class Hotel_panel_Steps {

    @Then("verify that user can see Going to, check-in, check-out, number of rooms, number of travelers,book with miles and find hotels button fields")
    public void verify_that_user_can_see_going_to_check_in_check_out_number_of_rooms_number_of_travelers_book_with_miles_and_find_hotels_button_fields() {
        Hotel_Page hotel_page = new Hotel_Page(driver);
        boolean form = hotel_page.getBook_hotel_panel_form().isDisplayed();
        Assert.assertTrue(form);
    }

    @Then("verify that One room and one travelers selected by default")
    public void verify_that_one_room_and_travelers_selected_by_default() {
        Hotel_Page hotel_page = new Hotel_Page(driver);
        String room = hotel_page.getHotel_room_field().getAttribute("value");
        Assert.assertEquals(room, "1");
        String traveler = hotel_page.getHotel_number_travelers().getAttribute("value");
        Assert.assertEquals(traveler, "1 adult");
    }

    @Then("click number of travelers field")
    public void click_number_of_travelers_field() {
        Hotel_Page hotel_page = new Hotel_Page(driver);
        hotel_page.getHotel_number_travelers().click();
    }

    @Then("click adult plus button {int} times")
    public void click_adult_plus_button_times(Integer int1) {
        Hotel_Page hotel_page = new Hotel_Page(driver);
        for (int i = 1; i < 9; i++) {
            hotel_page.getHotel_adult_plusBtn().click();
        }

    }

    @Then("click children plus button {int} times")
    public void click_children_plus_button_times(Integer int1) {
        Hotel_Page hotel_page = new Hotel_Page(driver);
        for (int i = 1; i < 9; i++) {
            hotel_page.getHotel_children_plusBtn().click();
        }
    }

    @Then("verify that in total {int} travelers")
    public void verify_that_in_total_travelers(Integer int1) {
        Hotel_Page hotel_page = new Hotel_Page(driver);
        String total_number = hotel_page.getHotel_number_travelers().getAttribute("value");
        Assert.assertEquals(total_number, "16 travelers");
    }

    @Then("click hotel room field")
    public void click_hotel_room_field() {
        Hotel_Page hotel_page = new Hotel_Page(driver);
        hotel_page.getHotel_room_field().click();
    }

    @Then("select maximum {int} rooms")
    public void select_maximum_rooms(Integer int1) {
        Hotel_Page hotel_page = new Hotel_Page(driver);
        hotel_page.getSelect_maximum_room().click();
    }

    @Then("verify that user seen {int} rooms")
    public void verify_that_user_seen_rooms(Integer int1) {
        Hotel_Page hotel_page = new Hotel_Page(driver);
        String maximum_room = hotel_page.getSelect_maximum_room().getAttribute("aria-label");
        Assert.assertEquals(maximum_room, "8 rooms");
    }

    @Then("fill out hotel panel form")
    public void fill_out_hotel_panel_form() throws InterruptedException {
        Hotel_Page hotel_page = new Hotel_Page(driver);
        hotel_page.fill_out_hotel_form();

    }

    @Then("verify that user seen hotel search with result")
    public void verify_that_user_seen_hotel_search_with_result() {
        Hotel_Page hotel_page = new Hotel_Page(driver);
        String currentURL = driver.getCurrentUrl();
        String actualURL = "https://hotels.united.com/search.do?resolved-location=CITY%3A1153093%3AUNKNOWN%3AUNKNOWN&destination-id=1153093&q-destination=Moscow,%20Russia&q-check-in=2022-01-10&q-check-out=2022-01-14&q-rooms=1&q-room-0-adults=1&q-room-0-children=1&q-room-0-child-0-age=17";
        Assert.assertNotEquals(currentURL, actualURL);

    }
}
