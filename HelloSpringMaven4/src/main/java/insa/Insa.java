package insa;
//생성자 초점 클래스.

public class Insa {
	private String name;
	//생성자 생성할 것
	//객체 생성+ 홍길동 초기치 인자로 xml에서 넣어준다.
	//vo를 생성하여 injection
	
	public Insa(String name) { //생성자 오버로딩
		this.name = name;
	}
	public Insa() {} //디폴트 생성자
	
	//setter는 없다. contruction injection이므로. 
	public String helloName(String str1) {
		return this.name+" 님\n"+str1;
	}

}
