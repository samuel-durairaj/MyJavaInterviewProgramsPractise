package practisePrograms;

import java.util.Scanner;

public class Reverse {

	public void reverseString() {
		String str = "This is my country";
		
		int len = str.length();
		
		for(int i=len-1; i>=0; i--) 
		{
			System.out.print(str.charAt(i));
		}
	}
	public void reverseStringOrPallindrome() {
		String str = "malayalam";
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1; i>=0; i--) 
		{
			rev = rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("String is a Pallindrome");
		else
			System.out.println("String is Not a Pallindrome");
	}
	public void lastWordOfString() {
		String str = "This is my country";
		String part[] = str.split(" ");
		String lastWord = part[part.length-1]; 
		
		System.out.println(lastWord);
	}	
	public void reverseStringOfWords() {
		String str = "I Love India";
		String split[] = str.split(" ");
		
		for(int i=(split.length)-1;i>=0;i--)
		{
			System.out.print(" "+split[i]);
		}
		System.out.println();
	}
	public void reverseNumbers() {
		int[] nums = {1,2,3,4,5,6};
		int len = nums.length;
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(nums[i]);
		}
	}
	public void reverseNumberOrPallindrome() {
		
		// Pallindrome or Reverse number
		
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the number: ");
				
				//Variables Initialisation
				int num = scan.nextInt();
				int reverse=0 , temp, reminder;
				
				temp = num;
				
				while(temp!=0) {
					reminder =temp%10;
					reverse = reverse*10 + reminder;
					temp = temp/10;
				}
				if(num==reverse)
				{
				System.out.println(reverse+" is a Palindrome");
				}
				else
				{
					System.out.println(reverse+" is not a Palindrome");
			    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Reverse reverse = new Reverse();
		//reverse.reverseString();
//		reverse.lastWordOfString();
//		reverse.reverseNumberOrPallindrome();
	//	reverse.reverseStringOfWords();
		reverse.reverseStringOrPallindrome();
	}

}
