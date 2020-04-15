package com.co.google.questions;

import static com.co.google.userinterfaces.GoogleHomePage.DIV_SEARCH;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResultGoogleHomeQuestion implements Question<Integer> {

	@Override
	public Integer answeredBy(Actor actor) {
		if(DIV_SEARCH.resolveFor(actor).isVisible() == true) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public static ResultGoogleHomeQuestion isClickable() {
		return new ResultGoogleHomeQuestion();
	}
}
