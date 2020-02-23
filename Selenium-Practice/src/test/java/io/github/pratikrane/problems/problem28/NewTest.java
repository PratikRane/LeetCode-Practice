package io.github.pratikrane.problems.problem28;

import org.testng.Assert;
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
		return new Object[][] { new Object[] { "hello", "llo", 2 }, new Object[] { "aaaaa", "bba", -1 }, };
	}

	@Test(dataProvider = "dp")
	public void f(String haystack, String needle, Integer position) {
		Assert.assertEquals(sol.strStr(haystack, needle), position.intValue());
	}

}
