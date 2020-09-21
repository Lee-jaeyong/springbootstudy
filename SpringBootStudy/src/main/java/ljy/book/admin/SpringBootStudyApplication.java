package ljy.book.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import ljy.book.admin.anotation.EnableAutoMyModule;
import ljy.book.admin.anotation.MyBean;
import ljy.book.admin.anotation.UseMyBean;
import ljy.book.admin.conditional.onMissingBean.ConditionClass;
import ljy.book.admin.properties.MyProperties;

@SpringBootApplication
@EnableConfigurationProperties({ MyProperties.class })
@EnableAutoMyModule("AConfig")
public class SpringBootStudyApplication {

	@Bean
	public UseMyBean bean(MyBean myBean) {
		return new UseMyBean();
	}

	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		SpringApplication.run(SpringBootStudyApplication.class, args);
	}

	@Component
	public class CustomRunner implements CommandLineRunner {

		@Autowired
		MyProperties myProperties;

		@Autowired
		UseMyBean useMyBean;

		@Autowired
		ConditionClass conditionClass;

		@Override
		public void run(String... args) throws Exception {
			System.out.println(conditionClass.getValue());
			useMyBean.printMsg();
			System.out.println("---------------------------");
			System.out.println(myProperties.getName());
			System.out.println(myProperties.getServerIp());
			System.out.println(myProperties.getDescription());
		}

	}
}
