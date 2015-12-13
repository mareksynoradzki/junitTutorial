package com.synoradzki.JunitTutorial.argumentCaptor;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.synoradzki.JunitTutorial.MockitoEntity.User;
import com.synoradzki.JunitTutorial.MockitoEntity.UserDaoImpl;

/**
 * jak uzywaæ static import
 * http://stackoverflow.com/questions/288861/eclipse-optimize
 * -imports-to-include-static-imports
 */
public class MockitoArgumentCaptor {

	@Mock
	UserDaoImpl userDao;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		ArgumentCaptor<User> userCaptor = ArgumentCaptor.forClass(User.class);
		userDao.save(new User("marek", "synoradzki", 20));

		
		verify(userDao, times(1)).save(userCaptor.capture());
		assertThat(userCaptor.getValue(),is(hasProperty("firstName", is("marek"))));
		assertThat(userCaptor.getValue(), is(hasProperty("surnName", is("synoradzki"))));
	}
}
