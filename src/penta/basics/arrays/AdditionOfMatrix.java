package penta.basics.arrays;

public class AdditionOfMatrix {
	
	
	public static void main(String[] args) {
		
		int row=2,col=2;
		
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{5,6},{7,8}};
		
		int c[][]=new int[row][col];
		
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < col; j++) {
				
				c[i][j]=a[i][j]+b[i][j];
				
			}
		}
		
		System.out.println("Addition of matrix");
		for (int i = 0; i < c.length; i++) {
			
			for (int j = 0; j < c.length; j++) {
				
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
	}

}
