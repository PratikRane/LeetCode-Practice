package io.github.pratikrane.problems.problem20;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	Solution sol;

	@BeforeClass
	public void beforeClass() {
		sol = new Solution();
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "(])", false }, new Object[] { "()", true },
				new Object[] { "()[]{}", true }, new Object[] { "(]", false }, new Object[] { "([)]", false },
				new Object[] { "{[]}", true }, new Object[] { "}", false }, };
	}

	@Test(dataProvider = "dp")
	public void f(String s, Boolean valid) {
		assertEquals(sol.isValid(s), valid.booleanValue());
	}

}
