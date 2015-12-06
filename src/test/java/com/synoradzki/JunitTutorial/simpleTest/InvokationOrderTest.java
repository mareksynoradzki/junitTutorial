package com.synoradzki.JunitTutorial.simpleTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
/**definiuje kolejnoœæ wyo³ywania testów */
public class InvokationOrderTest {

	@Test
	public void b() {
		System.out.println("b");
	}

	@Test
	public void a() {
		System.out.println("a");
	}

	@Test
	public void c() {
		System.out.println("c");
	}
}
