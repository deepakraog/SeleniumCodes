package com.cvas.qa.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class multiLockerPageObjects {

		// Initialize objects in multiLockerPage
		public multiLockerPageObjects(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[1]/div[1]/center/p")
		public WebElement multiLockWIFIuser;

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[1]/div[1]/center/p/a")
		public WebElement multiLockLoginLink;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[1]/div[2]/div/span")
		public WebElement multiLockSubsTitleTxt;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[1]/div[3]")
		public WebElement multiLockSubGrid;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[1]/div[2]/div")
		public WebElement multiLockSubGridActive;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[1]/div[2]/div/div[1]/div/div[1]/p/span")
		public WebElement multiLockSubGridActiveDesc1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[1]/div[2]/div/div[1]/div/div[4]/a[1]")
		public WebElement multiLockSubGridLockSubHead1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[1]/div[2]/div/div[1]/div/div[4]/p[1]")
		public WebElement multiLockSubGridLockContentCount1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[1]/div[2]/div/div[1]/div/div[4]/a[2]")
		public WebElement multiLockSubGridLockSubValid1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[1]/div[2]/div/div[1]/div/div[4]/p[2]")
		public WebElement multiLockSubGridLocValidity1;
		
		@FindBy(className = "button-unsubs")
		public WebElement multiLockSubGridUnSubOption;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[3]/div[1]")
		public WebElement multiLockDownloadTitleTxt;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[3]")
		public WebElement multiLockDownloadGrid;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[3]/div[2]/div[1]/div[1]")
		public WebElement multiLockMyDownloadGrid1;

		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/a/img")
		public WebElement multiLockMyDownloadImage1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[3]/div[2]/div[1]/div[3]/div/div[2]/div[1]/a/h1")
		public WebElement multiLockMyDownloadDesc1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]")
		public WebElement multiLockMyDownloadDate1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[1]/a")
		public WebElement multiLockMyDownloadRatLnk1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[2]/a")
		public WebElement multiLockMyDownloadRedownloadlnk1;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[3]/a")
		public WebElement multiLockMyDownloadDelete1;
		
		@FindBy(xpath ="//*[@id=\"mainBody\"]/div/div[4]/div[1]/div/span")
		public WebElement multiLockFavTitle;
		
		@FindBy(xpath ="//*[@id=\"mainBody\"]/div/div[4]/div[2]/div")
		public WebElement multiLockFavContents;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[4]/div[2]/div/div[1]/div/div[3]/div[3]/a/img")
		public WebElement multiLockFavDelOpt;
		
		@FindBy(xpath = "//*[@id=\"mainBody\"]/div/div[4]/div[2]/div/div[5]/span/a")
		public WebElement multiLockFavMoreOpt;
		
		
}