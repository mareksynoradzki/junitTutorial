package com.synoradzki.JunitTutorial.spy;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.synoradzki.JunitTutorial.MockitoEntity.Car;
import com.synoradzki.JunitTutorial.MockitoEntity.Color;

public class MockitoSpy {
	
	Car car1;
	
	@Before
	public void setUp(){
		car1 = new Car("pegeut", Color.BLACK);
	}
	
	@Test
	public void test1(){
		Car car1Spy = Mockito.spy(car1);
		car1Spy.getModel();
		Mockito.verify(car1Spy, Mockito.times(1)).getModel();
		
	}
	
	
}
