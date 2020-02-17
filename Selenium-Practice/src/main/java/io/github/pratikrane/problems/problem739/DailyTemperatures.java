package io.github.pratikrane.problems.problem739;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DailyTemperatures {

	Solution sol;

	@Test
	public void runTest() {
		Assert.assertEquals(sol.dailyTemperatures(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 }),
				new int[] { 1, 1, 4, 2, 1, 1, 0, 0 });
	}

	@BeforeClass
	public void setup() {
		sol = new Solution();
	}
}
