package com.synoradzki.JunitTutorial.rule;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorTest {
	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	@Ignore
	public void fails_after_execution() {
		collector.checkThat("a", equalTo("b"));
		collector.checkThat(1, equalTo(1));
		collector.checkThat("ae", equalTo("g"));
	}
}
