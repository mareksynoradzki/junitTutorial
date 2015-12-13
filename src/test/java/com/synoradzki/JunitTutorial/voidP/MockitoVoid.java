package com.synoradzki.JunitTutorial.voidP;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.synoradzki.JunitTutorial.MockitoEntity.User;
import com.synoradzki.JunitTutorial.MockitoEntity.UserDaoImpl;

public class MockitoVoid {

	@Mock
	UserDaoImpl userDao;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test(expected=RuntimeException.class)
	public void should_throw_exception_when_invoke_void_method(){
		Mockito.doThrow(new RuntimeException()).when(userDao).save(Mockito.any(User.class));
		userDao.save(new User("marek", "Synoradki", 20));
	}
	
	@Test
	public void should_call_real_void_method(){
		org.mockito.Mockito.doCallRealMethod().when(userDao).sysout(Mockito.anyString());
		userDao.sysout("chillout");
	}
}
