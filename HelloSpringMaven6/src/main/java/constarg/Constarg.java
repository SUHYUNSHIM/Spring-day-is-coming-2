package constarg;

import insa.Insa;
import org.springframework.beans.factory.annotation.Autowired;

public class Constarg {
	
	/////////////////////////////[객체 전달]////////////////////
	
	@Autowired //저쪽에서 뭔가 전달되어 온다.
	private Insa insa; //insa 객체가 필드명, 여기에는 insa 객체가 mapping.
	//요 자리에는 원래는 생성자 또는 setter가 있던 자리. 당연히 생략해야.
	public String kajaHello(String str1) {
		return insa.helloName(str1);
		//insa 객체 mapping 때문에 위처럼 insa 객체.메소드() 사용가능
		
	}

}
