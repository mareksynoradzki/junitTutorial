package com.synoradzki.JunitTutorial.simpleTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasicCalculationTest {

	
	/**
	 * Metoda publiczna statyczna wykonywana tylko jeden raz dla klasy testowej;
	 */
	@BeforeClass
	public static void beforeAllTest(){
		System.out.println("Wywo³ana raz, przed wszystkimi testami");
	}
	
	
	/**
	 * Metoda publiczna statyczna wykonywana tylko jeden raz dla klasy testowej;
	 */
	@AfterClass
	public static void afterAllTest(){
		System.out.println("Wywo³ana raz, po wszystkich testach");
	}
	
	/**
	 * Publiczna metoda wykonywana po ka¿dym teœcie jednostkowym
	 */
	@Before
	public void beforeEveryTest(){
		System.out.println("Wywo³ywana przed ka¿dym testem");
	}
	
	/**
	 * Publiczna metoda wykonywana przez ka¿dym testem jednostkowym
	 */
	@After
	public void afterEveryTest(){
		System.out.println("Wywo³ywana po ka¿dym teœcie");
	}
	
	/**
	 * Test jednostkowy, tylko dla metod publicznych.
	 */
	@Test
	public void should_return_positive_when_sum_two_positive_numbers(){
		System.out.println("Test 1");
	}
	
	@Test
	public void should_return_negative_when_sum_two_negative_numbers(){
		System.out.println("Test 2");
	}
}
