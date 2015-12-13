package com.synoradzki.JunitTutorial.answer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import com.synoradzki.JunitTutorial.MockitoEntity.BaseEntity;
import com.synoradzki.JunitTutorial.MockitoEntity.Car;
import com.synoradzki.JunitTutorial.MockitoEntity.CarDaoImpl;
import com.synoradzki.JunitTutorial.MockitoEntity.Color;
import com.synoradzki.JunitTutorial.MockitoEntity.UserDaoImpl;

@RunWith(MockitoJUnitRunner.class)
public class MockitoAnswer {

	@Mock
	private UserDaoImpl userDao;
	@Mock
	private CarDaoImpl carDao;

	@Test
	public void should_set_entity_id_when_save_on_dao() {
		// given
		Car car1 = new Car("porsche", Color.RED);
		Car car2 = new Car("fiat", Color.WHITE);

		// when
//		Mockito.doAnswer(incrementId()).when(carDao)
//				.save(Matchers.any(Car.class));
//		
		Mockito.when(carDao.save(Matchers.any(Car.class))).then(MockitoAnswer.<Car>incrementId());

		carDao.save(car1);
		carDao.save(car2);

		System.out.println(car1.getId() + " car1");
		System.out.println(car2.getId() + " car2");

	}

	private static <T extends BaseEntity> Answer incrementId() {
		return new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) throws Throwable {
				T entity = (T) invocation.getArguments()[0];
				Long nextId = Incrementator.getInstance().increment();
				entity.setId(nextId);
				return null;
			}
		};
	}
}
