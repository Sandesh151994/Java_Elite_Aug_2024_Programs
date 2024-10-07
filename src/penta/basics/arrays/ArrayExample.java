package penta.basics.arrays;

/*
 * Syntax:
 * 		
 * 	datatype[] arr_name=new datatype[size];
 * 
 * 	datatype []arr_name=new datatype[size];
 * 
 *  datatype arr_name[]=new datatype[size];
 *  
 *  datatype arr_name[]={val1,val2,val3.......valn};
 *  
 *  datatype arr_name[]=new datatype[]{val1,val2,val3.......valn};
 * 
 * 
 * 
 * 
 */

public class ArrayExample {

	public static void main(String[] args) {
		
		int arr1[]=new int[5];// index starts from 0 ends with lengt-1
		arr1[0]=11;
		arr1[1]=22;
		arr1[2]=34;
		arr1[3]=45;
		arr1[4]=67;
		
		System.out.println(arr1.length);
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			
		}
		
		System.out.println();
		char arr2[]= {'A','E','I','O','U'};
		System.out.println("Array Length "+arr2.length);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		String cities[]=new String[] {"Bangalore","Hassan","Mysore","Shimoga"};
		
		System.out.println("Array Length "+cities.length);
		
		for(String city:cities)
		{
			
			System.out.println(city);
		}
		
		for(int i=cities.length-1;i>=0;i--)// i=3//3>=0//2>=0
		{
			System.out.println(cities[i]);//c[3]//Shimoga
		}
		
		
		// {34,22,12,45,89}
		//min element is 12
		//max element us 89
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
