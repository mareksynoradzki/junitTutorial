package com.synoradzki.JunitTutorial.mockito;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.synoradzki.JunitTutorial.stock.MarketWatcher;
import com.synoradzki.JunitTutorial.stock.Portfolio;

public class StockBrokerTest {
	@Mock
	MarketWatcher marketWatcher;
	@Mock
	Portfolio portfolio;

	@Before
	public void setUp() {
		//zamiast annotacji @RunWith(MockitoJUnitRunner.class)
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void sanity() throws Exception {
		assertNotNull(marketWatcher);
		assertNotNull(portfolio);
	}
}
