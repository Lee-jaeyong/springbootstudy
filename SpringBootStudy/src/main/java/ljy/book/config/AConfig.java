package ljy.book.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ljy.book.admin.anotation.MyBean;

@Configuration
public class AConfig {

	@Bean
	public MyBean aConfig() {
		return new MyBean("AConfig");
	}
}
