package ljy.book.admin.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "myapp")
@Getter
@Setter
public class MyProperties {
	private String serverIp;
	private String name;
	private String description;
}
