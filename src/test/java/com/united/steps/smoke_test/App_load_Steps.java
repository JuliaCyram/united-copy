package com.united.steps.smoke_test;

import com.united.pages.sections.Main_Section;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.united.base.Hooks.driver;

public class App_load_Steps {


    @Then("Verify app is loaded with booking window with tabs:Book,Flightstatus,Check-in,Mytrips")
    public void verify_app_is_loaded_with_booking_window_with_tabs_book_flightstatus_check_in_mytrips()  {
        Main_Section main_section = new Main_Section(driver);
        int size = main_section.getMain_table().size();
        Assert.assertEquals(size, 4);

    }
}

