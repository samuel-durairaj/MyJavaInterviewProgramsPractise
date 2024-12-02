package practisePrograms;

public class Reverse {

	public void reverseString() {
		String str = "This is my country";
		
		int len = str.length();
		
		for(int i=len-1; i>=0; i--) 
		{
			System.out.print(str.charAt(i));
		}
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
	public void reverseNumber() {
		int original = 123456;
		int reverse = 0;
		int reminder;
		
		while(original!=0)
		{
			reminder = original % 10;
			reverse = reverse * 10 + reminder;
			original = original /10;
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Reverse reverse = new Reverse();
		//reverse.reverseString();
//		reverse.lastWordOfString();
//		reverse.reverseNumber();
		reverse.reverseStringOfWords();
	}

}
