package com.synoradzki.JunitTutorial.answer;

public class Incrementator {
	private Long increment = 0l;

	private Incrementator() {
	};

	private static Incrementator instance;

	public static Incrementator getInstance() {
		if (instance == null) {
			instance = new Incrementator();
		}
		return instance;
	}

	public Long increment() {
		this.increment++;
		return this.increment;
	}

	public void reset() {
		this.increment = 0L;
	}

}
