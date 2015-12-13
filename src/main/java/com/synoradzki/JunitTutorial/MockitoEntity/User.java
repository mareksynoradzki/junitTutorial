package com.synoradzki.JunitTutorial.MockitoEntity;

public class User extends BaseEntity {

	private String firstName;

	private String surnName;

	private Integer age;

	public User() {
		super();
	}

	public User(String firstName, String surname, Integer age) {
		this.firstName = firstName;
		this.surnName = surname;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSurnName() {
		return surnName;
	}

	public Integer getAge() {
		return age;
	}

}
