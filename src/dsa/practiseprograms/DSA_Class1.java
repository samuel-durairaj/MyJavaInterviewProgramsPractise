package dsa.practiseprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DSA_Class1 {

	public static boolean containsDuplicate(int[] nums)
	{
		int len = nums.length;
		
		//edge case
		if(len<=1) return false;
		
		for(int i=0; i<len-1;i++)
		{
			int primaryNums = nums[i];
			
			for(int j=i+1;j<len;j++)
			{
				int secondaryNums = nums[j];
				
				if(primaryNums==secondaryNums)
				{
					return true;
				}
			}
		}
		
		return false;
	}
 
	public static boolean containsDuplicate_BestTime(int[] nums)
	{
		if(nums.length<=1) return false;
		
		Set<Integer> seen = new HashSet<>();
		
		for(int num : nums) {
			if(seen.contains(num)) return true; // Early Return (ER)
			else seen.add(num);
		}
		return false; //Default Return (DR)
	}
	
	public static boolean containsDuplicate_BestSpace(int[] nums)
	{
		Arrays.sort(nums); // 0(n log n)T
		
		for(int i=0;i<nums.length; i++) //o(n)T
		{
			if(i==0) continue;
			if(nums[i]==nums[i-1]) return true;
		}
		
		return false; //Default Return (DR)
	}
	
	public static int firstDuplicateNumber(int[] nums)
	{
        Set<Integer> seen = new HashSet<>();
        
        for(int i=0; i<nums.length;i++)
        {
        	if(seen.contains(nums[i]))
        	   return nums[i];
        	seen.add(nums[i]);
        }
		return -1;
	}
	public void setExample()
	{
	  Set<String> strVal = new HashSet<>();
	  
	  strVal.add("Sam");
	  strVal.add("Sam");
	  strVal.add("Sachin");
	  strVal.add("Dravid");
	  strVal.add("Sachin");
	  
	  System.out.println(strVal);
	}
	
	/*Example: Input: nums = [3,2,4] Target = 6
	  Output: [1,2] (i.e.) adding the index 1 and 2 gives the target value 6
	 */
	public int[] twoSumIndex(int nums[],int targetSum) {
	
		Map<Integer, Integer> seen = new HashMap<>();
		
		//Key - number
		//Value - index of the input nums
		
		for(int i=0; i<=nums.length; i++)
		{
			int x = nums[i];
			int y = targetSum - x;
			
			if(seen.containsKey(y))
			{
				return new int[] {seen.get(y),i};
			}
			else 
			{
				seen.put(nums[i],i);
			}
		}
		return new int[]{}; // Default Return
	}
	
	
	
	/* Given 2 strings s1 and s2, return true if s2 is an anagram of s1, and false otherwise
	 Ex: Input s1- "anagram", s2 - "nagaram"
	 Output: true */
	
	public boolean isAnagaram(String s1, String s2)
	{
		//Edge case
		if(s1.length() != s2.length()) return false;
		if(s1.length()==0 && s2.length()==0) return false;
		
		
		Map<Character, Integer> freq1 = new HashMap<>();
		Map<Character, Integer> freq2 = new HashMap<>();
		
		for(char c: s1.toCharArray())
		{
			if(freq1.containsKey(c))
			{
				freq1.put(c, freq1.get(c)+1);
			}
			else
			{
				freq1.put(c, 1);
			}
		}
		for(char c: s2.toCharArray())
		{
			if(freq2.containsKey(c))
			{
				freq2.put(c, freq2.get(c)+1);
			}
			else
			{
				freq2.put(c, 1);
			}
		}
		if (freq1.keySet().size() != freq2.keySet().size()) return false;
		
		for(char key : freq1.keySet())
		{
			if (!freq2.containsKey(key))
			{
				return false;
			}
			if (freq2.get(key).intValue() != freq1.get(key).intValue())
			{
				return false;
			}
		}
		return true; // Default Return
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		DSA_Class1 dataStructures = new DSA_Class1();
//		
//		int[] nums = {2,5,6,7,3,2};
//		int targetSum = 10;
//		
//		int result[] = dataStructures.twoSumIndex(nums,targetSum);
//		System.out.print(Arrays.toString(result));
		
		
		//dataStructures.setExample();
		//dataStructures.isAnagaram("anagram", "nagaram");
		//System.out.println(containsDuplicate(new int[]{3,5,7,2,4,9,9,1}));
		System.out.println(containsDuplicate_BestTime(new int[]{3,5,7,2,4,9,1}));
//		System.out.println(containsDuplicate_BestSpace(new int[]{3,5,7,2,4,9,1}));
//		System.out.println(firstDuplicateNumber(new int[] {2,2,6,3,7,5}));
		//System.out.println(twoSumIndex(new int[] {3,5,7,2,4,9,9,1}, 18));
	}

}
