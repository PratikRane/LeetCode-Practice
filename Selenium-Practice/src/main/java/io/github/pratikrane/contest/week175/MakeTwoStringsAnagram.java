package io.github.pratikrane.contest.week175;

import java.util.HashMap;
import java.util.Map;

public class MakeTwoStringsAnagram {

	public static void main(String[] args) {
		MakeTwoStringsAnagram anagram = new MakeTwoStringsAnagram();
		System.out.println(anagram.minSteps("anagram", "mangaar"));
		System.out.println(anagram.minSteps("leetcode", "practice"));
		System.out.println(anagram.minSteps("friend", "family"));
		System.out.println(anagram.minSteps("bab", "aba"));

	}

	public int minSteps1(String s, String t) {
		for (char ch : s.toCharArray()) {
			t = t.replaceFirst("" + ch, "");
		}
		return t.length();
	}

	public int minSteps(String s, String t) {
		Map<Character, Integer> freq = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char sCh = s.charAt(i), tCh = t.charAt(i);
			freq.put(sCh, freq.getOrDefault(sCh, 0) + 1);
			freq.put(tCh, freq.getOrDefault(tCh, 0) - 1);
		}
		int sum = 0;
		for (char ch : freq.keySet()) {
			sum += freq.get(ch);
		}
		return sum / 2;
	}
}
