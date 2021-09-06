package hello;

import org.springframework.context.support.GenericXmlApplicationContext;

import constarg.Constarg;
import insa.Insa;

public class Hello {
	public static void main(String[] args) {
		System.out.println("<<<<<<<안녕>>>>>>>");
		String str1 = "Hello, Spring";
		GenericXmlApplicationContext gxac1 = new GenericXmlApplicationContext("applicationContext.xml");
		Insa insa = gxac1.getBean("insaBean",Insa.class);
		//이렇게 insaBean 이름이 필요할 경우 시, <bean...> 을 작성하는 @Autowird로 처리
		//생성자 ,setter 생략을 당연함.
		
		
		System.out.println(insa.helloName(str1)); //@Value ... 처리 setName()
		Constarg con = gxac1.getBean("constargBean",Constarg.class);
		System.out.println(con.kajaHello(str1));
		//결국 insa 객체가 전달되어 insa.helloName(str1);이 잘 처리됨.
		gxac1.close();
		
	}

}
