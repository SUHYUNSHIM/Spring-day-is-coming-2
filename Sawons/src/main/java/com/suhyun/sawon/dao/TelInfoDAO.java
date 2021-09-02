package com.suhyun.sawon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.suhyun.dbconn.TelInfoDBConn;
import com.suhyun.sawon.vo.TelInfoVO;

//DAO라고 spring에게 알려줌 , 외부 i/o 작업 처리
//@Repository, @Service 모두 이 클래스에 대한 bean 객체 생성. root에

@Repository //나 DAO야.
public class TelInfoDAO {
	private Connection con;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    
    public TelInfoDAO() 
                    throws ClassNotFoundException, SQLException {
            con = new TelInfoDBConn().getConnection();
    }
    
    public ArrayList <TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws SQLException{
        ArrayList<TelInfoVO> tiarray = new ArrayList<TelInfoVO>();
        String sql = "SELECT * FROM TelTable55 ORDER BY id";
                
                pstmt = con.prepareStatement(sql);
                rs = pstmt.executeQuery();
                while(rs.next()) {
                        TelInfoVO telinfo=new TelInfoVO();
                        telinfo.setId(rs.getInt("id"));//아하 여기서 객체 내용이  들어가는구만 
                        telinfo.setName(rs.getString("name"));
                        telinfo.setTel(rs.getString("tel"));
                    
                        tiarray.add(telinfo);//그런다음 ArrayList로 집합 
                        
                }
                return tiarray;
        }
    //한명 출력. 위의 getAllTelinfo는 전체 출력.
    public TelInfoVO getTelinfo(TelInfoVO vo1) throws SQLException{ //전달도 객체 단위, getTelinfo는 한 명 처리
    	TelInfoVO telinfo = null;
    	String sql = "select * from teltable55 where name= ?";
    	pstmt = con.prepareStatement(sql);
    	pstmt.setString(1, vo1.getName());
    	rs = pstmt.executeQuery();
    	if(rs.next()) {
    		telinfo = new TelInfoVO();
    		telinfo.setName(rs.getString("name"));
    		telinfo.setTel(rs.getString("tel"));
    	}
    	return telinfo;
    }
    public void updateTelinfo(TelInfoVO vo1) throws SQLException, ClassNotFoundException{
    	String sql = "update TelTable55 set id=?, tel=? where name=?";
    	pstmt.setInt(1, vo1.getId()); //이걸로 id=? 에 넣는다 
        pstmt.setString(2, vo1.getTel());
        pstmt.setString(3, vo1.getName());
        
        pstmt.executeUpdate();
    }
    
    public void insertTelinfo(TelInfoVO vo1) throws SQLException{
    	String sql = "insert into teltable55 values(?,?,?)";
    	pstmt = con.prepareStatement(sql);
    	pstmt.setInt(1, vo1.getId());
    	pstmt.setString(2, vo1.getName());
    	pstmt.setString(3, vo1.getTel());
    }
    
    public void deleteTelinfo(TelInfoVO vo1) throws SQLException {
        String sql = "DELETE TelTable55 WHERE name = ?";
        
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, vo1.getName());
        pstmt.executeUpdate();

}
}
