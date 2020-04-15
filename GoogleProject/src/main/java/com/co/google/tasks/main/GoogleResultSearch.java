package com.co.google.tasks.main;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.openqa.selenium.WebDriver;

import com.co.google.questions.ResultSearchGoogle;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class GoogleResultSearch implements Task {

	private WebDriver hisBrowser;
	
	public GoogleResultSearch(WebDriver hisBrowser) {
		this.hisBrowser = hisBrowser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.asksFor(ResultSearchGoogle.isOkay());
	}
	
	public static GoogleResultSearch searchOkay(WebDriver hisBrowser) {
		return instrumented(GoogleResultSearch.class, hisBrowser);
	}

}
