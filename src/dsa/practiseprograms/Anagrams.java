package dsa.practiseprograms;

import java.util.Arrays;

public class Anagrams {
	
	//Anagrams using sorting approach
	
	public static boolean anagramUsingSort(String str1, String str2) {
	
		char[] firstChar = str1.toCharArray();
		char[] secondChar = str2.toCharArray();
		
		Arrays.sort(firstChar);
		Arrays.sort(secondChar);
	
		return Arrays.equals(firstChar, secondChar);
	
	}
	public static boolean anagramUsingHashTableArray(String s, String t) {
		
		int[] count = new int[26];
		
		//Count the frequency of characters in string s
		for(char x : s.toCharArray()) {
			count[x -'a']++;
		}
		
		//Decrement the frequency of characters in string t
		for(char x : t.toCharArray()) {
			count[x -'a']--;
		}
		
		//Check if the character has non-zero frequency
		for(int val:count) {
			if(val!=0) return false;
		}
		
		
	   return true;
	}

	public static void main(String[] args) {

		String str1 = "eat";
		String str2 = "ate";
		 System.out.println(anagramUsingSort(str1,str2));
		 System.out.println(anagramUsingHashTableArray(str1,str2));
		
	}

}
