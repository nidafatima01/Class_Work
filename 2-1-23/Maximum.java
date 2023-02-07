package afternoon;

public class Maximum {

	public static void main(String[] args) {
		int a=250;
		int b=160;
		int c=270;
		
		int x=10, y;
		y=++x;  //first inc will take place then assignment 
		   //and in y=x++ ,first value will be assigned to y and then inc x
		System.out.println(x);
		System.out.println(y);
		
		//elseif condition using logical & operator
		
				if((a>b) && (a>c)) 
					System.out.println("A is greater");
				else if((b>a) && (b>c))
					System.out.println("B is greater");
				else
					System.out.println("C is greater");
/*
    //Nested if else
 		
		if(a>b) {   //t
			if(a>c) //f
			System.out.println("A is greater than B and C");
			else
				System.out.println("C is greater");
		}
		else {
		if(b>a)
			System.out.println("B is greater ");
		else
			System.out.println("C is greater");
		}
		
		
		   if(x>y) {   
			if(x>z) 
			result=x;
			else
				result=z;
		}
		else {
		if(y>x)
			result=y;
		else
			result=z;
		}
System.out.println(result);
*/
		
	}

}
