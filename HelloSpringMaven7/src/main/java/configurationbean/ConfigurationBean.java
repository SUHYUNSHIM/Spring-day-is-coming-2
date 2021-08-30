package configurationbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import insa.Insa;

@Configuration //나 자바로 만드는 환경설정 파일이야. 즉, 나 bean 객체를 적는 .xml이야.
public class ConfigurationBean {
	
	//여기에 bean 태그가 나오는 위치
	@Bean
	public Insa insaBean() {
		return new Insa("홍길동");
	}

}
