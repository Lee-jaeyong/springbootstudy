package ljy.book.admin.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import ljy.book.admin.config.MyConfig;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(MyConfig.class)
public @interface EnableAutoMyModule {
	String value() default "";
}
