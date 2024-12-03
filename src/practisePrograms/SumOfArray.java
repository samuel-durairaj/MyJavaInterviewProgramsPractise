package practisePrograms;

public class SumOfArray {
	
   int sum() {
	   int[] arr = {4,3,2,6,8};
	   int sum=0;
	   
	   for(int i=0;i<arr.length; i++)
	   {
		   sum = sum + arr[i]; 
		   
		   /* above can also be written with '+=' operator
		    * sum += arr[i];
		    */
	   }
	    
	   return sum;
   }
	public static void main(String[] args) {
		
		SumOfArray obj = new SumOfArray();
		System.out.println("Sum of the array is: "+obj.sum());
	}

}
