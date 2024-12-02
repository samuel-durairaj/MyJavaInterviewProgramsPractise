package practisePrograms;

import java.util.Scanner;

public class Patterns {

// Print the below square pattern
// * * * * *
// * * * * *
// * * * * * 
// * * * * * 
   public void squarePattern()
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the number of rowsAndcols: ");
	   int rowsAndcols = sc.nextInt();
	   
		for (int i = 1; i<= rowsAndcols; i++)
		{
			for (int j= 1; j<= rowsAndcols; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
    // Print the below half Left Pyramid pattern
	// * 
	// * * 
	// * * * 
	// * * * * 
	   public void halfLeftPyramid()
	   {
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Enter the number of rowsAndcols: ");
		   int rowsAndcols = sc.nextInt();
		   
			for (int i = 1; i<= rowsAndcols; i++)
			{
				for (int j= 1; j<= i; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	
// Print the below triangle pattern
//	   *
//	 * * *
//	* * * * *
//* * * * * * *
	public void trianglePattern()
	{
		Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of rowsAndcols: "); 
        int rowsAndcols = sc.nextInt(); 
  
        //Loop to iterate for the given number of rows 
        for (int i = 1; i <= rowsAndcols; i++) 
        { 
            //Loop to print the number of spaces before the star 
            for (int j = rowsAndcols; j >= i; j--) 
            { 
                System.out.print(" "); 
            }   
            //Loop to print the number of stars in each row 
            for (int k = 1; k <= i; k++) 
            { 
                System.out.print("* "); 
            } 
            //For new line after printing each row 
            System.out.println(); 
        } 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Patterns pattern = new Patterns();
        //pattern.squarePattern();
        pattern.trianglePattern();
        // pattern.halfLeftPyramid();
	}

}
