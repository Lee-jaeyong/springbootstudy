package ljy.book.admin.conditional;

public interface MsgBean {
	default void printMsg() {
		System.out.println("My Bean default is running");
	}
}
