package com.synoradzki.JunitTutorial.MockitoEntity;

public class Car extends BaseEntity {

	private String model;

	private Color color;

	public Car() {

	}

	public Car(String model, Color color) {
		this.color = color;
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
