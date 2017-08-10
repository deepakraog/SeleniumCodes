package com.cvas.qa.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wallPaperHomePageObjects {

		// Initialize objects in wallPaperHomePage
		public wallPaperHomePageObjects(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[1]/div[1]/div/div[1]/span")
		public WebElement multiwallPaperLatestTitleTxt;

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[1]/div[1]/div/div[2]/a")
		public WebElement multiWallPaperLatestMoreOption;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]")
		public WebElement multiWallPaperLatestContents;

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/a/img")
		public WebElement multiWallPaperLatestContent1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/a/span/img")
		public WebElement multiWallPaperLatestRat1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/h2/a")
		public WebElement multiWallPaperLatestTitle1;

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/span")
		public WebElement multiWallPaperLatestPrice1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/a/img")
		public WebElement multiWallPaperLatestContent2;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/a/span/img")
		public WebElement multiWallPaperLatestRat2;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/h2/a")
		public WebElement multiWallPaperLatestTitle2;

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[2]/div/div[1]/div[3]/div[1]/span")
		public WebElement multiWallPaperLatestPrice2;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[4]/div/div[1]/div[1]/a/img")
		public WebElement multiWallPaperLatestContent3;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[4]/div/div[1]/div[1]/a/span/img")
		public WebElement multiWallPaperLatestRat3;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[4]/div/div[1]/div[2]/h2/a")
		public WebElement multiWallPaperLatestTitle3;

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[4]/div/div[1]/div[3]/div[1]/span")
		public WebElement multiWallPaperLatestPrice3;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[5]/div/div[1]/div[1]/a/img")
		public WebElement multiWallPaperLatestContent4;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[5]/div/div[1]/div[1]/a/span/img")
		public WebElement multiWallPaperLatestRat4;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[5]/div/div[1]/div[2]/h2/a")
		public WebElement multiWallPaperLatestTitle4;

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[5]/div/div[1]/div[2]/div[5]/div/div[1]/div[3]/div[1]/span")
		public WebElement multiWallPaperLatestPrice4;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[6]/div[2]/div/a/img")
		public WebElement multiWallPaperSubBanner;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[1]/div[1]/div/div[1]/span")
		public WebElement multiWallPaperTopWallTitleTxt;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/a/img")
		public WebElement multiWallPaperTopWallContent1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/a/span")
		public WebElement multiWallPaperTopWallContent1Rat;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/h2/a")
		public WebElement multiWallPaperTopWallContent1Title;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/span")
		public WebElement multiWallPaperTopWallContent1Price;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/a/img")
		public WebElement multiWallPaperTopWallContent2;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/a/span")
		public WebElement multiWallPaperTopWallContent2Rat;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/h2/a")
		public WebElement multiWallPaperTopWallContent2Title;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[2]/div/div[1]/div[3]/div[1]/span")
		public WebElement multiWallPaperTopWallContent2Price;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[4]/div/div[1]/div[1]/a/img")
		public WebElement multiWallPaperTopWallContent3;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[4]/div/div[1]/div[1]/a/span")
		public WebElement multiWallPaperTopWallContent3Rat;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[4]/div/div[1]/div[2]/h2/a")
		public WebElement multiWallPaperTopWallContent3Title;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[4]/div/div[1]/div[3]/div[1]/span")
		public WebElement multiWallPaperTopWallContent3Price;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[5]/div/div[1]/div[1]/a/img")
		public WebElement multiWallPaperTopWallContent4;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[5]/div/div[1]/div[1]/a/span")
		public WebElement multiWallPaperTopWallContent4Rat;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[5]/div/div[1]/div[2]/h2/a")
		public WebElement multiWallPaperTopWallContent4Title;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[1]/div[2]/div[5]/div/div[1]/div[3]/div[1]/span")
		public WebElement multiWallPaperTopWallContent4Price;
		
		
		@FindBy(className = "title left")
		public WebElement multiWallPaperCategories;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div")
		public WebElement multiWallPaperCategoryModule;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[2]/div[1]")
		public WebElement multiWallPaperPageCatGrid1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[2]/div[2]")
		public WebElement multiWallPaperPageCatGrid2;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[4]/div[1]")
		public WebElement multiWallPaperPageCatGrid3;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div[7]/div/div[4]/div[2]")
		public WebElement multiWallPaperPageCatGrid4;
		
}