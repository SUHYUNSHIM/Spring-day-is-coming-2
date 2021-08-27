package insa;

public class Insa {
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) { //35 숫자로 처리
		//xml에서는 문자를 넣어야 함, 그러나 자동 숫자로 변경됨.
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String insaGo(String str1) {
		return this.name+" 님\n"+str1;
	}
	public String helloYou(String str1) {
		return this.name+" 님\n"+str1+"\n나이는 "+this.age+"이시군요";
	}

}
