package insa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Insa {
	
	@Autowired @Value("홍길동")
	private String name; //setName("홍길동") // p:name= x
	//나는 name에다가 mapping 할 것인데 초기치는 홍길동이다.
	
	//setter 쓸 필요 없다.
	
	public String helloName(String str1) {
		return this.name+" 님\n"+str1;
	}

}
