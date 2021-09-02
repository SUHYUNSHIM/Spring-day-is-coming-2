package com.mgr.sawon.dao;///////////////

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.mgr.dbconn.TelInfoDBConn;////////
import com.mgr.sawon.vo.TelInfoVO;//////////



@Repository    
public class TelInfoDAO { //나는 com.mgr.sawon.dao 아래 TelInfoDAO.java 
	
	
	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public TelInfoDAO() 
			throws ClassNotFoundException, SQLException {
		con = new TelInfoDBConn().getConnection();
	}
	
	
	
	
	
	// 전체출력           
	public ArrayList <TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws SQLException{
	ArrayList<TelInfoVO> tiarray = new ArrayList<TelInfoVO>();
	String sql = "SELECT * FROM TelTable55 ORDER BY id";
		
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			TelInfoVO telinfo=new TelInfoVO();
			telinfo.setId(rs.getInt("id"));
			telinfo.setName(rs.getString("name"));
			telinfo.setTel(rs.getString("tel"));
		    
			tiarray.add(telinfo);
			
		}
		return tiarray;
	}
		
	
	
	
	
	
	
	 //한명출력        
	public TelInfoVO getTelinfo(TelInfoVO vo1) 
			           throws SQLException { //getTelinfo 는 한명처리 
		TelInfoVO telinfo = null;
		String sql = "select * from teltable55 where name = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo1.getName());//검색 
		rs = pstmt.executeQuery();
		if(rs.next()) {
			telinfo=new TelInfoVO();//////////////
			telinfo.setId(rs.getInt("id"));
			telinfo.setName(rs.getString("name"));
			telinfo.setTel(rs.getString("tel"));
		}
		
		return telinfo;//객체단위 
	}
	
	
	

	
	public void updateTelinfo(TelInfoVO vo1) 
			throws SQLException,ClassNotFoundException {

 String sql ="update TelTable55 set id=?, tel=? where name=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, vo1.getId()); 
		pstmt.setString(2, vo1.getTel());
		pstmt.setString(3, vo1.getName());
		
		pstmt.executeUpdate();
	}
	
	public void insertTelinfo(TelInfoVO vo1)  throws SQLException {
		String sql = "INSERT into TelTable55 values(?,?,?)";
			
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, vo1.getId());
		pstmt.setString(2,vo1.getName());
		pstmt.setString(3, vo1.getTel());
		
		pstmt.executeUpdate();
	}	
	
	
	
	
	
	
	public void deleteTelinfo(TelInfoVO vo1) throws SQLException {
		String sql = "DELETE TelTable55 WHERE name = ?";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo1.getName());
		pstmt.executeUpdate();
	
	}
}














