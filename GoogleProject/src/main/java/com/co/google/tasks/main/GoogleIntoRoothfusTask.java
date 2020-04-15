package com.co.google.tasks.main;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.co.google.userinterfaces.GoogleHomePage.LNK_ROOTHFUS;
import org.openqa.selenium.WebDriver;

import com.co.google.interactions.generics.ClickOn;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class GoogleIntoRoothfusTask implements Task {
	
	private WebDriver hisBrowser;
		
	public GoogleIntoRoothfusTask(WebDriver hisBrowser) {
		this.hisBrowser = hisBrowser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(LNK_ROOTHFUS, isVisible()),
				ClickOn.element(LNK_ROOTHFUS));
	}
	
	public static GoogleIntoRoothfusTask clickRoot(WebDriver hisBrowser) {
		return instrumented(GoogleIntoRoothfusTask.class, hisBrowser);
	}

}
