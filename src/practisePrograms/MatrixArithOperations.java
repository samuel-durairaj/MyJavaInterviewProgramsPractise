package practisePrograms;

public class MatrixArithOperations {
	
	public static void matrixMultiplication() {
		
		//Matrix multiplication- 2D 3X3 Matrix
	    int m1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int m2[][] = {{3,2,1},{6,5,4},{9,8,7}};
		
		int sum =0;
		int r[][] = new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					sum = sum + m1[i][k]*m2[k][j];
				}
				r[i][j] = sum;
				sum=0;
			}
		}
		//Printing the result
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			   System.out.print(r[i][j]+" ");	
			}
			System.out.println();
		}
	}
		public static void matrixAddition() {
			
			//Matrix multiplication- 2D 3X3 Matrix
		    int m1[][] = {{1,2,3},{4,5,6},{7,8,9}};
			int m2[][] = {{3,2,1},{6,5,4},{9,8,7}};
		
			int r[][] = new int[3][3];
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					r[i][j]=m1[i][j]+m2[i][j];
				}
			}
			//Printing the result
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
				   System.out.print(r[i][j]+" ");	
				}
				System.out.println();
			}
	}
          public static void matrixSubtraction() {
			
			//Matrix multiplication- 2D 3X3 Matrix
		    int m1[][] = {{1,2,3},{4,5,6},{7,8,9}};
			int m2[][] = {{3,2,1},{6,5,4},{9,8,7}};
		
			int r[][] = new int[3][3];
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					r[i][j]=m1[i][j]-m2[i][j];
				}
			}
			//Printing the result
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
				   System.out.print(r[i][j]+" ");	
				}
				System.out.println();
			}
	}

	public static void main(String[] args) {
		
		matrixMultiplication();
		//matrixAddition();
		//matrixSubtraction();
	}

}
