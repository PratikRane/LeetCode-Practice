package io.github.pratikrane.problems.problem556;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NextGreaterElement3 {

	Solution sol;

	@BeforeClass
	public void beforeClass() {
		sol = new Solution();
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 12, 21 }, new Object[] { 21, -1 }, new Object[] { 218765, 251678 },
				new Object[] { 1234, 1243 }, };
	}

	@Test(dataProvider = "dp")
	public void f(int input, int expectedOutput) {
		Assert.assertEquals(sol.nextGreaterElement(input), expectedOutput);
	}

}
