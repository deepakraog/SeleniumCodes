package com.cvas.qa.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gamesHomePageObjects {

		// Initialize objects in gamesHomePage
		public gamesHomePageObjects(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[4]/div/div[1]/div[1]/div[1]/div/div/span")
		public WebElement multiGamesLatestTitleTxt;

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[4]/div/div[1]/div[2]/div[1]/div/div[1]")
		public WebElement multiGamesLatestContent;

		@FindBy(xpath = "")
		public WebElement multiGamesLatestRat1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[4]/div/div[1]/div[2]/div[1]/div/div[1]/div[2]")
		public WebElement multiGamesLatestTitle1;

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[4]/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/span")
		public WebElement multiGamesLatestPrice1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div[2]/div/a/img")
		public WebElement multiGamesSubBanner;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[6]/div/div[1]/div[1]/div[1]/div/div/span")
		public WebElement multiGamesTopGamesTitleTxt;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[6]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/a/img")
		public WebElement multiGamesTopGamesContent1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[6]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/a/span")
		public WebElement multiGamesTopGamesContent1Rat;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[6]/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/h2/a")
		public WebElement multiGamesTopGamesContent1Title;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[6]/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/span")
		public WebElement multiGamesTopGamesContent1Price;
		
		@FindBy(className = "title left")
		public WebElement gamesHomePageCategories;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div")
		public WebElement gamesHomePageCategoryModule;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[2]/div[1]")
		public WebElement gamesHomePageCatGrid1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[2]/div[2]")
		public WebElement gamesHomePageCatGrid2;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[4]/div[1]")
		public WebElement gamesHomePageCatGrid3;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[4]/div[2]")
		public WebElement gamesHomePageCatGrid4;
		
}

	
