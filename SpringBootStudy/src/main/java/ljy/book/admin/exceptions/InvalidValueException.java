package ljy.book.admin.exceptions;

public class InvalidValueException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidValueException(String msg) {
		super(msg);
	}
}
