package practisePrograms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
	
		int[] arr = {4,7,2,1,5,3,6};
		
		System.out.println("Before sorting: "+Arrays.toString(arr));
		
		int len = arr.length;
		
		for(int i=0;i<len-1;i++)  // Total number of passes
		{
			for(int j=0;j<len-1;j++) // Total number of Iterations
			{
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting: "+Arrays.toString(arr));
		
	}

}
