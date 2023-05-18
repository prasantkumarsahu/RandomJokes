package com.prasant.RandomJokes.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prasant.RandomJokes.Services.JokesService;

@RestController
public class JokesController {
	JokesService jokesService = new JokesService();
	
	@GetMapping(value = "/joke")
	public String jokes() {
		
		return jokesService.getJoke();
	}
	
	@PostMapping(value = "/joke")
	public String addJoke(@RequestBody String joke) {
		
		jokesService.addJoke(joke);		
		
		return "Joke saved.";
	}
}
