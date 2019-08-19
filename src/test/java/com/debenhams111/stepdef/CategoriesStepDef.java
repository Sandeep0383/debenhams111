package com.debenhams111.stepdef;

import com.debenhams111.pageobjects.Categories;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CategoriesStepDef {
    private Categories catogories = new Categories();


    @When("^I click Men$")
    public void iClickMen() {
        catogories.menLink();
    }

    @And("^I select a customer \"([^\"]*)\"$")
    public void iSelectACustomer(String customerSelectedCategories) {
        catogories.selectCategorie(customerSelectedCategories);
    }


    @Then("^I should see all the product filtered categories$")
    public void iShouldSeeAllTheProductFilteredCategories() {

    }
}


