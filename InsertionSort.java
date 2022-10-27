import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	void insertionSort(int array[]) {
		int size =  array.length;
		for (int j=1; j < size;  j++) {
			int key = array[j];
			int i = j-1;
			while((i >= 0) && (array[i] > key)) {
				array[i+1] = array[i];
				i--;
			}
			array[i+1] = key;
		}
		
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array : ");
		n = sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter the elements of array: ");
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Unsorted Array: ");
		System.out.println(Arrays.toString(array));
		
		InsertionSort obj = new InsertionSort();
		obj.insertionSort(array);
		
		System.out.println("Sorted Array: ");
		System.out.println(Arrays.toString(array));
	}

}
