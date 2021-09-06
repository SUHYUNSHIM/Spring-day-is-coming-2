package hello;

import org.springframework.context.support.GenericXmlApplicationContext;

import insapkg.Insa;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("<<<안녕>>>>");
		String str1 = "Hello, Spring";
		GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("applicationContext.xml");
		
		Insa insa = gxac.getBean("insa10",Insa.class); //일반적으로 insa10 자리에는 bean 객체 명이 들어간다.
		//insa --> insapkg --> insa10 이름으로 처리 . @Component에서 사용된 것
		//즉, bean 객체 자리에는 @Component의 이름을 갖다가 쓴다.
		System.out.println(insa.helloName(str1));  //@Value("홍길동")
		gxac.close();
	}

}
