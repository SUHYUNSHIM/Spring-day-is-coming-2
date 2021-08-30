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
		
		System.out.println(insa.helloName(str1));
		Constarg con = gxac1.getBean("constargBean",Constarg.class);
		System.out.println(con.kajaHello(str1));
		gxac1.close();
		
	}

}
