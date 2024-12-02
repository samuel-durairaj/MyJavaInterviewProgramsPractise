package practisePrograms;

import java.util.*;

public class Practise {

	public static int[] practicals(int[] nums, int targetSum)
	{
		//Two sum index
		
		Map<Integer,Integer> bag = new HashMap<>();
		
		for(int i=0; i<=nums.length; i++)
		{
		     int x = nums[i];
		     int y = targetSum-x;
		     
		     if(bag.containsKey(y))
		     {
		    	return new int[] {bag.get(y),i};
		     }
		     else {
		    	 bag.put(nums[i], i);
		     }
		}
		return new int []{}; //Default Return
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Practise prac = new Practise();
		int[] nums = {2,4,6,1,7,3};
		int targetSum = 5;
		
		int result[] = practicals(nums, targetSum);
		
		//practicals();
		System.out.println(Arrays.toString(result));
		
		//prac.practicals(new int[]nums{2,1,3,4,5,2,7});
		//.out.println(practicals(new int[] {2,1,3,4,5,2,7}));
		
	}

}