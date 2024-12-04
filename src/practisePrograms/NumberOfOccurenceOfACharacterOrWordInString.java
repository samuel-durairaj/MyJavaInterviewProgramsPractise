package practisePrograms;

import java.util.*;

public class NumberOfOccurenceOfACharacterOrWordInString {

	public static void numberOfOccurenceInString() {
		
		String str = "FGMMLF";
		
		char[] charArr = str.toCharArray();
		
		Map<Character, Integer> bag = new HashMap<>();
	
		for(char s: charArr) {
			if(bag.containsKey(s)) {
				bag.put(s, bag.get(s)+1);
			}
			else
			{
			    bag.put(s, 1);	
			}
		}
		System.out.println(bag);
	}
	
     public static void wordOccurenceInString() {
		
		String str = "in the moon on in the sky";
		
		String[] charArr = str.split(" ");
		
		Map<String, Integer> bag = new HashMap<>();
	
		for(String s: charArr) {
			if(bag.containsKey(s)) {
				bag.put(s, bag.get(s)+1);
			}
			else
			{
			    bag.put(s, 1);	
			}
		}
		System.out.println(bag);
	}
	public static void main(String[] args) {

		//numberOfOccurenceInString();
		wordOccurenceInString();

	}

}
