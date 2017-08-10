package com.cvas.qa.POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class videoHomePageObjects {

		// Initialize objects in videoHomePage
		public videoHomePageObjects(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[1]/div[1]/div/div/span")
		public WebElement multiVidLatestTitleTxt;

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]")
		public WebElement multiVidLatestContent;

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/a/span/img")
		public WebElement multiVidLatestRat1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/h2/a")
		public WebElement multiVidLatestTitle1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/span")
		public WebElement multiVidLatestPrice1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[8]/div[2]/div/a/img")
		public WebElement multiVidSubBanner;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[9]/div/div[1]/div[1]/div[1]/div/div/span")
		public WebElement multiVidTopVideosTitleTxt;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[9]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/a/img")
		public WebElement multiVidTopVideosContent1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[9]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/a/span")
		public WebElement multiVidTopVideosContent1Rat;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[9]/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/h2/a")
		public WebElement multiVidTopVideosContent1Title;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[9]/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/span")
		public WebElement multiVidTopVideosContent1Price;
		
		@FindBy(className = "title left")
		public WebElement vidHomePageCategories;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[10]/div")
		public WebElement vidHomePageCategoryModule;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[10]/div/div[2]/div[1]")
		public WebElement vidHomePageCatGrid1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[10]/div/div[2]/div[2]")
		public WebElement vidHomePageCatGrid2;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[10]/div/div[4]/div[1]")
		public WebElement vidHomePageCatGrid3;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[10]/div/div[4]/div[2]")
		public WebElement vidHomePageCatGrid4;
		
		
}

	