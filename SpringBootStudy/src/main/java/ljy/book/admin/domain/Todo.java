package ljy.book.admin.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Todo implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;

	@NotNull(message = "이름을 입력해주세요.")
	private String title;
}
