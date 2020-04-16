package com.co.google.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features= {"src/test/resources/features/google_suggestions.feature"},
		glue="com.co.google.stepdefinitions",
		snippets=SnippetType.CAMELCASE)
public class GoogleSuggestionsRunner{}
