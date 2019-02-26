package com.example.springDemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	private String message="ganga";
	
	private List<String> tasks  = Arrays.asList("a","b","c","d","e");
	
	@GetMapping("/")
	public String main(Model model) {
		
		model.addAttribute("message", message);
		model.addAttribute("tasks", tasks );

		return "wellcome";
	}
	
	public String mainWithParam(@RequestParam(name="name")String name,Model model) {
		model.addAttribute("message", name);
		
		return "wellcome"; 
	}

}
