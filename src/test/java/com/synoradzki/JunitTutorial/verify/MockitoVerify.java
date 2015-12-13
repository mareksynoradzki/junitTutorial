package com.synoradzki.JunitTutorial.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.synoradzki.JunitTutorial.MockitoEntity.Car;
import com.synoradzki.JunitTutorial.MockitoEntity.CarDaoImpl;
import com.synoradzki.JunitTutorial.MockitoEntity.Color;
import com.synoradzki.JunitTutorial.MockitoEntity.UserDaoImpl;

public class MockitoVerify {
	@Mock
	private UserDaoImpl userDao;
	@Mock
	private CarDaoImpl carDao;

	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void should_verify_when_no_call() {
		Mockito.verify(carDao, Mockito.never()).save(Matchers.any(Car.class));
	}
	
	@Test
	public void should_verify_when_no_interaction() {
		Mockito.verifyZeroInteractions(carDao);
	}
	
	@Test
	public void should_verify_when_save_2_car_with_name_starts_with_p_letter() {
		Car pegeout = new Car("pegeout", Color.BLACK);
		Car fiat = new Car("fiat", Color.BLACK);
		Car porsche = new Car("porsche", Color.RED);
		carDao.save(pegeout);
		carDao.save(fiat);
		carDao.save(porsche);
		Mockito.verify(carDao, Mockito.times(2)).save(Matchers.<Car>argThat(org.hamcrest.Matchers.<Car>hasProperty("model",org.hamcrest.Matchers.startsWith("p"))));
	}
}
