package com.debenhams111.stepdef;

import com.debenhams111.pageobjects.StoreFinder;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoreFinderStepDef {

    private StoreFinder storeFinder=new StoreFinder();
    @When("^I click the store finder$")
    public void iClickTheStoreFinder() {

    }

    @And("^I enter the city \"([^\"]*)\"$")
    public void iEnterTheCity(String City) throws Throwable {
//storeFinder.storeFinder(City);
    }


    @Then("^I able to see the store location$")
    public void iAbleToSeeTheStoreLocation() {
    }

}


