package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Homepage_SearchBoxSteps {

    Homepage homepage = new Homepage();

    @Given("^User is in the hompage of iceland website$")
    public void user_is_in_the_hompage_of_iceland_website() throws Throwable {

    }

    @When("^User types an item in the search box$")
    public void user_types_an_item_in_the_search_box() throws Throwable {
        homepage.dosearch("biscuit");

    }

    @Then("^User should be able to see all the products related to the item$")
    public void user_should_be_able_to_see_all_the_products_related_to_the_item() throws Throwable {
        homepage.getResultURL();

    }



}
