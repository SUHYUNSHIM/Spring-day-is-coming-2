package hello;

import org.springframework.context.support.GenericXmlApplicationContext;

import insa.Insa;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<<<<<안녕>>>>>>>");
		String str1 = "오늘 날씨 어때요?";
		
		GenericXmlApplicationContext gxac1 = new GenericXmlApplicationContext("applicationContext.xml");
		
		Insa insa1 = gxac1.getBean("insaBean",Insa.class);
		Insa insa2 = gxac1.getBean(Insa.class);
		
		Insa insa3 =(Insa)gxac1.getBean("insaBean");
		System.out.println(insa1.insaGo(str1));
		gxac1.close();
	}

}
