package OOPs;

interface Drawable{
	void draw();
	int x=100;
}
interface Sayable{
	void say();
	int x=400;
}
class Shape{
	void design() {
		System.out.println("Designing different Shapes...!!");
	}
}
class Rectangle extends Shape implements Drawable,Sayable{

	@Override
	public void draw() {
		
		System.out.println("Drawing rectangle!!");
	}

	@Override
	public void say() {
		
		System.out.println("Saying Hii!!");
	}
	
}
class Square implements Drawable{

	@Override
	public void draw() {
		
		System.out.println("Drawing square!!");
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		Shape sp=new Shape();
        sp.design();
        
	// u cant instantiate interface but u can create a ref var
		/*Drawable dr;
		dr=new Square();
		dr.draw();
        dr=new Rectangle();
        dr.draw();
        */
        
        Rectangle d=new Rectangle();
        d.draw();
        d.say();
        System.out.println(Drawable.x);
        System.out.println(Sayable.x);
	}

}
