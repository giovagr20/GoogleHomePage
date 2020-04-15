package com.co.google.tasks.main;

import static com.co.google.userinterfaces.GoogleHomePage.DIV_ROOTHFUS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.openqa.selenium.WebDriver;

import com.co.google.interactions.generics.ScrollDown;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class GoogleResultRoothfusTask implements Task {

	private WebDriver hisBrowser;
	
	public GoogleResultRoothfusTask(WebDriver hisBrowser) {
		this.hisBrowser = hisBrowser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(DIV_ROOTHFUS, isVisible()),
				ScrollDown.doScroll(hisBrowser, DIV_ROOTHFUS));
	}
	
	public static GoogleResultRoothfusTask scrollInto(WebDriver hisBrowser) {
		return instrumented(GoogleResultRoothfusTask.class, hisBrowser);
	}
}
