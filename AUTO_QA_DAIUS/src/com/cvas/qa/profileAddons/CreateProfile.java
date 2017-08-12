package com.cvas.qa.profileAddons;

import java.io.File;

import java.io.IOException;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import com.cvas.qa.portalinfo.readProperties;

public class CreateProfile {

	public static WebDriver ChromeProfile(LinkedHashMap<String, String> in2) throws IOException {

		LinkedHashMap<String, String> in = readProperties.extension();
		String userAgent = in.get("USER-AGENT");
		String xmsisdn = in.get("X-MSISDN");

		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(in.get("CHROMEEXT")));
		options.addArguments("--start-maximized");
		options.addArguments("--X_MSISDN" + xmsisdn);
		options.addArguments("--User-Agent=" + userAgent);
		
		System.out.println("msisdn: " + xmsisdn);
		System.out.println("User-Agent: " + userAgent);

		System.setProperty(in2.get("DRIVERNAME_Chrome"), in2.get("DRIVER_PATH_Chrome"));
		WebDriver driver = new ChromeDriver(options);

		return driver;
	}

	public static WebDriver FireFoxProfile(LinkedHashMap<String, String> in2) throws IOException {

		LinkedHashMap<String, String> in = readProperties.extension();
		String userAgent = in.get("USER-AGENT");
		String xmsisdn = in.get("X-MSISDN");

		System.out.println("msisdn: " + xmsisdn);
		System.out.println("User-Agent: " + userAgent);
		
		/*
		 * DesiredCapabilities caps = new DesiredCapabilities(); FirefoxProfile
		 * profile = new FirefoxProfile();
		 */
		ProfilesIni allProfs = new ProfilesIni();
		FirefoxProfile profile = allProfs.getProfile(in2.get("PROFILENAME"));
		profile.addExtension(new
		  File("C:\\Users\\deepak.gaikwad\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\yyiie9af.Selenium_Test1\\extensions\\{b749fc7c-e949-447f-926c-3f4eed6accfe}.xpi"));
		profile.addExtension(new
		 File("C:\\Users\\deepak.gaikwad\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\yyiie9af.Selenium_Test1\\extensions\\firebug@software.joehewitt.com.xpi"));
		profile.setPreference("modifyheaders.config.active", true);
		profile.setPreference("modifyheaders.config.alwaysOn", true);
		profile.setPreference("modifyheaders.config.openNewTab", true);
		profile.setPreference("modifyheaders.headers.count", 2);
		profile.setPreference("modifyheaders.headers.action0", "Modify");
		//xmsisdn updated
		profile.setPreference("modifyheaders.headers.name0", "X-MSISDN");
		profile.setPreference("modifyheaders.headers.value0", xmsisdn);
		profile.setPreference("modifyheaders.headers.enabled0", true);
		profile.setPreference("modifyheaders.headers.action1", "Modify");
		profile.setPreference("modifyheaders.headers.name1", "User-Agent");
		profile.setPreference("modifyheaders.headers.value1", userAgent);
		profile.setPreference("modifyheaders.headers.enabled1", true);

		
		WebDriver driver = new FirefoxDriver(profile);
		return driver;

	}

}
