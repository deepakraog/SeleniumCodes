package com.cvas.qa.portalinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Properties;

public class readProperties {

	static InputStream dataInput,extension,iElements;
	static Properties prop;
	static {
		prop = new Properties();
		try {
			dataInput = new FileInputStream("dataInput.properties");
			extension = new FileInputStream("addExtension.properties");
			iElements = new FileInputStream("inspectELements.properties");
			prop.load(dataInput);
			prop.load(extension);
			prop.load(iElements);
			
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

	public static LinkedHashMap<String, String> driverDetails() {
		LinkedHashMap<String, String> params = new LinkedHashMap<String, String>();

		params.put("BROWSER", prop.getProperty("BROWSER"));
		params.put("DRIVERNAME_FireFox", prop.getProperty("DRIVERNAME_FireFox"));
		params.put("DRIVERNAME_Chrome", prop.getProperty("DRIVERNAME_Chrome"));
		params.put("DRIVERNAME_IE", prop.getProperty("DRIVERNAME_IE"));
		params.put("PORTAL_URL", prop.getProperty("PORTAL_URL"));
		params.put("PROFILENAME", prop.getProperty("PROFILENAME"));
		params.put("DRIVER_PATH_Firefox", prop.getProperty("DRIVER_PATH_Firefox"));
		params.put("DRIVER_PATH_Chrome", prop.getProperty("DRIVER_PATH_Chrome"));
		params.put("DRIVER_PATH_IE", prop.getProperty("DRIVER_PATH_IE"));
		params.put("XCEL_FILE_PATH",prop.getProperty("XCEL_FILE_PATH"));
		
		return params;
	}
	
	
	public static LinkedHashMap<String,String> extension(){
		LinkedHashMap<String, String> paramsExt = new LinkedHashMap<String, String>();
		
		paramsExt.put("USER-AGENT", prop.getProperty("USER-AGENT"));
		paramsExt.put("X-MSISDN", prop.getProperty("X-MSISDN"));
		paramsExt.put("CHROMEEXT",prop.getProperty("CHROMEEXT"));
		
		return paramsExt;
	}
	
	
	public static LinkedHashMap<String,String> inspectE(){
		LinkedHashMap<String,String> ielements = new LinkedHashMap<String,String>();
		
		ielements.put("searchIcon", prop.getProperty("searchIcon"));
		ielements.put("searchTextBox", prop.getProperty("searchTextBox"));
		ielements.put("searchClickButton", prop.getProperty("searchClickButton"));
		ielements.put("resultTag",prop.getProperty("resultTag"));
		ielements.put("searchTag",prop.getProperty("searchTag"));
		ielements.put("searchCase",prop.getProperty("searchCase"));
		ielements.put("headerMenu", prop.getProperty("headerMenu"));
			
		return ielements;
	}
	
	
}
