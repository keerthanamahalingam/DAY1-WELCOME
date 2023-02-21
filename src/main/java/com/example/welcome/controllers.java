package com.example.welcome;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controllers{
	@GetMapping("/") 
	public String Controllers(){ 
		return "Welcome String Boot!";
	}
}