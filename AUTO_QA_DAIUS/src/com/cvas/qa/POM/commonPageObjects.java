package com.cvas.qa.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.drg.methodFlows.startUp;

public class commonPageObjects extends startUp{

	// Initialize objects in commonPage
	public commonPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"body\"]/header/div[1]/div[1]/div[1]/a/img")
	public WebElement headerMenu;

	@FindBy(xpath = "//*[@id=\"body\"]/header/div[1]/div[1]/div[2]/a/img")
	public WebElement headerLogo;

	@FindBy(xpath = "//*[@id=\"searchImg\"]")
	public static WebElement SearchLogo;
	
	@FindBy(xpath = "//*[@id=\"searchKey\"]")
	public static WebElement searchTextBox;
	
	@FindBy(xpath = "//*[@id=\"searchBannerForm\"]/div/div[3]/input")
	public static WebElement searchClickButton;

	public void searchPOM(String testMsg){
		SearchLogo.click();
		searchTextBox.sendKeys(testMsg);
		searchClickButton.click();
	}
		
	@FindBy(xpath = "//*[@id=\"body\"]/header/div[2]/div[2]")
	public WebElement horizontalMenu;

	@FindBy(xpath = "//*[@id=\"body\"]/header/div[3]/div[1]/a")
	public WebElement loginBar;

	@FindBy(xpath = "//*[@id=\"body\"]/header/div[3]/div[2]/a")
	public WebElement langBar;

	
	@FindBy(xpath = "//*[@id=\"body\"]/header/div[2]/div[1]/div/img")
	public WebElement hMenuLeftClick;
			
	@FindBy(xpath = "//*[@id=\"body\"]/header/div[2]/div[2]/div/div[1]/a")
	public WebElement hMenuHomePageLink;
	
	@FindBy(xpath = "//*[@id=\"body\"]/header/div[2]/div[2]/div/div[2]/a")
	public WebElement hMenuVideoHomePageLink;
	
	@FindBy(xpath = "//*[@id=\"body\"]/header/div[2]/div[2]/div/div[3]/a")
	public WebElement hMenuGamesHomePageLink;
	
	@FindBy(xpath = "//*[@id=\"body\"]/header/div[2]/div[2]/div/div[4]/a")
	public WebElement hMenuWallPaperHomePageLink;
	
	@FindBy(xpath = "//*[@id=\"body\"]/header/div[2]/div[2]/div/div[5]/a")
	public WebElement hMenuMusicHomePageLink;
	
	@FindBy(xpath = "//*[@id=\"body\"]/header/div[2]/div[2]/div/div[6]/a")
	public WebElement hMenuMyAccPageLink;
	
	@FindBy(xpath = "//*[@id=\"body\"]/header/div[2]/div[3]/div/img")
	public WebElement hMenuRightClick;
	
	@FindBy(className = "nivoSlider")
	public WebElement newSubPromoSwitcher;
	
	@FindBy(xpath = "//*[@id=\"CustomMsgBanner\"]/div/a/img")
	public WebElement customMsgBanner;
	
	
	
	@FindBy(xpath = "/html/body/div[1]/nav")
	public WebElement vSubMenu;
	
	@FindBy(xpath = "/html/body/div[1]/nav/ul/li[1]/a")
	public WebElement vHomeSubMenu;
	
	@FindBy(xpath = "/html/body/div[1]/nav/ul/li[2]/a")
	public WebElement vVideoSubMenu;
	
	@FindBy(xpath = "/html/body/div[1]/nav/ul/li[3]/a")
	public WebElement vGamesSubMenu;
	
	@FindBy(xpath = "/html/body/div[1]/nav/ul/li[4]/a")
	public WebElement vWallPaperSubMenu;
	
	@FindBy(xpath = "/html/body/div[1]/nav/ul/li[5]/a")
	public WebElement vMusicSubMenu;
	
	@FindBy(xpath = "/html/body/div[1]/nav/ul/li[6]/a")
	public WebElement vMyAccSubMenu;
	
	@FindBy(xpath = "//*[@id=\"footer\"]/div[2]/table/tbody/tr/td[1]/a")
	public WebElement fbSocialFooter;
	
	@FindBy(xpath = "//*[@id=\"footer\"]/div[2]/table/tbody/tr/td[2]/a")
	public WebElement smsFooter;
	
	@FindBy(xpath = "//*[@id=\"footer\"]/div[2]/table/tbody/tr/td[3]/a/div/span/img")
	public WebElement whatsAppFooter;
	
	@FindBy(xpath = "//*[@id=\"footer\"]/div[3]/div/div[1]/div[1]/p/a")
	public WebElement termsNCondLink;
	
	@FindBy(xpath = "//*[@id=\"checkbox_tr\"]/p[2]")
	public WebElement tncCheckbox;
	
	@FindBy(xpath = "//*[@id=\"footer\"]/div[3]/div/div[1]/div[2]/p")
	public WebElement copyRightText;
	
}
