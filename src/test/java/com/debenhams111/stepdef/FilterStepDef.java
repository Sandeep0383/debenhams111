package com.debenhams111.stepdef;

import com.debenhams111.pageobjects.Filter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class FilterStepDef {
    private Filter filter=new Filter();
    @When("^I move to Men$")
    public void iMoveToMen() {
        filter.customerSelectedLink();
    }

    @And("^I click on All shoes & boots$")
    public void iClickOnAllShoesBoots() {
        filter.selectedLink();
    }
    @Then("^I able to see the product$")
    public void iAbleToSeeTheProduct() {
        // String actual1=filter.header();
        //assertThat("page header is not as expected ",actual1,is(equalToIgnoringWhiteSpace("Men's footwear")));
    }

    @Then("^I take a Screen shot$")
    public void iTakeAScreensShot() throws IOException {
        filter.sceenShot();
    }

}


