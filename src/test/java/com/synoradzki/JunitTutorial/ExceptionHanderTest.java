package com.synoradzki.JunitTutorial;

import org.junit.Ignore;
import org.junit.Test;

public class ExceptionHanderTest {

	@Test(expected = RuntimeException.class)
	@Ignore(value="Poniewa� modu� robienia si� zmieni�. ")
	public void should_expect_runtimeException() {
		throw new RuntimeException();
	}
}
