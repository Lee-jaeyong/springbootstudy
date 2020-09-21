package ljy.book.admin.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import ljy.book.admin.anotation.EnableAutoMyModule;
import ljy.book.config.AConfig;
import ljy.book.config.BConfig;
public class MyConfig implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		AnnotationAttributes attr = AnnotationAttributes
			.fromMap(importingClassMetadata.getAnnotationAttributes(EnableAutoMyModule.class.getName(), false));
		String value = attr.getString("value");
		try{
			ConfigType result = ConfigType.valueOf(value);
			if (result == ConfigType.AConfig) {
				return new String[] { AConfig.class.getName() };
			} else {
				return new String[] { BConfig.class.getName() };
			}
		}catch (IllegalArgumentException e) {
			throw e;
		}
	}

	public enum ConfigType {
		AConfig, BConfig
	}
}
