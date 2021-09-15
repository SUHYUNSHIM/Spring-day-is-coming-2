package com.mgr.sawon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.mgr.dbconn.TelInfoDBConn;
import com.mgr.sawon.vo.TelInfoVO;


@Repository
public class TelInfoDAO {
	
	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public TelInfoDAO() throws ClassNotFoundException, SQLException {
		con = new TelInfoDBConn().getConnection();
	}
	
	public void pstmtclose() throws SQLException {
		if(pstmt != null) {
			pstmt.close();
		}
	}
	
	public void getAllClose() throws SQLException {
		if(pstmt != null) {
			pstmt.close();
		}
		if(rs != null) {
			rs.close();
		}
		if(con != null) {
			con.close();
		}
	}
	
	public ArrayList<TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws SQLException{
		ArrayList<TelInfoVO> tiarray = new ArrayList<TelInfoVO>();
		String sql = "select * from TelTable55 order by id";
		
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				TelInfoVO telinfo = new TelInfoVO();
				telinfo.setId(rs.getInt("id")); // 객체 내용이 들어간다.
				telinfo.setName(rs.getString("name"));
				telinfo.setTel(rs.getString("tel"));
				
				tiarray.add(telinfo); //ArrayList로 집합.
			}
		
		
		return tiarray;
		
	}
	
	public TelInfoVO getTelinfo(TelInfoVO vo1) throws SQLException {
		TelInfoVO telinfo = new TelInfoVO();
		String sql = "select * from teltable55 where id=?";
		
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo1.getId());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				telinfo.setId(rs.getInt("id"));
				telinfo.setName(rs.getString("name"));
				telinfo.setTel(rs.getString("tel"));
			}
		
		return telinfo;
		
	}
	
	public int updateTelinfo(TelInfoVO vo1){
		String sql = "update teltable55 set name=?, tel=? where id=?";
		int c = 0;
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, vo1.getName());
				pstmt.setString(2, vo1.getTel());
				pstmt.setInt(3, vo1.getId());
				
				c = pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return c;
	}
	
	public int insertTelinfo(TelInfoVO vo1) {
		String sql = "insert into teltable55 values("
				+ "?,?,?)";
		int c = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo1.getId());
			pstmt.setString(2, vo1.getName());
			pstmt.setString(3, vo1.getTel());
			c = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return c;
	}
	
	public int deleteTelinfo(TelInfoVO vo1) throws SQLException {
		String sql = "delete from teltable55 where id=?";
		int c = 0;
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, vo1.getId());
		c = pstmt.executeUpdate();
		return c;
	}
}
