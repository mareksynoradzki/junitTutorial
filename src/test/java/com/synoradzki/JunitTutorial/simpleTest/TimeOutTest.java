package com.synoradzki.JunitTutorial.simpleTest;

import org.junit.Test;

public class TimeOutTest {
	@Test(timeout = 10)
	public void forEver() throws Exception {
		Thread.sleep(100000);
	}
}
