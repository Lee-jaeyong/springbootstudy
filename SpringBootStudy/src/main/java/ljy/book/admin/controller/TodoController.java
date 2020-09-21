package ljy.book.admin.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ljy.book.admin.domain.Todo;
import ljy.book.admin.domain.TodoResource;
import ljy.book.admin.exceptions.InvalidValueException;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("todo")
public class TodoController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/{title}")
	public ResponseEntity<?> todo(@PathVariable String title) {
		TodoResource result = new TodoResource(new Todo(counter.incrementAndGet(), title));
		result.add(linkTo(methodOn(this.getClass()).todo(title)).withSelfRel());
		return ResponseEntity.ok(result);
	}

	@PostMapping("/")
	public ResponseEntity<?> save(@Validated @RequestBody Todo todo, @ApiIgnore Errors error) {
		if (error.hasErrors()) {
			throw new InvalidValueException(error.getAllErrors().get(0).getDefaultMessage());
		}
		todo.setId(counter.incrementAndGet());
		TodoResource result = new TodoResource(todo);
		result.add(linkTo(this.getClass()).withSelfRel());
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}
}
