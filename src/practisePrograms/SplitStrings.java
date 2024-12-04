package practisePrograms;

public class SplitStrings {
	
	static void splitSpecialAlphabetNumberRegEx() {
        
		String str = "Java234T567point890@#!!";
		
		String[] splitStr1 = str.split("[@#!!^0-9]");
		String[] splitStr2 = str.split("[A-Za-z^0-9]");
	    String[] splitStr3 = str.split("[A-Za-z^@#!!]");
	   
		for(int i=0;i<=(splitStr1.length)-1;i++) {
			System.out.print(" " +splitStr1[i]);
		}
		System.out.println();

		for(int i=0;i<=(splitStr2.length)-1;i++) {
			System.out.print(" " +splitStr2[i]);
		}
		System.out.println();

		for(int i=0;i<=(splitStr3.length)-1;i++) {
			System.out.print(" " +splitStr3[i]);
		}
	}
	
static void splitSpecialAlphabetNumberUserDefinedFunctions() {
        
		String str = "Java234T567point890@#!!";
		
		StringBuffer alpha = new StringBuffer();
		StringBuffer special = new StringBuffer();
		StringBuffer numeric = new StringBuffer();
		
		for(int i=0; i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			  alpha.append(str.charAt(i));
			
			else if (Character.isDigit(str.charAt(i)))
				numeric.append(str.charAt(i));
			
			else
				special.append(str.charAt(i));
				
		}
		System.out.println(alpha);
		System.out.println(special);
		System.out.println(numeric);
	}

   

	public static void main(String[] args) {
		
		//splitSpecialAlphabetNumberRegEx();
		splitSpecialAlphabetNumberUserDefinedFunctions();
	}

}
