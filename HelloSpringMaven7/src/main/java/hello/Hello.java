package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configurationbean.ConfigurationBean;
import insa.Insa;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("<<<<<안녕>>>>>>");
		String str1 = "Hello, Spring";
		//.xml 설정 없이 ConfigurationBean이 .xml 역할
		//이때 자바 애노테이션에서는 AnnotationConfigApplicationContext 역할 
		ApplicationContext ac1 = new AnnotationConfigApplicationContext(ConfigurationBean.class);
		
		Insa insa = ac1.getBean("insaBean",Insa.class);
		System.out.println(insa.helloName(str1));

	}

}
