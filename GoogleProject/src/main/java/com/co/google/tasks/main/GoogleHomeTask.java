package com.co.google.tasks.main;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.co.google.userinterfaces.GoogleHomePage.INPUT_TEXT;
import static com.co.google.userinterfaces.GoogleHomePage.BTN_SEARCH;
import org.openqa.selenium.WebDriver;

import com.co.google.interactions.generics.ClickOn;
import com.co.google.interactions.generics.EnterInformation;
import com.co.google.questions.ResultGoogleHomeQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class GoogleHomeTask implements Task{

	private WebDriver hisbrowser;
	private String strData;
	
	public GoogleHomeTask(WebDriver hisbrowser, String strData) {
		this.hisbrowser = hisbrowser;
		this.strData = strData;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
			actor.asksFor(ResultGoogleHomeQuestion.isClickable());
			actor.attemptsTo(WaitUntil.the(INPUT_TEXT, isVisible()),
					EnterInformation.textField(strData, INPUT_TEXT),
					ClickOn.element(BTN_SEARCH));
	}
	
	public static GoogleHomeTask enterText(WebDriver hisBrowser, String strData) {
		return instrumented(GoogleHomeTask.class, hisBrowser, strData);
	}

}
