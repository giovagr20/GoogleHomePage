package com.co.google.tasks.generic;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowserTask implements Task {

	private PageObject pageObject;
	
	public OpenTheBrowserTask(PageObject pageObject) {
		this.pageObject = pageObject;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(pageObject));
	}
	
	public static OpenTheBrowserTask openURL(PageObject pageObject) {
		return instrumented(OpenTheBrowserTask.class, pageObject);
	}
}
