package com.drg.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndexOfIframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"F:\\QA_WORKSPACE\\C\\Selenium_Automation_binaries\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/guru99home/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		int size = driver.findElements(By.tagName("iframe")).size();

		for (int i = 0; i <= size; i++) {
			driver.switchTo().frame(i);
			int total = driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
			driver.switchTo().defaultContent();
		}
	}
}
