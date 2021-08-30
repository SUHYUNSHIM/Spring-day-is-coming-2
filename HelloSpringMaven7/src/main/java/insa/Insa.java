package insa;

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
