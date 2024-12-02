package dsa.practiseprograms;

import java.util.*;

public class ArrayFirstMissingPositiveInteger {
	
	//LeetCode: 41
	//First missing positive integer in an array
	public static int firstMissingPositive() {
		//First Missing Positive Integer in an array
				int nums[] = {4,5,1,2,3};
				int len = nums.length;
				
				Set<Integer> bag = new HashSet<>();
				for(int num:nums) {
					bag.add(num);
				}
				for(int i=1; i<=len;i++)
				{
					if(!bag.contains(i)) return i;
				}
				return len+1;//Default Return
	}


	public static void main(String[] args) {
	System.out.println("----------> " +firstMissingPositive());	
	}
}
