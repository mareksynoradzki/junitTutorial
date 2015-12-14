package com.synoradzki.JunitTutorial.rule;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Verifier;

public class VerifierRuleTest {
	private String errorMsg = null;

	/**Test rule jest wykonywany po ka¿dym tescie*/
	@Rule
	public TestRule rule = new Verifier() {
		protected void verify() {
			Assert.assertThat(
					"ErrorMsg should be null after each test execution",
					errorMsg, Matchers.nullValue());
		}
	};

	@Test
	@Ignore
	public void testName() throws Exception {
		errorMsg = "Giving a value";
	}
}
