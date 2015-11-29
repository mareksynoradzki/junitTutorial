package com.synoradzki.JunitTutorial;

import org.junit.Test;

public class ExceptionHanderTest {

	@Test(expected = RuntimeException.class)
	public void should_expect_runtimeException() {
		throw new RuntimeException();
	}
}
