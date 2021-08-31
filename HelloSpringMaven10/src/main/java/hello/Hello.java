package hello;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import helloProcess.SawonDAO;
import helloProcess.SawonVO;

public class Hello {

	public static void main(String[] args) {
		ApplicationContext ac1 = new GenericXmlApplicationContext("jdbctemplate.xml");
	       SawonDAO sd1 = (SawonDAO) ac1.getBean("sawonDAOBean");

	       //전체검색 
	        ArrayList<Object> alist1 = sd1.selectALL();//////////////
	                   //DAO의 selectALL()로 arraylist를 받아  
	        Iterator<Object> it1 = alist1.iterator();
	        while (it1.hasNext()) {
	                 SawonVO sv1 = (SawonVO) it1.next();
	            System.out.print(sv1.getName() + "\t" +sv1.getTel());
	                System.out.println();
	        }//Iterator로 출력-end
	        
	         ((AbstractApplicationContext) ac1).close();

	}

}
