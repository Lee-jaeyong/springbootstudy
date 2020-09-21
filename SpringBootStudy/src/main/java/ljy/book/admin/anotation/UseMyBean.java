package ljy.book.admin.anotation;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Setter;

@Setter
public class UseMyBean {
	@Autowired
	private MyBean myBean;

	public void printMsg() {
		System.out.println(myBean.getMsg());
	}
}
