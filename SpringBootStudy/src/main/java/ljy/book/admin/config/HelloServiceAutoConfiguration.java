package ljy.book.admin.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(value = HelloService.class)
public class HelloServiceAutoConfiguration {
	@Bean
	public HelloService helloService() {
		return new DefaultHelloService();
	}
}
