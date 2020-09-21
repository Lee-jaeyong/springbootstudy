package ljy.book.admin.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectMyService {

	@Pointcut("execution(* ljy.book.admin.anotation.MyService.*(..))")
	public void point() {}
	
	@Before("point()")
	public void init() {
		System.out.println("log");
	}
}
