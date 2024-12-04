package practisePrograms;

public class VowelsAndConsonants {

	static void vowelsAndConsonantsFromString() {
		
		int vowelCount =0;
		int consonantCount =0;
		
		String str = "Hi Welcome to Java";
		int len = str.length();
		
		//Find Vowels in the string
		for(int i=0;i<len;i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				System.out.println("Vowel '"+str.charAt(i)+"' at the index "+i);
				vowelCount++;
			}
		}
		System.out.println();
		System.out.println("Total Number of Vowels: "+vowelCount);
		System.out.println("********************************");
		
		
		//Find Consonants in the string
		for(int i=0;i<len;i++) {
			if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u'&&str.charAt(i)!=' ')
			{
			    System.out.println("Consonant '"+str.charAt(i)+"' at the index"+i);
				consonantCount++;
			}
		}
		System.out.println();
		System.out.print("Total Number of Consonants: "+consonantCount);
	}
	public static void main(String[] args) {
		vowelsAndConsonantsFromString();
	}

}
