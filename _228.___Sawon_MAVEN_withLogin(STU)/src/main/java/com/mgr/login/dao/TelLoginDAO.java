package com.mgr.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.mgr.dbconn.TelInfoDBConn;
import com.mgr.login.vo.TelLoginVO;

@Repository
public class TelLoginDAO {

	private Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public TelLoginDAO() throws ClassNotFoundException, SQLException {
		conn = new TelInfoDBConn().getConnection();
	}
	
	public void getAllClose() throws SQLException {
		if(conn != null) conn.close();
		if(pstmt != null) pstmt.close();
		if(rs != null) rs.close();
	}
	
	public boolean memberInsert(TelLoginVO vo) {
		String sql = "INSERT INTO TELTABLE55_MEMBER VALUES (?,?)";
		boolean flag = false;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			int i = pstmt.executeUpdate();
			if(i==1) flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	public TelLoginVO memberlogin(TelLoginVO vo) {
		String sql = "SELECT * FROM TELTABLE55_MEMBER WHERE ID=? AND PW=?";
		TelLoginVO vo2 = new TelLoginVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo2 = new TelLoginVO(
						rs.getString("ID"),
						rs.getString("PW")
				);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo2;
	}
	
	public TelLoginVO memberMypage(TelLoginVO vo) {
		String sql = "SELECT * FROM TELTABLE55_MEMBER WHERE ID=?";
		TelLoginVO vo2 = new TelLoginVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo2 = new TelLoginVO(
						rs.getString("ID"),
						rs.getString("PW")
				);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo2;
	}
	
	public boolean memberUpdate(TelLoginVO vo) {
		String sql = "UPDATE TELTABLE55_MEMBER SET PW=? WHERE ID=?";
		boolean flag = false;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPw());
			pstmt.setString(2, vo.getId());
			int i = pstmt.executeUpdate();
			if(i==1) flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean memberDelete(TelLoginVO vo) {
		String sql = "DELETE FROM TELTABLE55_MEMBER WHERE ID=?";
		boolean flag = false;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			int i = pstmt.executeUpdate();
			if(i==1) flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
}
