package com.prasant.RandomJokes.Services;

import java.util.Arrays;
import java.util.List;

public class JokesService {
	private List<String> jokes =  Arrays.asList(new String[] {
		"What did the man say to his fingers? I’m counting on you.",
		"How does the ocean say hello? It waves.",
		"Humpty Dumpty had a great fall. Summer wasn’t bad either.",
		"How do pigs do their homework? With a pigpen.",
		"How do you hire a horse? Put it on a ladder."
	});

	public String getJoke() {

		int randNum = (int) (Math.random() * (jokes.size() - 1));

		return jokes.get(randNum);
	}
	
	public void addJoke(String joke) {

		jokes.add(joke);
	}
}
