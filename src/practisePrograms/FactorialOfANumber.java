package practisePrograms;
import java.util.*;
public class FactorialOfANumber {
	
	public static void factorial() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		int factorial = 1;
		
		//Ex: Factorial of 5 -> 1 * 2 * 3 * 4 * 5
//		for(int i=1;i<=num;i++) {
//			factorial = factorial * i;
//		}
//		System.out.println("Sum of the factorial number: "+factorial);
		
		//Ex: Factorial of 5 -> 5 * 4 * 3 * 2 * 1
		for(int i=num;i>=1;i--) {
			factorial = factorial * i;
		}
		System.out.println("Sum of the factorial number: "+factorial);
	}

	public static void main(String[] args) {
		factorial();
	}

}
