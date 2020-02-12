package io.github.pratikrane.contest.week175;

import java.util.HashMap;
import java.util.Map;

public class CheckIfDoubleExists {

	public static void main(String[] args) {
		CheckIfDoubleExists check = new CheckIfDoubleExists();
		System.out.println(check.checkIfExist(new int[] { 7, 0, 11 }));

	}

	public boolean checkIfExist(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i] * 2) && map.get(arr[i] * 2) != i)
				return true;
			if (arr[i] % 2 == 0 && map.containsKey(arr[i] / 2) && map.get(arr[i] / 2) != i)
				return true;
			map.put(arr[i], i);
		}
		return false;
	}

}
