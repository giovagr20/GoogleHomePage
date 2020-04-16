package com.co.google.stepdefinitions;

import org.openqa.selenium.WebDriver;
import com.co.google.models.DataModels;
import com.co.google.tasks.generic.NavigateGoogleTask;
import com.co.google.tasks.main.GoogleHomeTask;
import com.co.google.tasks.main.GoogleIntoRoothfusTask;
import com.co.google.tasks.main.GoogleResultSearch;
import com.co.google.tasks.roothfus.WikipediaHomeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleSuggestionsStepDefinition {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor userGoogle = Actor.named("userGoogle");
	
	@Before
	public void setUp() {
		userGoogle.can(BrowseTheWeb.with(hisBrowser));
		DataModels.setSrtData("The name of the w");
	}
	
	@Given("^User navigates into homepage google$")
	public void userNavigatesIntoHomepageGoogle() {
		userGoogle.wasAbleTo(NavigateGoogleTask.intoHome());
	}


	@When("^User types The name of the w into the search field$")
	public void userTypesTheNameOfTheWIntoTheSearchField() {
		userGoogle.attemptsTo(GoogleHomeTask.enterText(hisBrowser, 
				DataModels.getSrtData()));
	}

	@When("^the suggestions list is displayed$")
	public void theSuggestionsListIsDisplayed() {
		
	}

	@Then("^User goes to the search result pages$")
	public void userGoesToTheSearchResultPages() {
		try {
			userGoogle.attemptsTo(GoogleResultSearch.searchOkay(hisBrowser));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Then("^the first result is The Name of the Wind by Patrick Rothfuss$")
	public void theFirstResultIsTheNameOfTheWindByPatrickRothfuss() {
		try {
			userGoogle.attemptsTo(GoogleIntoRoothfusTask.clickRoot(hisBrowser));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Then("^User goes to the web Patrick Rothfuss The Books page$")
	public void userGoesToTheWebPatrickRothfussTheBooksPage() {
		try {
			userGoogle.attemptsTo(WikipediaHomeTask.validateData(hisBrowser));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
