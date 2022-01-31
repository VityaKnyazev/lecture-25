package by.itacademy.javaenterprise.knyazev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	@GetMapping("/index")
	public String getMainPage() {
		return "main";
	}
	
	@GetMapping("/error")
	public String getErrorPage() {
		return "error";
	}
}
