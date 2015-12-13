package com.synoradzki.JunitTutorial.mockito;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.synoradzki.JunitTutorial.stock.MarketWatcher;
import com.synoradzki.JunitTutorial.stock.Portfolio;

@RunWith(MockitoJUnitRunner.class)
public class StockBrokerRunnerTest {
	@Mock
	MarketWatcher marketWatcher;
	@Mock
	Portfolio portfolio;

	@Test
	public void sanity() throws Exception {
		assertNotNull(marketWatcher);
		assertNotNull(portfolio);
	}
}
