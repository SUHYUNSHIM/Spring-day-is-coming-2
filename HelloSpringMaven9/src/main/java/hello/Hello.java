package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import helloProcess.HelloProcess;

public class Hello {

	public static void main(String[] args) {
		 System.out.println("<<<<<<< 안녕 >>>>>>>");
	      ApplicationContext ac1= new ClassPathXmlApplicationContext("applicationContext.xml");

	      HelloProcess hp1= (HelloProcess) ac1.getBean("helloProcessBean");        
	                
	                hp1.kajaDrive(); //핵심로직메소드
	                hp1.kajaDrive(); /////////////
	                hp1.kajaDrive(); //이것가동시마다 
	                                 // 전에 공통가동///////
	        
	                 ((AbstractApplicationContext) ac1).close();
	        }

}
