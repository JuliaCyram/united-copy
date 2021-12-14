package com.united.steps.regression_tests.flights;

import com.united.pages.sections.Leaving_going_Section;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;


import static com.united.base.Hooks.driver;

public class Leaving_going_Steps {

    @Then("fill_out_leaving_and_going_field {string} and {string}")
    public void fill_out_leaving_and_going_field_and(String string, String string2) {
        Leaving_going_Section leaving_going_section = new Leaving_going_Section(driver);
        leaving_going_section.fill_out_leaving_and_going_field();
    }

    @Then("click switch arrows in the middle to switch destination")
    public void click_switch_arrows_in_the_middle_to_switch_destination() throws InterruptedException {
        Leaving_going_Section leaving_going_section = new Leaving_going_Section(driver);
        leaving_going_section.getArrows_switch().click();
        Thread.sleep(2000);

    }

    @Then("verify that user seen switch destination")
    public void verify_that_user_seen_switch_destination() throws InterruptedException {
        Leaving_going_Section leaving_going_section = new Leaving_going_Section(driver);
        String text = driver.findElement(By.cssSelector("#bookFlightOriginInput")).getText();
        Thread.sleep(1000);
        Assert.assertFalse(text.contains("Moscow MOW"));

    }

    @Then("verify that user seen correct placeholders")
    public void verify_that_user_seen_correct_placeholders() {
        Leaving_going_Section leaving_going_section = new Leaving_going_Section(driver);
        String text = leaving_going_section.getLeaving_from_field().getAttribute("placeholder");
        Assert.assertEquals(text, "From*");
        String text1 = leaving_going_section.getGoing_to_field().getAttribute("placeholder");
        Assert.assertEquals(text1, "To*");
    }

    @Then("click leaving from textarea")
    public void click_leaving_from_textarea() {
        Leaving_going_Section leaving_going_section = new Leaving_going_Section(driver);
        leaving_going_section.getLeaving_from_field().click();

    }

    @Then("click remove button in leaving from the textarea")
    public void click_remove_button_in_leaving_from_the_textarea() {
        Leaving_going_Section leaving_going_section = new Leaving_going_Section(driver);
        leaving_going_section.getRemove_button_in_leaving_from().click();
    }

    @Then("verify that user seen empty leaving from textarea")
    public void verify_that_user_seen_empty_leaving_from_textarea() {
        Leaving_going_Section leaving_going_section = new Leaving_going_Section(driver);
        String textarea = leaving_going_section.getLeaving_from_field().getText();
        Assert.assertTrue(textarea.isEmpty());
    }

    @Then("click going to textarea")
    public void click_going_to_textarea() {
        Leaving_going_Section leaving_going_section = new Leaving_going_Section(driver);
        leaving_going_section.getGoing_to_field().click();
    }

    @Then("click remove button in going to  textarea")
    public void click_remove_button_in_going_to_textarea() {
        Leaving_going_Section leaving_going_section = new Leaving_going_Section(driver);
        leaving_going_section.getRemove_button_going_to().click();
    }

    @Then("verify that user seen empty going to textarea")
    public void verify_that_user_seen_empty_going_to_textarea() {
        Leaving_going_Section leaving_going_section = new Leaving_going_Section(driver);
        String textarea = leaving_going_section.getGoing_to_field().getText();
        Assert.assertTrue(textarea.isEmpty());
    }
}

