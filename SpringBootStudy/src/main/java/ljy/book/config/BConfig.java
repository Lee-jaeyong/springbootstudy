package ljy.book.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ljy.book.admin.anotation.MyBean;

@Configuration
public class BConfig {

	@Bean
	public MyBean bConfig() {
		return new MyBean("BConfig");
	}
}
