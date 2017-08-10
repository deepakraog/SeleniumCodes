package com.drg.helpers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class TestCaller {

	
	@Test
	public void TestMethod1(){
		System.out.println("Test Method 1");
	}
	
	@Test
	public void TestMethod2(){
		System.out.println("Test Method 2");
	}
	
	@Test
	public void TestMethod6(){
		System.out.println("Test Method 6");
	}
	
	@Test
	public void TestMethod7(){
		System.out.println("Test Method 7");
	}
	
	public static Connection con = null;
	public static PreparedStatement ps_sel = null;
	public static ResultSet rs = null;
	
	
	@Test
	public static void loadDB() throws IOException {
		@SuppressWarnings("boxing")
		Long msisdn = 9900123987l;
		System.out.println("inside loadDB()");
		try {
			con = JDBCHelper.getConnection();
			if (con != null) {
				ps_sel = con.prepareStatement("select * from messaging where msisdn="+msisdn+";");
				ps_sel.execute();
				rs = ps_sel.getResultSet();
				while (rs.next()) {
					System.out.println("msisdn"+rs.getString("msisdn")+" :: "+rs.getInt("OTP"));
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
	}
}
