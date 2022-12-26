package afternoon;

import java.util.Scanner;

public class PatternStar3 {

	public static void main(String[] args) {
		int n, i, j, k;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rows :");
		n = sc.nextInt();
	
		for(i=1;i<=n;i++) {
			
			for(j=n;j>i;j--) {
				
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
			System.out.print("*");
		    }
			System.out.println();
		}

	}

}
