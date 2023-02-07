package OOPs;

class Users{
	int id;
	String name;
	String address;

	public Users(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println("Id : "+id+ ", Name : "+name+ ", Address : "+address);
	}
}
class Emp extends Users{
	int sal;
	public Emp(int id,String name,String address,int sal) {
		super(id,name,address);
		this.sal=sal;
	}
	void display() {
		super.display();
		System.out.println("Salary : "+sal);
	}
	int calcGross() {
		return sal*12;
	}
}

public class SingleIhneritance {

	public static void main(String[] args) {
		Emp obj=new Emp(1, "Nida", "Delhi",50000);
		//obj.Emp(1, "Nida", "Delhi");
		obj.display();
		System.out.println("Gross salary is: "+obj.calcGross());
	}
}