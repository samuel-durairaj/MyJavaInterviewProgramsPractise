package practisePrograms;

import java.util.*;

public class Practise {

	public static void practicals()
	{
		//Triangle pattern
		int rowAndCol = 5;
		
		for(int i=0;i<=rowAndCol;i++)
		{
			
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=rowAndCol; j>=i;j--)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Practise prac = new Practise();
		
		practicals();
		
		//prac.practicals(new int[]nums{2,1,3,4,5,2,7});
		//.out.println(practicals(new int[] {2,1,3,4,5,2,7}));
		
	}

}