package array;

import java.util.Scanner;

public class InsertSpecificPosition {
	static int arr[]=new int[10],size;

	static void insert(int arr[],int size) {
		int i,position,element=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position: ");
		position=sc.nextInt();

		if(position<=0 || position>size) 
			System.out.println("You've enter wrong position!!");
		else {
			System.out.println("Enter an element: ");
			element=sc.nextInt();
			for(i=size;i>=position;i--) {
				arr[i]=arr[i-1];
			}
			arr[position-1]=element;
			size++;
		}
	}
	static void printArray(int arr[],int size) {
		int i;
		for(i=0;i<size;i++) {
			System.out.println(arr[i]+" ");	
		}
	}
	static int initializeArray(int arr[]) {
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array :");
		size=sc.nextInt();
		//arr=new int[size];
		System.out.println("Enter "+size+"elements: ");
		for(i=0;i<size;i++) 
			arr[i]=sc.nextInt();
		System.out.println("\nBefore adding new elements, array elements are: ");
		printArray(arr,size);
		return size;
	}

	public static void main(String[] args) {

		int size=InsertSpecificPosition.initializeArray(arr);
		InsertSpecificPosition.insert(arr,size);
		System.out.println("After adding ");
		InsertSpecificPosition.printArray(arr,size);
	}
}
