package com.synoradzki.JunitTutorial;

import java.awt.Color;

public class Car {
	private String name;
	private Color color;

	public Car(String name, Color color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

}
