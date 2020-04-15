package com.co.google.interactions.generics;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class EnterInformation implements Interaction{

	private String strValue;
	private Target idField;
	
	public EnterInformation(String strValue, Target idField) {
		this.strValue = strValue;
		this.idField = idField;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(strValue).into(idField));
	}
	
	public static EnterInformation textField(String strValue, Target idField) {
		return instrumented(EnterInformation.class, strValue, idField);
	}

}
