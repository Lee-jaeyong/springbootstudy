package ljy.book.admin.config;

public class DefaultHelloService implements HelloService {

	@Override
	public void hi() {
		System.out.println("hello in console");
	}

}
