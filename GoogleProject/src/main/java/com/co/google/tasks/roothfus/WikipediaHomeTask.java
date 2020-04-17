package com.co.google.tasks.roothfus;

import org.openqa.selenium.WebDriver;

import com.co.google.questions.ResultWikipediaQuestion;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class WikipediaHomeTask implements Task {

	private WebDriver hisBrowser;
	
	public WikipediaHomeTask(WebDriver hisBrowser) {
		this.hisBrowser = hisBrowser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.asksFor(ResultWikipediaQuestion.isOkay());
		System.out.println(ResultWikipediaQuestion.isOkay());
	}
	
	public static WikipediaHomeTask validateData(WebDriver hisBrowser) {
		return instrumented(WikipediaHomeTask.class, hisBrowser);
	}
}
