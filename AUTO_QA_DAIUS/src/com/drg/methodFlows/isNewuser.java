package com.drg.methodFlows;


import java.util.LinkedHashMap;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.drg.helpers.DDT.ExcelLib;


public class isNewuser extends startUp {

	public static LinkedHashMap<String,String> inData;
	
	@Parameters("noSubscriptionCheckMyLocker")
	@BeforeClass
	public void initiate(String inputFiles) {
		inData = ExcelLib.testMethodInput(inputFiles);
	}

	@Test
	public void newUserLoginCheck() {
		System.out.println("inside newUserLoginCheck");
		Assert.assertTrue(cpo.loginBar.isDisplayed());
	}

	@Test
	public void newUserTNCcheck() {
		System.out.println("inside newUserTNCcheck");
		ca.pageEnd();
		Assert.assertTrue(cpo.termsNCondLink.isDisplayed());
		ca.pageHome();
	}

	@Test
	public void noSubscriptionCheckMyLocker() {
		System.out.println("Inside noSubscriptionCheckMyLocker");
		cpo.headerMenu.click();
		ca.subMenuRender(cpo);
		cpo.vMyAccSubMenu.click();
		Assert.assertEquals(mlpo.multiLockSubGrid.getText(), inData.get("New_User_Text_MyLocker"));
	}

}
