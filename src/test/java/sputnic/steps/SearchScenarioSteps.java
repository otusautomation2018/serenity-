package sputnic.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sputnic.pages.ResultPage;
import sputnic.pages.SearchPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchScenarioSteps {
    SearchPage searchPage;
    ResultPage resultPage;

    @Given("user opens the site")
    public void givenUserOpensTheSite(){
        searchPage.open();
    }

    @When("^user searches for '(.*)'$")
    public void userSearchesFor(String query){
        searchPage.search(query);
    }

    @Then("^result page contains '(\\d+)' results$")
    public void resultPageContainsResults(int expectedNumber){
        assertTrue(resultPage.resultListIsDisplayed());
        assertEquals(expectedNumber, resultPage.actualNumberOfResults());
    }

    @Then("^result page contains message about nothing was found$")
    public void resultPageContainsMessageAboutNothingWasFound(){
        assertTrue(resultPage.notFoundMessage.containsText(resultPage.NOT_FOUND_TEXT));
    }
}
