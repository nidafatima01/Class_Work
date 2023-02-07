package OOPs;

interface P1{
	void fun();
	default void def() {
		
		System.out.println("Printing Default method in interface");
        System.out.println(mul(3,5));
	}
	static int add(int a, int b) {
		System.out.println(divide(15,3));
		return a+b;
	}
	private int mul(int c,int d) {
		return c*d;
	}
	private static int divide(int y,int z) {
		return y/z;
	}
}
interface P2{
	void fun();
}
class Gp{
	void grand() {
	System.out.println("This is grand parent class");
	}
}
class child extends Gp implements P1,P2{

	@Override
	public void fun() {
		System.out.println("This is child class");	
	}	
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		child ch=new child();
        ch.fun();
        ch.grand();
        ch.def();
    
        System.out.println("Printing Static method in Interface ,-->" +P1.add(5, 6));
	}
}
