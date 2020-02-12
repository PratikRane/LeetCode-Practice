package io.github.pratikrane.contest.warmup;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("loveleetcode"));
		System.out.println(firstUniqChar("cc"));
	}

	public static int firstUniqChar(String s) {
		for (int index = 0; index < s.length(); index++) {
			char ch = s.charAt(index);
			System.out.println("Index: " + index + " :: Char: " + ch + " :: return value: " + s.indexOf(ch, index + 1));
			if (s.indexOf(ch, index + 1) == -1 && s.lastIndexOf(ch, index - 1) == -1)
				return index;
		}
		return -1;
	}
}
