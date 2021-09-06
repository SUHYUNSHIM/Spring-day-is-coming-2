package insa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


/*@Autowired는 <property>나 <contruct-arg>역할로
자동으로 같은 이름의 bean을 찾아 injection
그러므로 setter, 생성자 선언 필요 없음.*/

public class Insa {
	
	/* private String name;
	 * 홍길동을 인자로 전달받고 싶다면?
	 * */	
	
	@Autowired @Value("홍길동") //필드
	private String name; //setName("홍길동") // p:name= x
	//나는 name에다가 mapping 할 것인데 초기치는 홍길동이다.
	
	//setter 쓸 필요 없다.
	
	public String helloName(String str1) {
		return this.name+" 님\n"+str1;
	}

}
