package io.github.pratikrane.contest.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LexicographicalNumbers {

	public static void main(String[] args) {
		System.out.println(lexicalOrder(3000));
		List<Integer> list = new ArrayList<Integer>();
		LexicographicalNumbers lex = new LexicographicalNumbers();
		lex.lexicalOrderRecursion(list, 1, 9, 3000);
		System.out.println(list);
	}

	public static List<Integer> lexicalOrder(int n) {
		return IntStream.range(1, n + 1).parallel().mapToObj(Integer::toString).sorted().map(Integer::valueOf)
				.collect(Collectors.toList());
	}

	public void lexicalOrderRecursion(List<Integer> input, int startNumber, int endNumber, int limit) {
		for (int number = startNumber; number <= endNumber && number <= limit; number++) {
			input.add(number);
			this.lexicalOrderRecursion(input, number * 10, number * 10 + 9, limit);
		}
	}

}
