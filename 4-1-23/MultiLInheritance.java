package OOPs;

class Userss{
	int id;
	String name;
	String address;
	
	public Userss(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println("Id : "+id+ ", Name : "+name+ ", Address : "+address);
	}
}
class Employ extends Userss{
    int kids;
	public Employ(int id, String name, String address,int kids) {
		super(id, name, address);
		this.kids=kids;
	}
	void display() {
		super.display();
		System.out.println("We will have " +kids +" kidsss Inshalaahhhh");
	}
}
class Nida extends Employ{

	public Nida(int id, String name, String address, int salary) {
		super(id, name, address, salary);
		
	}
}

public class MultiLInheritance {

	public static void main(String[] args) {
		Nida obj=new Nida(420,"Shivam","Delhi",12);
		obj.display();
	}

}
