package ljy.book.admin.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContoller {

	@GetMapping("/")
	public String hello(Model model) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "이재용");
		map.put("age", 26);
		model.addAttribute("message", "hello world");
		model.addAttribute("obj", map);
		return "th";
	}

}
