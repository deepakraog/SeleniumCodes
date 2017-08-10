package com.drg.methodFlows;

import java.util.LinkedHashMap;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.drg.helpers.DDT.ExcelLib;

public class subscriptionFlow extends startUp {

	public static LinkedHashMap<String,String> inData;
	
	@Parameters("")
	@BeforeClass
	public void initiate(String inputFiles) {
		inData = ExcelLib.testMethodInput(inputFiles);
	}

	@Test
	public void newUserLoginCheck() {
		System.out.println("inside newUserLoginCheck");
		Assert.assertTrue(cpo.loginBar.isDisplayed());
	}

	
	
	
	
}
