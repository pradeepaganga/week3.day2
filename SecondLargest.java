package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> large = Arrays.asList(3, 2, 11, 4, 6, 7);
		Collections.sort(large);

		int i;

		for (i = 0; i < large.size() - 1; i++) {

		}
		System.out.println("Second Largest Number is:"+ large.get(i - 1));

	}
}
