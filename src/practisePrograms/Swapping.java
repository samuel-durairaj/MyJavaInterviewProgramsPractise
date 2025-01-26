package practisePrograms;

import java.util.Scanner;

public class Swapping {

	public void swapNumbersWithoutVariables()
	{
		//swapping numbers without using variables
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = scan.nextInt();
		System.out.print("Enter the value of b: ");
		int b = scan.nextInt();
		
		a = a+b; 
		b = a-b; 
		a = a-b;
	
		System.out.println("a =" +a);
		System.out.print("b =" +b);
	}
	public void swapNumbersWithVariables()
	{
		//swapping numbers using variables
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = scan.nextInt();
		System.out.print("Enter the value of b: ");
		int b = scan.nextInt();

		int temp = a; 
		a = b; 
		b = temp; 
		
		System.out.println("a =" +a);
		System.out.print("b =" +b);
	}
	public void swapStrings()
	{
		    Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the 1st text: ");
	        String str1 = scan.nextLine();
	        System.out.print("Enter the 2nd text: ");
	        String str2 = scan.nextLine();
	        
	        System.out.println("Before Swap :"+str1+" "+str2);
	        
	        //Concatenate string 'str3'
	         String str3 = str1+str2;
	         //Two parameter Ex: 0,5; 0,5-1, = 0,4 (End index -1)
	         str2 = str3.substring(0,(str3.length()-str2.length()));
	         str1 = str3.substring(str2.length());
	         
	         System.out.print("After Swap :"+str1+" "+str2);
	         
	         try {
	        	 
	         }catch(Throwable exp) {
	        	 
	         }
		        
	}
	public static void main(String[] args) {
		 
		Swapping swap = new Swapping();
		swap.swapNumbersWithoutVariables();
		swap.swapNumbersWithVariables();
		swap.swapStrings();
	}
	
     
}
