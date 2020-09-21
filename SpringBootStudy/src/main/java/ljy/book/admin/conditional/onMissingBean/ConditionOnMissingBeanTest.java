package ljy.book.admin.conditional.onMissingBean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(value = ConditionClass.class)
public class ConditionOnMissingBeanTest {

	@Bean
	public ConditionClass conditionClass() {
		ConditionClass classInfo = new ConditionClass();
		classInfo.setValue("없음");
		return classInfo;
	}
}
