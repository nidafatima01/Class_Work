package array;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		int size,i,key;
		boolean status=false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		size = sc.nextInt();	

		int arr[] = new int[size];
		System.out.print("enter "+size+" elements:");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter element you want to search in an array : ");
		key = sc.nextInt();
		for(i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				status=true;
				break;
			}
		}
		if(status==false)
			System.out.print("Data is not found in an array!!");
		else
			System.out.print("Data is found at position "+i+"!!");
	}
}
