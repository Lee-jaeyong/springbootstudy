package ljy.book.admin.anotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

public class CustomConfig implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		AnnotationAttributes attr = AnnotationAttributes
			.fromMap(importingClassMetadata.getAnnotationAttributes(EnableCustomConfig.class.getName(), false));
		String value = attr.getString("value");
		if (value.equals("default")) {
			return new String[] {};
		} else {
			return new String[] {};
		}
	}

}
