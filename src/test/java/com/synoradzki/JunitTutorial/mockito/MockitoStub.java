package com.synoradzki.JunitTutorial.mockito;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.synoradzki.JunitTutorial.stock.MarketWatcher;
import com.synoradzki.JunitTutorial.stock.Portfolio;

public class MockitoStub {
	@Mock
	MarketWatcher marketWatcher;
	@Mock
	Portfolio portfolio;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void should_invoke_real_method() {
		// given
		Mockito.when(marketWatcher.getQuote(Mockito.anyString()))
				.thenCallRealMethod();

		// when
		String actual = marketWatcher.getQuote("jeden");

		// then
		Assert.assertThat(actual, Matchers.is("jeden TEST"));
	}

	@Test
	public void should_return_different_values_when_every_invoke() {
		// given
		Mockito.when(marketWatcher.getQuote(Mockito.anyString())).thenReturn(
				"pierwsze wywo³anie", "drugie wywo³anie", "trzecie wywo³anie");

		// when
		String actual1 = marketWatcher.getQuote("jeden");
		String actual2 = marketWatcher.getQuote("dwa");
		String actual3 = marketWatcher.getQuote("trzy");

		Mockito.verify(marketWatcher).getQuote("dwa");
		// then
		Assert.assertThat(actual1, Matchers.is("pierwsze wywo³anie"));
		Assert.assertThat(actual2, Matchers.is("drugie wywo³anie"));
		Assert.assertThat(actual3, Matchers.is("trzecie wywo³anie"));
	}
	
	@Test(expected=RuntimeException.class)
	public void should_return_different_values_when_every_invoke2() {
		// given
		Mockito.when(marketWatcher.getQuote(Mockito.anyString())).thenThrow(new RuntimeException());
		marketWatcher.getQuote("dupa");
		Mockito.verify(marketWatcher, Mockito.atLeastOnce());
		Mockito.verifyZeroInteractions(portfolio);
		
	}
	@Test
	public void should_invoke_method_twice_with_input_starts_with_test(){
		Mockito.when(marketWatcher.getQuote(Mockito.anyString())).thenReturn("lalala");
		marketWatcher.getQuote("dupa");
		Mockito.verify(marketWatcher, Mockito.times(1)).getQuote(Mockito.anyString());
		Mockito.verify(marketWatcher, Mockito.times(1)).getQuote(Mockito.eq("dupa"));
//		Mockito.verify(marketWatcher.getQuote(Mockito.argThat(Matchers.startsWith("test"))), Mockito.times(2));
	}
	
	@Test
	public void should_return_absolute_value(){
		
//		Mockito.when(marketWatcher.getQuote(Matchers.greaterThan(0))).th
		
	}


}
