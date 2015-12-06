package com.synoradzki.JunitTutorial.simpleTest;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

/** dynamiczne ignorowanie testów */
public class Assumption {

	private boolean ignoreTest = true;

	@Before
	public void setUp(){
		//anulowanie wszystkich testów
		Assume.assumeFalse(true);
	}
	
	
	@Test
	public void test_assumption_1() {
		Assume.assumeFalse(ignoreTest);//test zostawienie wykonany jest za³o¿enie jest poprawne
		Assert.assertTrue(false);
	}

	@Test
	public void some_test() {

	}
}
