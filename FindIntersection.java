package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1[]= {3,2,11,4,6,7};
		int num2[]= {1,2,8,4,9,7,3};
		int i,j;
		
		
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> set2=new HashSet<Integer>();
		for(i=0;i<num1.length;i++)
		{
			set1.add(num1[i]);
			
		}
		for(j=0;j<num2.length;j++)
		{
			set2.add(num2[j]);
			
		}
		 boolean retainAll = set1.retainAll(set2);
			System.out.println("Intersection of two arrays is"+ set1);
		
	}

}
