package com.co.google.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WikipediaHomePage extends PageObject {

	public static final Target LBL_WIND = Target.the("LBL_WIND").located(By.id("firstHeading"));
	
}
