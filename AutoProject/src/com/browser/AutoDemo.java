package com.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDemo {

	static WebDriver driver=null;
	public static void main(String[] args) 
	{
		launchBrowser();

	}
	
	static void launchBrowser()
	{
		
		String strpath=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strpath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	}

}
