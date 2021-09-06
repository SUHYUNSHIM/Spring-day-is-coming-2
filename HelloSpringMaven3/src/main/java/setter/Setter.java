package setter;

import insa.Insa;

public class Setter {
	private Insa insa; //자료형 변수명. insaBean 객체 참조변수 들어감
	public Insa getInsa() { //반환형이 객체
		return insa;
	}
	public void setInsa(Insa insa) { //setter injection setInsa.. p:insa-ref = //이렇게 객체를
		this.insa = insa;  //insaBean 객체가 전달되어 insa 필드에 들어간다.
	}
	public String kajaHello(String str1) {
		return insa.helloName(str1); //insaBean.helloName()메소드 
	}
}
