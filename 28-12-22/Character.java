package afternoon;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any value");
		ch = sc.next().charAt(0);
        
		if((ch>=65) && (ch<=90)) 
			System.out.println("Character is an Alphabet");
		else if((ch>=97) && (ch<=122))
			System.out.println("Character is Alphabet");
		else
			System.out.println("Its not a Character");
	}

}
