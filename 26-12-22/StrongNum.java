package afternoon;

import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		//check strong number
		int n, sum=0,rem,temp,fact;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Write a number to check if it is strong number or not :");
		n = sc.nextInt();
		temp=n;
		
		while(n>0) {
			rem= n%10;
			fact=1;
			for(int i=1; i<=rem;i++)
			{
				fact *=i ;
			}
			sum= sum+fact;
			n= n/10;
		}
		if(temp==sum)
			System.out.println(temp+ " is a strong number");
			else
			System.out.println(temp+ " is not a strong number");	
	}

}
