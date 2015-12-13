package com.synoradzki.JunitTutorial.theory;

import java.awt.Color;
import java.util.List;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import com.google.common.collect.Lists;
import com.synoradzki.JunitTutorial.Car;

@RunWith(Theories.class)
public class MyTheoryTest {

	@DataPoints
	public static List<Car> cars;

	static {
		cars = Lists.newArrayList(
				new Car("car1", Color.BLUE), 
				new Car("car2",Color.BLUE));
	}

	@Theory
	public void sanity(Car car) {
		System.out.println(car.getName() + "  " + car.getColor());
	}
}
