package com.synoradzki.JunitTutorial.simpleTest;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class AssertExample {

	@Test
	public void should_test_assert_true_methods(){
		Assert.assertTrue(true);
		Assert.assertTrue("assert true message", true);
	}
	
	@Test
	public void should_test_assert_false_methods(){
		Assert.assertFalse(false);
		Assert.assertFalse("assert false message", false);
	}
	@Test
	public void should_test_assert_null(){
		Integer i = null;
		Assert.assertNull(i);
	}
	
	@Test
	public void should_test_assert_not_null(){
		Integer i = 12;
		Assert.assertNotNull(i);
	}
	@Test
	public void should_test_assert_equals(){
		BigDecimal actual = BigDecimal.valueOf(12);
		BigDecimal expected = BigDecimal.valueOf(12);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void should_test_assert_same(){
		BigDecimal actual = BigDecimal.valueOf(12);
		BigDecimal expected = actual;
		Assert.assertSame(expected, actual);
	}
	
	@Test
	public void should_test_assert_not_same(){
		BigDecimal actual = BigDecimal.valueOf(12);
		BigDecimal expected = BigDecimal.valueOf(18);
		Assert.assertNotSame(expected, actual);
	}
}
