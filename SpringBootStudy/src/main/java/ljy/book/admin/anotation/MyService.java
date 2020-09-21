package ljy.book.admin.anotation;

public class MyService {

	@MyAnnotation(intValue = 3, strValue = "이재용")
	public void print() {
		System.out.println("test");
	}
}
