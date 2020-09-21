package ljy.book.admin.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import ljy.book.admin.domain.ApiErrorDeteil;
import lombok.AllArgsConstructor;

@ControllerAdvice
@AllArgsConstructor
public class ExceptionHandlerContoller {

	private final ErrorCreator errorCreator;

	@ExceptionHandler(InvalidValueException.class)
	public ResponseEntity<ApiErrorDeteil> errors(InvalidValueException e) {
		return errorCreator.get(e.getMessage(), 400, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<ApiErrorDeteil> errors() {
		return errorCreator.get("잠시 문제가 발생했습니다.", 400, HttpStatus.BAD_REQUEST);
	}

}
