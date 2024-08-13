package com.automation.testcase;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshort extends Testscript {

	public static void caputcher(WebDriver driver, String name) throws IOException{

		Calendar ca =Calendar.getInstance();
		Date	ti=ca.getTime();
		String timeloop=ti.toString().replace(":", "");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File tsc=screenshot. getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshort_images/"+name+timeloop);
		FileHandler.copy(tsc, destFile);

	}


}


