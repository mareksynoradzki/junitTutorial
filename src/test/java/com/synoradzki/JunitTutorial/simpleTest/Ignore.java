package com.synoradzki.JunitTutorial.simpleTest;

import org.junit.Test;

public class Ignore {

	@Test
	@org.junit.Ignore(value="Komentarz, ten kod jest chwilowo zakomentowany bo....")
	public void ignoreTest(){
		
	}
}
