package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> dup = Arrays.asList(14, 12, 12,13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20,20);
	

		for (int i = 0; i < dup.size(); i++) {
			for (int j = i + 1; j < dup.size(); j++) {
				if (dup.get(i) == dup.get(j)) {
					System.out.println(dup.get(i));
				}
			}
		}

	}

}
