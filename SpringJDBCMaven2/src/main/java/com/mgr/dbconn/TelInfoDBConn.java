package com.mgr.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TelInfoDBConn {
	private Connection con;
	
	public Connection getConnection() {
		return con;
	}
	
	/* DB connection 하기 위해 */
	public TelInfoDBConn() 
			throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection
  		("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
	}
}
