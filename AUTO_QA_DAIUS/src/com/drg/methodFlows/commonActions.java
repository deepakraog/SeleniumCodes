package com.drg.methodFlows;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.cvas.qa.POM.commonPageObjects;
import com.drg.helpers.JDBCHelper;

public class commonActions extends startUp {
	public static Connection con = null;
	public static PreparedStatement ps_sel = null;
	public static ResultSet rs = null;

	public void subMenuRender(commonPageObjects cpo) {
		Actions actions = new Actions(driver);
		actions.moveToElement(cpo.vMyAccSubMenu).perform();
	}

	public void pageEnd() {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	}

	public void pageHome() {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	}

	public int otpValidation(Long msisdn) throws IOException {
		int otp = 0;
		System.out.println("inside otpValidation");
		try {
			con = JDBCHelper.getConnection();
			if (con != null) {
				ps_sel = con.prepareStatement(
						"select * from messaging where msisdn=" + msisdn + "AND created  >= CURDATE();");
				ps_sel.execute();
				rs = ps_sel.getResultSet();
				while (rs.next()) {
					System.out.println("msisdn " + rs.getString("msisdn") + " :: otp " + rs.getInt("OTP"));
					otp = rs.getInt("OTP");
				}
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCHelper.close(rs);
			JDBCHelper.close(ps_sel);
			JDBCHelper.close(con);
		}
		return otp;
	}
}
