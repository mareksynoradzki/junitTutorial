package com.synoradzki.JunitTutorial.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutRule {

	@Rule
	public Timeout globalTimeout = new Timeout(20);

	@Test
	public void testInfiniteLoop1() throws InterruptedException {
		Thread.sleep(30);
	}

	@Test
	public void testInfiniteLoop2() throws InterruptedException {
		Thread.sleep(30);
	}

	@Test
	public void testInfiniteLoop3() throws InterruptedException {
		Thread.sleep(30);
	}
}
