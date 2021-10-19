package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 10, 24, 32, 64, 85, 37, 12 };
		int i;
		boolean bduplicates = false;
		Set<Integer> unique = new HashSet<Integer>();
		for (i = 0; i < num.length; i++) {

			if (unique.add(num[i]) == false) {

				System.out.println("Duplicate value present" + num[i]);
				bduplicates = true;
				break;
			}

		}

		if (!bduplicates) {
			System.out.println("Not present");
		}

	}

}
