package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configurationbean.ConfigurationBean;
import insa.Insa;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<<<<안녕>>>>>>");
		String str1 = "Hello, Spring";
		ApplicationContext ac1 = new AnnotationConfigApplicationContext(ConfigurationBean.class);
		
		Insa insa = ac1.getBean("insaBean",Insa.class);
		System.out.println(insa.helloName(str1));

	}

}
