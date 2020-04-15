package com.co.google.stepdefinitions;

import org.openqa.selenium.WebDriver;
import com.co.google.models.DataModels;
import com.co.google.tasks.generic.NavigateGoogleTask;
import com.co.google.tasks.main.GoogleHomeTask;
import com.co.google.tasks.main.GoogleIntoRoothfusTask;
import com.co.google.tasks.main.GoogleResultRoothfusTask;
import com.co.google.tasks.main.GoogleResultSearch;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleSearchStepDefinition {

	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor userGoogle = Actor.named("userGoogle");
	
	@Before
	public void setUp() {
		userGoogle.can(BrowseTheWeb.with(hisBrowser));
		DataModels.setSrtData("The name of the wind");
	}
	
	@Given("^User navigates into homepage$")
	public void userNavigatesIntoHomepage() {
		userGoogle.wasAbleTo(NavigateGoogleTask.intoHome());
	}

	@When("^User types The name of the wind into the search field$")
	public void userTypesTheNameOfTheWindIntoTheSearchField() {
		userGoogle.attemptsTo(GoogleHomeTask.enterText(hisBrowser, 
				DataModels.getSrtData()));
	}

	@Then("^User goes to the search results page$")
	public void userGoesToTheSearchResultsPage() {
		try {
			userGoogle.attemptsTo(GoogleResultSearch.searchOkay(hisBrowser));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Then("^the first result is The Name of the Wind Patrick Rothfuss$")
	public void theFirstResultIsTheNameOfTheWindPatrickRothfuss() {
		try {
			userGoogle.attemptsTo(GoogleResultRoothfusTask.scrollInto(hisBrowser));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Then("^I go to the Patrick Rothfuss The Books page$")
	public void iGoToThePatrickRothfussTheBooksPage() {
		userGoogle.attemptsTo(GoogleIntoRoothfusTask.clickRoot(hisBrowser));
	}

	
}
