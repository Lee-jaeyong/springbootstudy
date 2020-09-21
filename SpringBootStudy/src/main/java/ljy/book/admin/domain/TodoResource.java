package ljy.book.admin.domain;

import org.springframework.hateoas.EntityModel;

import lombok.Getter;

@Getter
public class TodoResource extends EntityModel<Todo> {

	private final Todo todo;

	public TodoResource(Todo todo) {
		this.todo = todo;
	}
}
