package com.synoradzki.JunitTutorial.mockito;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.synoradzki.JunitTutorial.stock.MarketWatcher;

public class MockitoWhenThen {

	@Mock
	MarketWatcher marketWatcher;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() {
	}

	@Test
	public void test_when_anyThing_then_Whatever() {
		// given
		Mockito.when(marketWatcher.getQuote(Mockito.anyString())).thenReturn(
				"Whatever");

		// when
		String actual = marketWatcher.getQuote("Cokolwiek");

		// then
		Assert.assertThat(actual, Matchers.is("Whatever"));

	}

	@Test
	public void test_when_input_then_call_real_method() {
		// given
		Mockito.when(marketWatcher.getQuote(Mockito.anyString()))
				.thenCallRealMethod();

		// when
		String actual = marketWatcher.getQuote("Cokolwiek");

		// then
		Assert.assertThat(actual, Matchers.is("Cokolwiek TEST"));
	}

	@Test(expected = RuntimeException.class)
	public void test_when_call_then_throw() {
		// given
		Mockito.when(marketWatcher.getQuote("STH")).thenThrow(
				new IllegalArgumentException());

		// when
		marketWatcher.getQuote("STH");
	}

}
