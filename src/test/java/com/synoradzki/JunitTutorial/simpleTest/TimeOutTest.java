package com.synoradzki.JunitTutorial.simpleTest;

import org.junit.Ignore;
import org.junit.Test;

public class TimeOutTest {
	
	@Test(timeout = 10)
	@Ignore
	public void forEver() throws Exception {
		Thread.sleep(100000);
	}
}
