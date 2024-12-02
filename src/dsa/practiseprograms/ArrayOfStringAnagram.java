package dsa.practiseprograms;

import java.util.*;

public class ArrayOfStringAnagram {

	/*LEETCODE - 49
	 * 
	 * Given an array of strings, group the anagram together. You can answer in any order.
	 * (this problem is applicable only for lowercase english letters)
	 * 
	 * An anagram is a word or pharase formed by rearranging the letters of a different word 
	 * or phrase, typically using all the original letters exactly once.
	 * 
	 * Example: 
	 * Input - strs = ["eat","tea","tan","ate","nat","bat"]
	 * Outpu - strs = [["bat"],["nat","tan"],["ate","eat","tea"]]
	 * 
	 * List of list of strting:
	 * List : [bat]
	 * List : [nat,tan]
	 * List : [ate,tea,eat]
	 */
	
	//Group Anagram using Sort
	public static List<List<String>> groupAnagramsSort(String[] strs)
	{
	   HashMap<String, List<String>> map = new HashMap<>();
	   
	   for(String str: strs) {
		   char[] chars = str.toCharArray();
		   Arrays.sort(chars);
		   String sortedStr = new String(chars);
		   
		   map.computeIfAbsent(sortedStr, k-> new ArrayList<>()).add(str);
	   }
	   return new ArrayList<>(map.values());
	}
	
	
	//Group Anagram using HashTable
	public static List<List<String>> groupAnagrams(String[] strs)
	{
		Map<String, List<String>> freqWordsMap = new HashMap<>();
		
		for(String str: strs) {
			String freq = getFrequency(str);
			
			if(!freqWordsMap.containsKey(freq)) {
				freqWordsMap.put(freq, new ArrayList<>());
			}
			freqWordsMap.get(freq).add(str);
		}
		
		List<List<String>> result = new ArrayList<>();
		for(List<String> value : freqWordsMap.values()) {
			result.add(value);
		}
		return result;
	}
	
	/*Helper function
	 * This will show the frequency of an array
	 * EX: [eat]-> [1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0]
	 */
	
	private static String getFrequency(String str)
	{
		int[] freq = new int[26];
		
		//Count the frequency of characters in string str
		for(char c:str.toCharArray()) {
			freq[c -'a']++;
		}
		
		return Arrays.toString(freq);
	}
	
	public static void main(String[] args) {
		        String[] str = {"eat","tea","tan","ate","nat","bat"};
                System.out.println(""+groupAnagrams(str));
                System.out.println(""+groupAnagramsSort(str));
	}

}
