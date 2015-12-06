package com.synoradzki.JunitTutorial.simpleTest;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.startsWith;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.synoradzki.JunitTutorial.Human;

/** zawiera testy wykorzystujace methody z CoreMatcher */
public class CoreMatcherTest {

	@Test
	public void should_test_all_of_test_1() {
		Assert.assertThat("myValue",
				allOf(startsWith("my"), containsString("Val")));
	}

	@Test
	public void should_test_all_of_test_2() {
		Matcher<String> matcher1 = startsWith("my");
		Matcher<String> matcher2 = containsString("Val");
		Assert.assertThat("myValue", allOf(matcher1, matcher2));
	}

}
