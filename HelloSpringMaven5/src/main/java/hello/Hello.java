package hello;

import org.springframework.context.support.GenericXmlApplicationContext;

import insapkg.Insa;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<<안녕>>>>");
		String str1 = "Hello, Spring";
		GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("applicationContext.xml");
		
		Insa insa = gxac.getBean("insa10",Insa.class);
		System.out.println(insa.helloName(str1));
		gxac.close();
	}

}
