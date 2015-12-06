package com.synoradzki.JunitTutorial.simpleTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;

/**definiuje zestaw testów do uruchomienia*/
@RunWith(Suite.class)
@SuiteClasses(value = { AssertExample.class, BasicCalculationTest.class, ExceptionHanderTest.class })
public class SuiteTest {

}
