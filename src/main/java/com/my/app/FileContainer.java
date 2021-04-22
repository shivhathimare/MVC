package com.my.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FileContainer {
	
	@GetMapping("/show")
	public String show() {
		return "file";
	}
}
