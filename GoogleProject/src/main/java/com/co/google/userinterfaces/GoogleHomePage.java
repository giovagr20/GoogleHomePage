package com.co.google.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleHomePage extends PageObject {
	
	public static final Target DIV_SEARCH = Target.the("DIV_SEARCH").located(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/div"));
	public static final Target INPUT_TEXT = Target.the("INPUT_TEXT").located(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
	public static final Target BTN_SEARCH = Target.the("BTN_SEARCH").located(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
	public static final Target DIV_FIRST = Target.the("DIV_FIRST").located(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]"));
	public static final Target DIV_ROOTHFUS = Target.the("DIV_ROOTHFUS").located(By.xpath("//*[@id=\"rso\"]/div[5]/div/div[1]"));
	public static final Target LNK_ROOTHFUS = Target.the("LNK_ROOTHFUS").located(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a"));
}
