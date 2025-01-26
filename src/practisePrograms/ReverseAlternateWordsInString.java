package practisePrograms;

public class ReverseAlternateWordsInString {

	public static void reverseAlternateWords() {
		String str = "Today effort shapes tomorrow";
		String part[] = str.split(" "); // Broke string by an array delimited by " "
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<part.length;i++) // Loop over the array length
		{
			if(i%2!=0)
			{   //Add the word as it is
				sb.append(part[i]);
			}
			else 
			{   // else use StringBuilder reverse() method to reverse it
				sb.append(new StringBuilder(part[i]).reverse());
			}
			sb.append(" "); //Add whitespace in between words
		}
		System.out.print(sb);
	}
	
	public static void main(String[] args) {
		reverseAlternateWords();
	}

}
