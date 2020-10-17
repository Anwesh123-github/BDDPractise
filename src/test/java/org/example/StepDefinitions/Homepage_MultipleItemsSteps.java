package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Homepage_MultipleItemsSteps {

    Homepage homepage = new Homepage();

    @When("^User types \"([^\"]*)\" in the search box$")
    public void user_types_in_the_search_box(String item) throws Throwable {
        homepage.dosearch(item);

    }

    @Then("^User should be able to see all the products related to the items$")
    public void user_should_be_able_to_see_all_the_products_related_to_the_items() throws Throwable {

    }


}
