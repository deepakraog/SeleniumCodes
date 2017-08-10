package com.drg.helpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author deepak.gaikwad
 */

public class JDBCHelper {

	public static Connection getConnection() throws IOException {
		Properties prop = new Properties();
		InputStream input = null;
		input = JDBCHelper.class.getClassLoader().getResourceAsStream("config.properties");
		prop.load(input);

		Connection con = null;
		String url = prop.getProperty("URL");
		String uid = prop.getProperty("UID");
		String pwd = prop.getProperty("PASSWORD");
		String driverName = prop.getProperty("DBDRIVER");
		try {

			Class.forName(driverName);

			con = DriverManager.getConnection(url, uid, pwd);

			return con;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void close(Statement x) {

		try {
			if (x != null)
				x.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void close(Connection x) {

		try {
			if (x != null)
				x.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void close(ResultSet x) {

		try {
			if (x != null)
				x.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}