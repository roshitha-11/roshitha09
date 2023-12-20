package roshi.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/login")
	public String sayHello()
	{
		return "login";
	}
	@RequestMapping("/register")
	public String sayHi()
	{
		return "register";
	}

}
