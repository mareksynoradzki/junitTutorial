package com.synoradzki.JunitTutorial;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

/** dynamiczne ignorowanie testów */
public class Assumption {

	private boolean ignoreTest = true;

	@Test
	public void test_assumption_1() {
		Assume.assumeFalse(ignoreTest);//test zostawienie wykonany jest za³o¿enie jest poprawne
		Assert.assertTrue(false);
	}

	@Test
	public void some_test() {

	}
}
