package insa;
//생성자 초점 클래스.

public class Insa {
	private String name;
	
	public Insa(String name) {
		this.name = name;
	}
	public Insa() {}
	public String helloName(String str1) {
		return this.name+" 님\n"+str1;
	}

}
