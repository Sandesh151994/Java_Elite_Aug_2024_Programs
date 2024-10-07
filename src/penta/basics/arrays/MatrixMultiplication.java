package penta.basics.arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		
		int row=2,col=2;
		
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{5,6},{7,8}};
		
		int c[][]=new int[row][col];
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				for (int k = 0; k < c.length; k++) {
					
					c[i][j]+=a[i][k]*b[k][j];
					
				}
				
			}
		}
		System.out.println("Multiplication of matrix");
		
		for (int i = 0; i < c.length; i++) {
			
			for (int j = 0; j < c.length; j++) {
				
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
	}

}
