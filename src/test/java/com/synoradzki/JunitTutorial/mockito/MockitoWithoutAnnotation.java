package com.synoradzki.JunitTutorial.mockito;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.synoradzki.JunitTutorial.stock.MarketWatcher;

public class MockitoWithoutAnnotation {

	MarketWatcher marketWatcher;
	
	@Before
	public void setUp(){
		marketWatcher = Mockito.mock(MarketWatcher.class);
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
}
