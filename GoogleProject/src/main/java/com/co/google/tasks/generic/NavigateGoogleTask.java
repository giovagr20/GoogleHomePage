package com.co.google.tasks.generic;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.co.google.userinterfaces.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class NavigateGoogleTask implements Task{

	GoogleHomePage google;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(OpenTheBrowserTask.openURL(google));
	}
	
	public static NavigateGoogleTask intoHome() {
		return instrumented(NavigateGoogleTask.class);
	}	

}
