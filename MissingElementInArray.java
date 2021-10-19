package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {
	public static void main(String[] args) {
		
		List<Integer> large = Arrays.asList(1,2,3,4,7,6,8);
		Collections.sort(large);
	
		int i;
		
		for(i=0;i<large.size();i++)
		{
			if(i+1!=large.get(i))
			{
				int temp=i+1;
				System.out.println("The missing number in the array is = " +temp);
				break;
			}
			
			}
		
	
		
			
		
		
	}

}
