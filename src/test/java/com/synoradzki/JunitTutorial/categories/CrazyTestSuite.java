package com.synoradzki.JunitTutorial.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(CrazyTests.class)
@SuiteClasses({ SomeTest.class, OtherTest.class })
@ExcludeCategory(SmartTests.class)
// Note thatCategories is a kind of Suite
public class CrazyTestSuite {
	// Will run SomeTest.b and OtherTest.c, but not SomeTest.a
}
