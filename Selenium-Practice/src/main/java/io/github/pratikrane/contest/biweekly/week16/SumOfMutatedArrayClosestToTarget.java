package io.github.pratikrane.contest.biweekly.week16;

import java.util.Arrays;

//Given an integer array arr and a target value target, return the integer value such that when we change all the integers larger than value in the given array to be equal to value, the sum of the array gets as close as possible (in absolute difference) to target.
//In case of a tie, return the minimum such integer.
//Notice that the answer is not neccesarilly a number from arr.

//Example 1:
//Input: arr = [4,9,3], target = 10
//Output: 3
//Explanation: When using 3 arr converts to [3, 3, 3] which sums 9 and that's the optimal answer.

//Example 2:
//Input: arr = [2,3,5], target = 10
//Output: 5

//Example 3:
//Input: arr = [60864,25176,27249,21296,20204], target = 56803
//Output: 11361

//Constraints:
//1 <= arr.length <= 10^4
//1 <= arr[i], target <= 10^5

public class SumOfMutatedArrayClosestToTarget {

	public static void main(String[] args) {
		SumOfMutatedArrayClosestToTarget solution = new SumOfMutatedArrayClosestToTarget();
		int[] input1 = { 4, 9, 3 }, input2 = { 2, 3, 5 }, input3 = { 60864, 25176, 27249, 21296, 20204 };
		int target1 = 10, target2 = 10, target3 = 56803;
		System.out.println(solution.findBestValue(input1, target1));
		System.out.println(solution.findBestValue(input2, target2));
		System.out.println(solution.findBestValue(input3, target3));
	}

	public int findBestValue1(int[] arr, int target) {
		int bestValue = target / arr.length;
		Arrays.parallelSort(arr);
		int sum = 0, index = 0;
		for (; index < arr.length && arr[index] < bestValue; index++)
			sum += arr[index];
		bestValue = (target - sum) / (arr.length - index);
		if (Math.abs(target - sum - (bestValue * (arr.length - index))) <= Math
				.abs(target - sum - ((bestValue + 1) * (arr.length - index))))
			return bestValue;
		else
			return bestValue + 1;
	}

	public int findBestValue(int[] arr, int target) {
		Arrays.parallelSort(arr);
		int bestValue = target / arr.length;
		int[] sums = new int[arr.length];
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum += arr[index];
			sums[index] = sum;
		}

		for (int number : sums)
			System.out.print(" " + number);
		System.out.println();
		if (sums[sums.length - 1] == target)
			return arr[arr.length - 1];
		return bestValue;
	}

}
