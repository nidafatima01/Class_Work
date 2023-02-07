package OOPs;

abstract class Bank{
	void method1() {   //concrete method
		System.out.println("I love doing Java");
	}
	abstract void loanInterest();  //abstract method
}
//implementation class
class BOI extends Bank
{
	@Override
	void loanInterest() {
	System.out.println("6.75% interest rate");
	}
}

class Indiabulls extends Bank
{   @Override
	void loanInterest() {
	System.out.println("9.35% interest rate");	
    }
}
	
public class AbstractionDemo {

	public static void main(String[] args) {
		
		/* BOI b=new BOI();
		   b.loanInterest();
		   b.method1(); 
		*/
        //cannot instantiate abstract class 
		//Bank bnk=new Bank();
		
		//can create reference variable
		Bank bk;
	//up casting child class	object can be store
		
		bk=new BOI();
		bk.loanInterest();
		bk.method1();
		
		bk=new Indiabulls();
		bk.loanInterest();
		bk.method1();
		
		//Indiabulls in=new Indiabulls();
		//in.loanInterest();in.method1();				
	}
}
