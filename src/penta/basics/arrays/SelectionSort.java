package penta.basics.arrays;

public class SelectionSort {

	public static void main(String[] args) {


		int arr[]= {20,40,10,5,30};

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {

				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		}

		System.out.println("Array Elements after sorting");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
	}

}
