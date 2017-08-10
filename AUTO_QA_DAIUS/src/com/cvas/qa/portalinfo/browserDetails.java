package com.cvas.qa.portalinfo;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.cvas.qa.profileAddons.CreateProfile;

public class browserDetails {
	static WebDriver driver = null;

	public static WebDriver browseEnable(LinkedHashMap<String, String> in) throws InterruptedException, IOException {
		int browserOption = Integer.parseInt(in.get("BROWSER"));
		String BrowserName = null;

		if (browserOption == 1) {
			System.setProperty(in.get("DRIVERNAME_FireFox"), in.get("DRIVER_PATH_Firefox"));
			driver = CreateProfile.FireFoxProfile(in);

			BrowserName = "Mozilla FireFox Browser : ";
		} else if (browserOption == 2) {
			System.setProperty(in.get("DRIVERNAME_Chrome"), in.get("DRIVER_PATH_Chrome"));
			driver = CreateProfile.ChromeProfile(in);
			BrowserName = "Google Chrome Browser : ";
		} else {
			System.setProperty(in.get("DRIVERNAME_IE"), in.get("DRIVER_PATH_IE"));
			driver = new InternetExplorerDriver();
			BrowserName = "Internet Explorer Browser : ";
		}

		System.out.println("Browser Used -- " + BrowserName);
		driver.get(in.get("PORTAL_URL"));
		Thread.sleep(1000);

		return driver;
	}

}
