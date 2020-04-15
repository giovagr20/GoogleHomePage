package com.co.google.questions;

import static com.co.google.userinterfaces.GoogleHomePage.DIV_SEARCH;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResultGoogleHomeQuestion implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		if(DIV_SEARCH.resolveFor(actor).isClickable() == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static ResultGoogleHomeQuestion isClickable() {
		return new ResultGoogleHomeQuestion();
	}
}
