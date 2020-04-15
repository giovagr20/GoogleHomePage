package com.co.google.interactions.generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class ScrollDown implements Interaction {

	private WebDriver hisBrowser;
	private Target idElement;
	
	public ScrollDown(WebDriver hisBrowser, Target idElement) {
		this.hisBrowser = hisBrowser;
		this.idElement = idElement;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		JavascriptExecutor js = (JavascriptExecutor) hisBrowser;
		js.executeScript("arguments[0].scrollIntoView();", idElement);
	}
	
	public static ScrollDown doScroll(WebDriver hisBrowser, Target idElement) {
		return Tasks.instrumented(ScrollDown.class, hisBrowser, idElement);
	}
	
}
