package com.cvas.qa.POM;


import java.util.Iterator;
import java.util.LinkedHashSet;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class searchOptions {

	static commonPageObjects cpom = null;
	
	static boolean isDisplayed;
	@Test
	public static boolean contentSearch(String testMsg,String xpath,WebDriver driver) throws InterruptedException {

		cpom = new commonPageObjects(driver);
		System.out.println("Inside contentSearch() to search contents " + testMsg + " ....");

		cpom.searchPOM(testMsg);

		isDisplayed = driver.findElement(By.xpath(xpath)).isDisplayed();
		System.out.println("isDisplayed "+isDisplayed);
		return isDisplayed;

	}
	
	
	@SuppressWarnings("boxing")
	public static void searchResults(LinkedHashSet<String> ll,WebDriver driver) throws InterruptedException{
		Iterator<String> it = ll.iterator();
		while(it.hasNext()){
			String data[] = it.next().split(":::");
			if(data[4].equals("Y")){
				System.out.println("Test Case "+data[0] +" checked and found Result as -> ");
				Assert.assertEquals(true,searchOptions.contentSearch(data[1],data[3], driver) && driver.findElement(By.xpath(data[3])).getText().equals(data[2]));
			}
			else{
				System.out.println("Test Case "+data[0] +" not checked");
			}
		}
	}
	
	
	@SuppressWarnings("boxing")
	public static void searchResultsOption(String TestCaseNo, String SearchString, String Contents, String XPath,
			String Bool,WebDriver driver) throws InterruptedException{
		if(Bool.equals("Y")){
			System.out.println("Test Case "+TestCaseNo+" checked and found Result as -> ");
			Assert.assertEquals(true,searchOptions.contentSearch(SearchString,XPath, driver) && driver.findElement(By.xpath(XPath)).getText().equals(Contents));
		}
		else{
			throw new SkipException("Test case "+TestCaseNo+" is skipped");
		}
	}
	
}
