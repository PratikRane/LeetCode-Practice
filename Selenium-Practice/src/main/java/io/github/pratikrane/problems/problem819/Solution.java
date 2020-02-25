package io.github.pratikrane.problems.problem819;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {

	public String mostCommonWord(String paragraph, String[] banned) {
		final String[] words = paragraph.toLowerCase().split("[^\\w]+");
		final Set<String> bannedWords = Set.of(banned);
		final Map<String, Integer> map = new HashMap<>();
		String ans = null;
		int maxCount = 0;
		for (final String word : words) {
			if (!bannedWords.contains(word)) {
				if (!map.containsKey(word)) {
					map.put(word, 0);
				}
				map.put(word, map.get(word) + 1);
				if (map.get(word) > maxCount) {
					ans = word;
					maxCount = map.get(word);
				}
			}
		}
		return ans;
	}
}
