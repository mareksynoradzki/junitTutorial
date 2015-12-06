package com.synoradzki.JunitTutorial;

import java.util.List;

import com.google.common.collect.Lists;

public class Human {
	public String name;
	public Integer age;
	public Integer height;

	public Integer getAge() {
		return age;
	}

	public Human() {
		super();
	}

	public static List<Human> filterByMinAge(Integer age, Human... humans) {
		if (age == null)
			throw new IllegalArgumentException("Nie podano min wieku");
		List<Human> result = Lists.newArrayList();
		for (Human human : humans) {
			if (age.compareTo(human.age) <= 0) {
				result.add(human);
			}
		}
		return result;
	}

	public static Human selectTheOldest(Human... humans) {
		if (humans.length == 0) {
			throw new IllegalArgumentException("Lista jest pusta");
		}
		Human theOldest = humans[0];
		for (Human iter : humans) {
			if (iter.age != null && iter.age.compareTo(theOldest.age) > 0) {
				theOldest = iter;
			}
		}
		return theOldest;
	}

	public Human(String name, Integer age, Integer height) {
		this();
		this.name = name;
		this.age = age;
		this.height = height;
	}
}
