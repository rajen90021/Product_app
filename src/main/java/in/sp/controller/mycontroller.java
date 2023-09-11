package in.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mycontroller {

	@RequestMapping("/home")
	public String openhomepage() {
		return "home";
	}
}
