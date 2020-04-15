package com.co.google.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleHomePage extends PageObject {
	
	public static final Target DIV_SEARCH = Target.the("DIV_SEARCH").located(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]"));
	public static final Target INPUT_TEXT = Target.the("INPUT_TEXT").located(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
}
