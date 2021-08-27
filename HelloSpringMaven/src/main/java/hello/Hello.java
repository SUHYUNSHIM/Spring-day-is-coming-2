package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bangka.Bangka1;

public class Hello {
	public static void main(String[] args) {
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Bangka1 b1 = (Bangka1) ac1.getBean("bangkaBean1");
		b1.bangkabangka1("홍길동");
	}

}
