package io.github.pratikrane.problems.problem13;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {

	Solution solution;

	@BeforeClass
	public void beforeClass() {
		solution = new Solution();
	}

	@DataProvider
	public Object[][] dataProvider() {
		return new Object[][] { new Object[] { "III", 3 }, new Object[] { "IV", 4 }, new Object[] { "IX", 9 },
				new Object[] { "LVIII", 58 }, new Object[] { "MCMXCIV", 1994 } };
	}

	@Test(dataProvider = "dataProvider")
	public void f(String s, int n) {
		Assert.assertEquals(solution.romanToInt(s), n);
	}

}
