package dsa.practiseprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIndex {

	
	/*Example: Input: nums = [3,2,4] Target = 6
	  Output: [1,2] (i.e.) adding the index 1 and 2 gives the target value 6
	 */
	public static int[] twoSumIndex(int nums[],int targetSum) {
	
		Map<Integer, Integer> bag = new HashMap<>();
		
		//Key - number
		//Value - index of the input nums
		
		for(int i=0; i<=nums.length; i++)
		{
			int x = nums[i];
			int y = targetSum - x;    //x+y= targertSun -> y = targetSum-x;
			
			if(bag.containsKey(y))
			{
				return new int[] {bag.get(y),i};
			}
			else 
			{
				bag.put(nums[i],i);
			}
		}
		return new int[]{}; // Default Return
	}
	
	
	public static void main(String[] args) {
	
		int[] nums = {2,5,6,7,3,2};
		int targetSum = 12;
		
		int result[] = twoSumIndex(nums,targetSum);
		System.out.print(Arrays.toString(result));
		
	}

}
