package sawonpkg;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Sawonmain {
	public static void main(String[] args) {
		GenericXmlApplicationContext ac1 = new GenericXmlApplicationContext("appcon.xml");
		System.out.println("Sawon 클래스, getter, setter, toString() 사용하여 출력");
		
		Sawon b1 = (Sawon)ac1.getBean("sawonBean1");
		b1.setId(3);
		b1.setIrum("연수");
		System.out.println(b1.toString());
		
		Sawon b2 = (Sawon)ac1.getBean("sawonBean1");
		b2.setId(5);
		b2.setIrum("태식");
		
		if(b1==b2)
			System.out.println("같은 인스턴스라는");
		System.out.println(b1+" "+b2);
	}
}
