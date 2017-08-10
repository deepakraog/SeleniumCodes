package com.drg.methodFlows;

import java.util.LinkedHashMap;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.drg.helpers.DDT.ExcelLib;

public class iconChecks extends startUp {

	LinkedHashMap<String, String> inData;

	@Parameters("headerLogoCheck")
	@BeforeClass
	public void initiate(String inputFiles) {
		driver.navigate().to(in.get("PORTAL_URL"));
		inData = ExcelLib.testMethodInput(inputFiles);

	}

	@Test
	public void headerLogoCheck() {
		System.out.println("Inside headerLogoCheck");
		Assert.assertTrue(cpo.headerLogo.isDisplayed());
	}

}
