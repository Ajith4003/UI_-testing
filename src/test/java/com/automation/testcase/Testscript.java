package com.automation.testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testscript implements Propertes{

	public static void main(String[] args) throws InterruptedException, IOException {

		String[] urls = (links);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		Thread.sleep(time);

		//Dimension change(1920, 1080) 

		for (String url : urls) 
		{   
			driver.get(url);
			driver.manage().window().setSize(d1);
			Screenshort.caputcher(driver,"chrome deiver "+d1);
			// Add some delay to see the page loading
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//Dimension change(1366, 768)

		for (String url : urls) 
		{   
			driver.get(url);
			driver.manage().window().setSize(d2);
			Screenshort.caputcher(driver,"chrome deiver "+d2);
			// Add some delay to see the page loading
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//Dimension change(1536, 864)
		for (String url : urls)  
		{   
			driver.get(url);
			driver.manage().window().setSize(d3);
			Screenshort.caputcher(driver,"chrome deiver "+d3);

			// Add some delay to see the page loading

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		driver.quit(); 
		System.out.println(" chrome driver process complected");



		//firefox driver is start to running  

		WebDriver driver1= new FirefoxDriver();
		driver1.get("https://www.getcalley.com/page-sitemap.xml"); 
		Thread.sleep(2000);
		
		//Dimension change(1920, 1080)
		for (String url1 : urls) {
			driver1.get(url1);
			driver1.manage().window().setSize(d1);
			// Add some delay to see the page loading
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Screenshort. caputcher(driver1,"firefox driver "+d1);
		}
		
		//Dimension change(1366, 768)
		for (String url1 : urls) {
			driver1.get(url1);
			driver1.manage().window().setSize(d2);
			// Add some delay to see the page loading
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Screenshort. caputcher(driver1,"firefox driver "+d2);
		}
		
		//Dimension change(1536, 864)
		for (String url1 : urls) {
			driver1.get(url1);
			driver1.manage().window().setSize(d3);
			// Add some delay to see the page loading
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Screenshort. caputcher(driver1,"firefox driver "+d3);
		}
		driver1.quit(); 
		System.out.println(" firefox driver  process complected");



		//EdgeDriver is  start  to running

		WebDriver driver2= new EdgeDriver();
		driver2.get("https://www.getcalley.com/page-sitemap.xml");
		//Dimension change(1920, 1080)
		for (String url1 : urls) {
			driver2.manage().window().setSize(d1);
			driver2.get(url1);
			// Add some delay to see the page loading
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Screenshort. caputcher(driver2,"edgedeiver "+d1);
		}
		
		//Dimension change(1366, 768)
		for (String url1 : urls) {
			driver2.get(url1);
			driver2.manage().window().setSize(d2);
			// Add some delay to see the page loading
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Screenshort. caputcher(driver2,"edgedeiver "+d2);
		}
		
		//Dimension change(1536, 864)
		for (String url1 : urls) {
			driver2.get(url1);
			driver2.manage().window().setSize(d3);
			// Add some delay to see the page loading
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Screenshort. caputcher(driver2,"edgedeiver "+d3);
		}
		driver2.quit();    
		System.out.println(" edge driver process complected");




	}

}
