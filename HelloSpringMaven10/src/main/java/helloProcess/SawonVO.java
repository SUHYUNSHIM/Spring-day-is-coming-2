package helloProcess;

public class SawonVO {
	//pom.xml에 spring-jdbc.jar를 dependency한후
	private String name;
	private String tel;
								//select만 일단 작성
	//SawonVo --> jdbcTemplate --> SawonDAO --->db
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	

}
