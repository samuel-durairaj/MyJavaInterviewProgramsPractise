package practisePrograms;

public class SumOfArrayAndUpperToLowerCase {
	
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
   public static void UppercaseToLowerCaseViceVersa()
   {
	   String upperCase = "samuel durairaj";
	   String lowerCase = "SAMUEL DURAIRAJ";
	   
	   String uc = upperCase.toUpperCase();
	   String lc = lowerCase.toLowerCase();
	   
	   System.out.println(uc);
	   System.out.println(lc);

   }
   public static void findVowels() {
   	
   	String str = "Hi Welcome to Java";
   	int len = str.length();
   	
   	for(int i=0;i<len;i++) {
   		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
   		{
   			System.out.println("Given string contains '"+str.charAt(i)+"' at the index "+i);
   		}
   		
   	}
   }
	public static void main(String[] args) {
		
		SumOfArrayAndUpperToLowerCase obj = new SumOfArrayAndUpperToLowerCase();
		//System.out.println("Sum of the array is: "+obj.sum());
		UppercaseToLowerCaseViceVersa();
	}

}
