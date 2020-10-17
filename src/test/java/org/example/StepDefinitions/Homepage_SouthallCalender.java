package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Homepage_SouthallCalender {

    Homepage homepage = new Homepage();

    @Given("^User is in the homepage of Southall website$")
    public void user_is_in_the_homepage_of_Southall_website() throws Throwable {



    }

    @When("^User clicks on departure calender$")
    public void user_clicks_on_departure_calender() throws Throwable {
        homepage.SouthallCalender();




    }

    @Then("^User should be able to all the dates$")
    public void user_should_be_able_to_all_the_dates() throws Throwable {

    }

    @Then("^User should be able to click on one particular date$")
    public void user_should_be_able_to_click_on_one_particular_date() throws Throwable {
        homepage.getdatedep();

    }





}
