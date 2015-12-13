package com.synoradzki.JunitTutorial.invocationOrder;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.synoradzki.JunitTutorial.MockitoEntity.User;
import com.synoradzki.JunitTutorial.MockitoEntity.UserDaoImpl;

@RunWith(MockitoJUnitRunner.class)
public class MockitoInorder {
	
	@Mock
	public UserDaoImpl userDao;
	
	@Test
	public void test(){
		userDao.save(new User("Marek", "Synoradzki", 20));
		userDao.save(new User("Tomasz", "Kowalski", 20));
		
		InOrder inOrder = Mockito.inOrder(userDao);
		inOrder.verify(userDao).save(Mockito.<User>argThat(Matchers.<User>hasProperty("firstName", Matchers.is(Matchers.startsWith("Ma")))));
		inOrder.verify(userDao).save(Mockito.<User>argThat(Matchers.<User>hasProperty("firstName", Matchers.is(Matchers.startsWith("To")))));
		
		
		
		
	}

}
