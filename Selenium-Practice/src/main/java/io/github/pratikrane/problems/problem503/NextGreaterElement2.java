package io.github.pratikrane.problems.problem503;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*503. Next Greater Element II
Given a circular array (the next element of the last element is the first element of the array),
print the Next Greater Number for every element.
The Next Greater Number of a number x is the first greater number to its traversing-order next in the array,
which means you could search circularly to find its next greater number. If it doesn't exist, output -1 for this number.

Example 1:
Input: [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2;
The number 2 can't find next greater number;
The second 1's next greater number needs to search circularly, which is also 2.
Note: The length of given array won't exceed 10000.
*/

public class NextGreaterElement2 {

	Solution sol;

	@BeforeClass
	public void beforeClass() {
		sol = new Solution();
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { { new int[] { 1, 2, 1 }, new int[] { 2, -1, 2 } },
				{ new int[] { 1, 2, 3, 4, 3 }, new int[] { 2, 3, 4, -1, 4 } } };
	}

	@Test(dataProvider = "dp")
	public void solutionTest(int[] input, int[] expected) {
		Assert.assertEquals(sol.nextGreaterElements(input), expected);
	}

}
