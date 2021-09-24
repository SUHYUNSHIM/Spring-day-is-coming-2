package com.mgr.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.mgr.dbconn.LoginDBConn;
import com.mgr.login.vo.LoginVO;

@Repository
public class LoginDAO {

	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public LoginDAO() 
			throws ClassNotFoundException, SQLException {
		con = new LoginDBConn().getConnection();
	}
	
	//id 기준 , read.
	public LoginVO getLogin(LoginVO vo1) throws SQLException { 
		LoginVO login = null;
		String sql = "select * from teltable55_member where id = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo1.getId());
		rs = pstmt.executeQuery();
		if(rs.next()) {
			login=new LoginVO();//////////////
			login.setId(rs.getString("id"));			
			login.setPw(rs.getString("tel"));
		}

			return login;
		}
	
	
	//아이디 기준으로 찾아서 아이디, 비밀번호 업데이트 
	public void updateLogin(LoginVO vo1) throws SQLException,ClassNotFoundException {

		String sql ="update TelTable55_MEMBER set id=?, pw=? where id=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo1.getId()); 
		pstmt.setString(2, vo1.getPw());
		pstmt.setString(3, vo1.getId());
		
		pstmt.executeUpdate();
	}
	
	//아이디, 비밀 번호 insert 즉, 가입.
	public void insertLogin(LoginVO vo1) throws SQLException {
		String sql = "insert into TELTABLE55_MEMBER values(?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo1.getId());
		pstmt.setString(2, vo1.getPw());
		pstmt.executeUpdate();
	}
	
	//id 기준으로 찾아서 테이블에서 삭제. 회원 탈퇴.
	public void deleteLogin(LoginVO vo1) throws SQLException {
		String sql = "DELETE TELTABLE55_MEMBER WHERE id = ?";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo1.getId());
		pstmt.executeUpdate();
	
	}
	
}
