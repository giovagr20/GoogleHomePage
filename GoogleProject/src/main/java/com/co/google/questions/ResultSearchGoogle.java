package com.co.google.questions;

import static com.co.google.userinterfaces.GoogleHomePage.DIV_FIRST;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResultSearchGoogle implements Question<Integer>{

	@Override
	public Integer answeredBy(Actor actor) {
		if(DIV_FIRST.resolveFor(actor).isVisible() == true) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public static ResultSearchGoogle isOkay() {
		return new ResultSearchGoogle();
	}

}
