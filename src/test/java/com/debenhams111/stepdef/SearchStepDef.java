package com.debenhams111.stepdef;

import com.debenhams111.pageobjects.Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchStepDef {
    private Search search=new Search();
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I Search for a product \"([^\"]*)\"$")
    public void iSearchForAProduct(String item)  {
        search.doSearch(item);
    }

    @Then("^I see the respective results$")
    public void iSeeTheRespectiveResults() {
        String actual= search.getHomePageUrl();
        assertThat("home page not displayed",actual, Matchers.startsWith("https"));
    }

    @When("^I search for a \"([^\"]*)\"$")
    public void iSearchForA(String item)  {
        search.doSearch(item);
    }
}


