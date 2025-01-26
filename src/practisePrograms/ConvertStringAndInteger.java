package practisePrograms;

public class ConvertStringAndInteger {
	
	
	public static void convertStringAndIntegerValues() {
	String str = "12345";
	int value = 2344;
	
	//Convert string to integer using the method 'parseInt()'
	int convert = Integer.parseInt(str);
	System.out.println(convert);
	
	//Convert integer to string using the method 'valueOf()'
	String str1 = String.valueOf(value);
	System.out.println(str1);
	}
	public static void main(String[] args) {
		convertStringAndIntegerValues();
	}

}
