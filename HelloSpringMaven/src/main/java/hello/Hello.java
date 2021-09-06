package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bangka.Bangka1;

public class Hello {
	public static void main(String[] args) {
		//bean은 spring이 관리하는 인스턴스
		//ApplicationContext = bean container = bean을 관리
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("applicationContext.xml");	
		
		Bangka1 b1 = (Bangka1) ac1.getBean("bangkaBean1"); //위의 경로에서 만든 xml에서 bean을 찾아낸다. 여기서 new로 객체를 생성하지 않았음.
		//Bangka1 bangkaBean1 = new Bangka1();		   //bean을 객체로 타입 변환. bean 객체 생성 및 초기화 제거 등을 관리함.
		b1.bangkabangka1("홍길동");
		
	}

}
