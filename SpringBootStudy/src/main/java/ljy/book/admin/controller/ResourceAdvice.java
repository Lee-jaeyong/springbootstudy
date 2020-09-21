package ljy.book.admin.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

import lombok.AllArgsConstructor;

@ControllerAdvice
@AllArgsConstructor
public class ResourceAdvice {
	private final ResourceUrlProvider provider;

	@ModelAttribute("versionResourceResolver")
	public ResourceUrlProvider resourceUrlProvider() {
		return this.provider;
	}
}
