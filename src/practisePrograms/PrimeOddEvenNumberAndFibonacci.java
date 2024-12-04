package practisePrograms;

import java.util.Scanner;

public class PrimeOddEvenNumberAndFibonacci {
	
	public static boolean primeNumber() {
		
		System.out.print("Enter the number : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=2;i<num; i++) 
		{
			if(num%i==0) return false;
		}
		return true;
	}

	public static void oddOrEvenNumber() {
		
		System.out.print("Enter the number : ");
		Scanner scan1 = new Scanner(System.in);
		int num = scan1.nextInt();
		
        if(num%2==0)
        	System.out.println("Even Number");
        else
            System.out.println("Odd Number");
	}
     public static void fibonacciSeries() {
		
    	 
    	 //Ex: Input = 5 ---> 0 1 1 2 3
		System.out.print("Enter the number : ");
		Scanner scan1 = new Scanner(System.in);
		int num = scan1.nextInt();
		
		int n1 = 0, n2 =1, sum =0;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<num;i++)
		{
			sum = n1+n2;
			System.out.print(" "+sum);
			//swap
			n1 = n2;
			n2 = sum;
		}
	}
	
public static void main(String[] args) {
	//System.out.println(primeNumber());
	//oddOrEvenNumber();
	fibonacciSeries();
}
}
