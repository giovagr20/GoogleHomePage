package com.co.google.questions;

import com.co.google.userinterfaces.WikipediaHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ResultWikipediaQuestion implements Question<String> {

	
	@Override
	public String answeredBy(Actor actor) {
		if(Text.of(WikipediaHomePage.LBL_WIND).viewedBy(actor).asString().contains("El nombre del viento")) {
			return "Ok";
		} else {
			return "Error";
		}
	}
	
	public static ResultWikipediaQuestion isOkay() {
		return new ResultWikipediaQuestion();
	}
}
