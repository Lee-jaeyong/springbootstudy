package ljy.book.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import ljy.book.admin.anotation.MyService;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan({ "ljy.book.admin.aop", "ljy.book.admin.conditional" })
public class AspectConfig {

	@Bean
	public MyService myService() {
		return new MyService();
	}
}
