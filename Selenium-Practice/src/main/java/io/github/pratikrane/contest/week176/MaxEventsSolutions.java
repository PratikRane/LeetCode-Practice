package io.github.pratikrane.contest.week176;

public class MaxEventsSolutions {

	public static void main(String[] args) {
		final int[][] list0 = { { 1, 2 }, { 2, 3 }, { 3, 4 } };
		final int[][] list1 = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 2 } };
		final int[][] list2 = { { 1, 4 }, { 4, 4 }, { 2, 2 }, { 3, 4 }, { 1, 1 } };
		final int[][] list3 = { { 1, 10000 } };
		final int[][] list4 = { { 1, 1 }, { 1, 2 }, { 1, 3 }, { 1, 4 }, { 1, 5 }, { 1, 6 }, { 1, 7 } };
		final int[][] list5 = { { 1, 2 }, { 2, 2 }, { 3, 3 }, { 3, 4 }, { 3, 4 } };
		final MaxEvents max = new MaxEvents();
		System.out.println(max.maxEvents(list0));
		System.out.println(max.maxEvents(list1));
		System.out.println(max.maxEvents(list2));
		System.out.println(max.maxEvents(list3));
		System.out.println(max.maxEvents(list4));
		System.out.println(max.maxEvents(list5));

	}

}
