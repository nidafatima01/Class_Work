package array;
import java.util.Scanner;
public class ArrayBubbleSort {

	static int[] initializeArray() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an Array: ");
		int size=sc.nextInt();

		//instantiate array object
		int[] arr = new int[size];

		//initialize array
		System.out.println("Enter "+size+" elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();	
		}
		return arr;
	}
	static void sortArray(int arr[]) {
		int i,j,temp;
		//sorting the array  //3 2 6 5
		for(i=0;i<arr.length;i++) { //3  //6
			for(j=i+1;j<arr.length;j++) {  //swap2 and 3 //swap6 and 5
				if(arr[i]>arr[j]) {  //3>2t //6>5t 
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp; //2 3 6 5  //2 3 5 6
				}
			}
		}
	}
	static void printArray(int arr[]) {
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		
		int arr[]=ArrayBubbleSort.initializeArray();
		
		System.out.println("Before Sorting :");
		ArrayBubbleSort.printArray(arr);

		ArrayBubbleSort.sortArray(arr);

		System.out.println("After Sorting :");
		ArrayBubbleSort.printArray(arr);
	}

}
