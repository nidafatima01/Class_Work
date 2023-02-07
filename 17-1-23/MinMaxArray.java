package array;

import java.util.Scanner;

public class MinMaxArray {
	public static void main(String[] args) {
	int size,i,min,max;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number of elements in array : ");
	size = sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter "+size+" elements of an array : ");
	for(i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("elements of an array  are: ");
	for(i=0;i<size;i++) {
		System.out.println(arr[i]);
	}
	min=arr[0]; //3
	for(i=1;i<size;i++){//3 4 1
	if(min>arr[i])  //3 >1t
		min=arr[i];
	}
	System.out.println("minimum value is:"+min);
	
	max=arr[0]; //3
	for(i=1;i<size;i++){//3 4 1
	if(max<arr[i])  //3 <4t
		max=arr[i];
	}
	System.out.println("maximum value is:"+max);
	}
}
