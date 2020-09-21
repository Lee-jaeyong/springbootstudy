package ljy.book.admin.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import ljy.book.admin.domain.ApiErrorDeteil;

@Component
public class ErrorCreator {
	public ResponseEntity<ApiErrorDeteil> get(String msg, int code, HttpStatus status) {
		return ResponseEntity.status(status).body(newInstance(msg, code));
	}

	private ApiErrorDeteil newInstance(String message, int code) {
		ApiErrorDeteil deteil = new ApiErrorDeteil();
		deteil.setTimeStamp(new Date());
		deteil.setMsg(message);
		deteil.setCode(code);
		return deteil;
	}
}
