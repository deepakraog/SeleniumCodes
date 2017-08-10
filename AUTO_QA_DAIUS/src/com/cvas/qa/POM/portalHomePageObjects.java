package com.cvas.qa.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class portalHomePageObjects {

	// Initialize objects in portalHomePage
	public portalHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[10]/div/div[1]/div[1]/div[1]/div/div[2]/a")
	public WebElement musicMoreOptions;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[10]/div/div[1]/div[1]/div[1]/div/div[1]/span")
	public WebElement musicHeading;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[10]/div")
	public WebElement cmsCarouselWithDownloadtopLine_scroll;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[10]/div/div[1]/div[2]/div[1]")
	public WebElement carouselSection1;
	
	@FindBy(xpath ="//*[@id=\"mainBody\"]/div[10]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/a/span")
	public WebElement carRat1;

	@FindBy(xpath= "//*[@id=\"mainBody\"]/div[10]/div/div[1]/div[2]/div[1]/div/div[1]/div[2]")
	public WebElement carTitle1;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[10]/div/div[1]/div[2]/div[2]")
	public WebElement carouselSection2;
	
	@FindBy(xpath ="//*[@id=\"mainBody\"]/div[10]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/a/span")
	public WebElement carRat2;
	
	@FindBy(xpath= "//*[@id=\"mainBody\"]/div[10]/div/div[1]/div[2]/div[2]/div/div[1]/div[2]")
	public WebElement carTitle2;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[10]/div/div[1]/div[2]/div[3]")
	public WebElement carouselSection3;
	
	@FindBy(xpath ="//*[@id=\"mainBody\"]/div[10]/div/div[1]/div[2]/div[3]/div/div[1]/div[1]/a/span")
	public WebElement carRat3;
	
	@FindBy(xpath= "//*[@id=\"mainBody\"]/div[10]/div/div[1]/div[2]/div[3]/div/div[1]/div[2]")
	public WebElement carTitle3;

	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[11]/div/div[1]/div[1]/div[1]/div/div[2]/a")
	public WebElement topChartMoreOptions;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[11]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement topChartTitle;
	
	@FindBy(className = "cmsCarouselWithDownload-topLine swipe")
	public WebElement cmsCarouselWithDownloadtopLine_swipe;
	
	@FindBy(xpath = "//*[@id=\"swipe-div1\"]/div[2]/div/div[1]")
	public WebElement swipeTopLine1;
	
	@FindBy(xpath = "//*[@id=\"swipe-div1\"]/div[2]/div/div[1]/div[1]/a/span")
	public WebElement ratTopLine1;
	
	@FindBy(xpath = "//*[@id=\"swipe-div1\"]/div[2]/div/div[1]/div[2]")
	public WebElement titleTopLine1;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[12]")
	public WebElement topLineScroll;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[12]/div/div[1]/div[1]/div[1]/div/div[2]/a")
	public WebElement topLineScrollMoreOptions;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[12]/div/div[1]/div[1]/div[1]/div/div[1]/span")
	public WebElement topLineScrollTitle;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]")
	public WebElement wallModule;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[1]/div[1]/div/div[1]/span")
	public WebElement wallTitle;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[1]/div[1]/div/div[2]/a")
	public WebElement wallMoreOptions;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/a/img")
	public WebElement wallContent1;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/a/span/img")
	public WebElement ratWallContent1;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/h2/a")
	public WebElement titleWallContent1;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/span")
	public WebElement priceWallContent1;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/a/img")
	public WebElement wallContent2;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[2	]/div/div[1]/div[1]/a/span/img")
	public WebElement ratWallContent2;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/h2/a")
	public WebElement titleWallContent2;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[2]/div/div[1]/div[3]/div[1]/span")
	public WebElement priceWallContent2;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[4]/div/div[1]/div[1]/a/img")
	public WebElement wallContent3;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[4]/div/div[1]/div[1]/a/span/img")
	public WebElement ratWallContent3;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[4]/div/div[1]/div[2]/h2/a")
	public WebElement titleWallContent3;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[4]/div/div[1]/div[3]/div[1]/span")
	public WebElement priceWallContent3;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[5]/div/div[1]/div[1]/a/img")
	public WebElement wallContent4;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[5]/div/div[1]/div[1]/a/span/img")
	public WebElement ratWallContent4;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[5]/div/div[1]/div[2]/h2/a")
	public WebElement titleWallContent4;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[14]/div/div[1]/div[2]/div[5]/div/div[1]/div[3]/div[1]/span")
	public WebElement priceWallContent4;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[15]/div[2]/div/a/img")
	public WebElement homeMultiSubBanner;

	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[16]/div/div[1]")
	public WebElement vidModule;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[16]/div/div[1]/div[1]/div[1]/div/div[1]/span")
	public WebElement vidTitle;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[16]/div/div[1]/div[1]/div[1]/div/div[2]/a")
	public WebElement vidMoreOptions;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[16]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/a/img")
	public WebElement vidContent1;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[16]/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/h2/a")
	public WebElement titleVidContent1;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[16]/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/span")
	public WebElement priceVidContent1;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[17]/div/div[1]/div/span")
	public WebElement categoryTitle;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[17]/div/div[2]/div[1]")
	public WebElement gamesCategory;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[17]/div/div[2]/div[2]")
	public WebElement musicCategory;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[17]/div/div[4]/div[1]")
	public WebElement someCategory;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[17]/div/div[4]/div[2]")
	public WebElement extCategory;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[19]/div/div[1]/div/span")
	public WebElement categoryNTitle;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[19]/div/div[2]/div[1]")
	public WebElement homeCategoryN;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[19]/div/div[2]/div[2]")
	public WebElement suggestionCategoryN;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[19]/div/div[4]/div[1]")
	public WebElement faqCategoryN;
	
	@FindBy(xpath = "//*[@id=\"mainBody\"]/div[19]/div/div[4]/div[2]")
	public WebElement contactUsCategoryN;
	
}
