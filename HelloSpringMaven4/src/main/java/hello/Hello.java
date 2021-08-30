package hello;

import org.springframework.context.support.GenericXmlApplicationContext;

import insa.Insa;

public class Hello {
	public static void main(String[] args) {
		System.out.println("<<<<<안녕>>>>>>");
		String str1 = "Hello, Spring";
		
		GenericXmlApplicationContext gxac1 = new GenericXmlApplicationContext("applicationContext.xml");
		Insa insa = gxac1.getBean("insaBean", Insa.class);
		System.out.println(insa.helloName(str1));
		gxac1.close();
		/*<<<안녕>>
		 * 홍길동님
		 * Hello, Spring
		 * */
	}

}
