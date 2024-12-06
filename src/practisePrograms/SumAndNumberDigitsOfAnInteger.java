package practisePrograms;

import java.util.*;

public class SumAndNumberDigitsOfAnInteger {

	public static void sumOfDigitsOfInteger() {
		
		System.out.print("Enter the Number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int sum =0;
		while(num>0||num!=0) {
			sum = sum + num%10;
			num = num / 10;
		}
		System.out.println("Sum of digits: "+sum);
	}
	
    public static void numberOfDigitsOfInteger() {
    	
    	System.out.print("Enter the Number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

	    int count = 0;
        while(num>0||num!=0) {
        	num=num/10;
        	count++;
        }
        System.out.println("Number of digits: "+count);
    }
	
	public static void main(String[] args) {
		sumOfDigitsOfInteger();
		//numberOfDigitsOfInteger();
	}

}
