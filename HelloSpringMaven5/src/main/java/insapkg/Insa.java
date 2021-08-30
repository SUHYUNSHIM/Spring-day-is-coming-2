package insapkg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("insa10") //component scan의 대상임을 알려준다.
public class Insa { //bean 객체를 만들지 않더라도 , @Component 는 bean 객체에 대한 XML 설정 없이 자동 bean 등록한다.
	
	@Value("홍길동")
	private String name; //초기치가 전달되어 와야 한다. p:name= 이런게 없다. 
	//홍길동이 넘어올떄? --. @Value("홍길동")
	//setter x, 생성자 x
	
	public String helloName(String str1) {
		return this.name+" 님\n"+str1;
	}

}
