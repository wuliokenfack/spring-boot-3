package com.example.springBootWithKeycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HelloController {

	@GetMapping(value = "/")
	public void index(HttpServletResponse response) throws IOException {
		response.sendRedirect("/welcome");
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Greetings from Spring Boot!";
	}

}

