package hello;

import org.springframework.context.support.GenericXmlApplicationContext;

import insa.Insa;
import setter.Setter;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<<<<<안녕>>>>>>>");
		String str1 = "오늘 날씨 어때요?";
		
		GenericXmlApplicationContext gxac1 = new GenericXmlApplicationContext("applicationContext.xml");
		
		Insa insa1 = gxac1.getBean("insaBean",Insa.class); //insaBean 객체를 불러들인다. Insa class의 객체.
		Insa insa2 = gxac1.getBean(Insa.class);
		//
		Insa insa3 =(Insa)gxac1.getBean("insaBean");
		System.out.println(insa1.insaGo(str1));
		
		System.out.println(insa1.helloYou(str1));
		//
		Setter setter1 = gxac1.getBean("setterBean",Setter.class);
		System.out.println(setter1.kajaHello(str1));
		//insaBean.helloName(str1)
	    //insa의 helloName()호출 //출력전문메소드 나와
		gxac1.close();
	}

}
