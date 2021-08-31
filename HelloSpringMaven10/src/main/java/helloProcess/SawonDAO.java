package helloProcess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class SawonDAO {
	
	//JdbcTemplate는 JDBC를 사용하여 DAO를 만드는데 이용되는 표준기술
		private ArrayList<Object> alist1;
		private JdbcTemplate jt1;
		
		public JdbcTemplate getJdbcTemplate() {//자동생성하지않고 직접입력
			return jt1;
		}
		
	    public void setJdbcTemplate(JdbcTemplate jt1) {//<--자동생성하지 않고 직접입력
	        this.jt1 = jt1;
	    }//setter
	    
	    public ArrayList<Object> selectALL() { //모두 출력 전문 메소드 
	        StringBuffer sb1 = new StringBuffer();//문자열의 변화가 많을때
	        sb1.append("select name, tel from TelTable");//String sb1 = "select....";
	                                     //jt1.query(select 문자열, new RowMapper(){메소드})             
	     alist1= (ArrayList<Object>)getJdbcTemplate().query //조회문
	    		 (sb1.toString(), new RowMapper<Object>() {//(1st, 2nd인자)
	   
	    public Object mapRow(ResultSet rs1, int joolBun1) throws SQLException {///
		      
	    	SawonVO sv1 = new SawonVO();
		    
	    	System.out.println("줄번호 = " + joolBun1); //0,1.....
		          sv1.setName(rs1.getString("name")); //rs1에서 읽어 VO로 
		          sv1.setTel(rs1.getString("tel"));
		          return sv1; ///////////////////////
	    	} //mapRow()-end
	 }); // new RowMaper()-end // query()-end
	     	System.out.println("자료 총갯수는 "+kajaSoo());
	     		  return alist1; //반환             //메소드호출문 
	}//select-ALL-end
	    
	public int kajaSoo(){//메소드정의문 
	            //int soo=jt1.queryForInt("select count(name) from TelTable");//deprecate //지금사용안함 
			int soo=jt1.queryForObject("select count(name) from TelTable",Integer.class); //결과가 one row
				  return soo;
	    } //kajasoo()-end
}        

