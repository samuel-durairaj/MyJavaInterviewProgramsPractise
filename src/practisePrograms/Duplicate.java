package practisePrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	
	public void duplicateNumbers()
	{
		int nums[] = new int[] {4,5,7,3,5,9,4,5};
        int len = nums.length;
        
        for(int i=0; i<len-1;i++)
        {
            for(int j=i+1; j<len; j++)
            {
                if(nums[i]==nums[j])
                {
                    System.out.print(nums[i]);
                }
            }
        }
        System.out.println();
	}
	
	
	
	public void duplicateNumbersBySorting()
	{
		int nums[] = {4,5,7,3,5,9,4,5};
        int len = nums.length;
        Arrays.sort(nums);
     
        //Ascending Order
        for(int i=0; i<len;i++)
        {
            System.out.print(nums[i]);
        }
        System.out.println();
        
        //Descending Order
        for(int i=len-1; i>=0;i--)
        {
            System.out.print(nums[i]);
        }
	}
	
	public void duplicateCharacters()
	{
		String str = "gsdfffoooeaa";
		char[] duplicate = str.toCharArray();
        int len = duplicate.length;
		
        for(int i=0; i<len-1;i++)
        {
            for(int j=i+1; j<len; j++)
            {
                if(duplicate[i]==duplicate[j])
                {
                    System.out.print(duplicate[i]);
                }
            }
        }
        System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duplicate duplicate = new Duplicate();
//        duplicate.duplicateNumbers();
//        duplicate.duplicateCharacters();
		duplicate.duplicateNumbersBySorting();
		//duplicate.firstDuplicateNumber();
	}

}
