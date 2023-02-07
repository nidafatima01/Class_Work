package afternoon;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	   
		int n, i, fact=1;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter some number to find its factorial");
		n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			fact = fact*i;
		}
       
		System.out.println("factorial of " +n + " is: " +fact);
	}

}
