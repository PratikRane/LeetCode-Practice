package io.github.pratikrane.contest.biweekly.week16;
//1299. Replace Elements with Greatest Element on Right Side

//Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
//After doing so, return the array.
//Example 1:
//Input: arr = [17,18,5,4,6,1]
//Output: [18,6,6,6,1,-1]

//Constraints:
//1 <= arr.length <= 10^4
//1 <= arr[i] <= 10^5

public class GreatestElementOnRightSide {

	public static void main(String[] args) {
		int[] input = { 17, 18, 25, 4, 6, 1, 5 };
		GreatestElementOnRightSide solution = new GreatestElementOnRightSide();
		for (int i : solution.replaceElements(input)) {
			System.out.print(" " + i);
		}
	}

	public int[] replaceElements(int[] arr) {
		int greatestYet = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			int buffer = arr[i];
			arr[i] = greatestYet;
			if (buffer > greatestYet)
				greatestYet = buffer;
		}
		arr[arr.length - 1] = -1;
		return arr;
	}
}
