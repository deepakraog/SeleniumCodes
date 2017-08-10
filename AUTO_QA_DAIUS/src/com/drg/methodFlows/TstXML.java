package com.drg.methodFlows;

import com.drg.helpers.DDT.XMLUtil;

public class TstXML {

	public static void main(String[] args) throws Exception {
		
		XMLUtil.createXml("Resources\\Initial.xls","CVAS_Portal_Automation");
		XMLUtil.autoRunXml();
	}
}
