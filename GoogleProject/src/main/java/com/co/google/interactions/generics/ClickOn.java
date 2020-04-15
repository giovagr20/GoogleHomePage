package com.co.google.interactions.generics;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOn implements Interaction{

	private Target idElement;
	
	public ClickOn(Target idElement) {
		this.idElement = idElement;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(idElement));
	}
	
	public static ClickOn element(Target idElement) {
		return instrumented(ClickOn.class, idElement);
	}

}
