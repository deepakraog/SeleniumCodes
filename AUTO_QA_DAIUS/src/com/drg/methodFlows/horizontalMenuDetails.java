package com.drg.methodFlows;

import java.util.LinkedHashMap;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.drg.helpers.DDT.ExcelLib;

public class horizontalMenuDetails extends startUp {

	LinkedHashMap<String, String> inData;

	@Parameters("horizontalMenuThemeExists")
	@BeforeClass
	public void initiate(String inputFiles) {
		inData = ExcelLib.testMethodInput(inputFiles);
	}

	@Test
	public void horizontalMenuThemeExists() {
		System.out.println("inside horizontalMenuThemeExists");
		Assert.assertTrue(cpo.horizontalMenu.isDisplayed());
	}

	@Test
	public void homeHorizontalMenuClick() {
		System.out.println("inside homeHorizontalMenuClick");
		cpo.hMenuHomePageLink.click();
		Assert.assertTrue(cpo.horizontalMenu.isDisplayed());
	}

	@Test
	public void videoHorizontalMenuClick() {
		System.out.println("inside videoHorizontalMenuClick");
		cpo.hMenuVideoHomePageLink.click();
		Assert.assertTrue(driver.getCurrentUrl().contains(inData.get("videoPagePart")));
	}

	@Test
	public void gameHorizontalMenuClick() {
		System.out.println("inside gameHorizontalMenuClick");
		cpo.hMenuGamesHomePageLink.click();
		Assert.assertTrue(driver.getCurrentUrl().contains(inData.get("gamePagePart")));
	}

	@Test
	public void wallpaperHorizontalMenuClick() {
		System.out.println("inside wallpaperHorizontalMenuClick");
		cpo.hMenuWallPaperHomePageLink.click();
		Assert.assertTrue(driver.getCurrentUrl().contains(inData.get("wallpaperPagePart")));
	}

	@Test
	public void musicHorizontalMenuClick() {
		System.out.println("inside musicHorizontalMenuClick");
		cpo.hMenuMusicHomePageLink.click();
		Assert.assertTrue(driver.getCurrentUrl().contains(inData.get("musicPagePart")));
	}

	@Test
	public void myStatusHorizontalMenuClick() {
		System.out.println("inside myStatusHorizontalMenuClick");
		cpo.hMenuMyAccPageLink.click();
		Assert.assertTrue(driver.getCurrentUrl().contains(inData.get("myStatusPagePart")));
	}
	
	@Test
	public void HorizontalMenuRightClick() {
		System.out.println("inside HorizontalMenuRightClick");
		cpo.hMenuRightClick.click();
		Assert.assertTrue(cpo.hMenuLeftClick.isDisplayed());
		
		
	}
	
	@Test
	public void HorizontalMenuLeftClick() {
		System.out.println("inside HorizontalMenuLeftClick");
		Assert.assertTrue(cpo.hMenuLeftClick.isDisplayed());
		
		
	}

}
