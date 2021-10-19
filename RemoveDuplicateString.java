package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] split = s.split(" ");
		int i;
		Set<String> stringSet = new LinkedHashSet<String>();
		Set<String> dupSet = new LinkedHashSet<String>();
		for (i = 0; i < split.length; i++) {
			System.out.println(stringSet.add(split[i]));
			if (stringSet.add(split[i]) == true) {
				dupSet.add(split[i]);
			}

			if (dupSet.add(split[i]) == true) {
				stringSet.remove(dupSet);

			}
		}
	
		for (String str : stringSet) {

			System.out.print(str);

		}

	}

}
