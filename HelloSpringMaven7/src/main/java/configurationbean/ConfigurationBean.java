package configurationbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import insa.Insa;

@Configuration //나 자바로 만드는 환경설정 파일이야. 즉, 나 bean 객체를 적는 .xml이야.
public class ConfigurationBean {
	
	//여기에 bean 태그가 나오는 위치. @Bean으로 시작 
	@Bean //이것 자체는 insaBean() 메소드
	public Insa insaBean() { //이름이 id개념= [객체명]
								//이것은 호출에 대한 메소드 정의문 역할 
		return new Insa("홍길동"); //객체 만들어 주고 + 초기치 주고 리턴 (문자열 전달)
	} //new Insa("홍길동") 객체가 bean 객체

	
	///<bean id~>의 것을 위의 형태(java)로 쓴다. 
}
