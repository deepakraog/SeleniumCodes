package com.drg.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToFrame_ID {
public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"F:\\QA_WORKSPACE\\C\\Selenium_Automation_binaries\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //navigates to the Browser
	    driver.get("http://demo.guru99.com/selenium/guru99home/"); 
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID

			System.out.println("********We are switch to the iframe*******");
     		driver.findElement(By.xpath("html/body/a/img")).click();
  		    //Clicks the iframe
       
  			System.out.println("*********We are done***************");
  			int size = driver.findElements(By.tagName("iframe")).size();
  			
  			System.out.println("size of iframe "+size);
      }
}
