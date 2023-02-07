package array;
import java.util.Scanner;
class Empl{
	int id;
	String name;
	String emailId;
	public Empl(int id, String name, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}
	public Empl() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	void display() {
		System.out.println("Id: "+this.id+" Name: "+this.name+" Email: "+this.emailId);
	}
	
}
public class ArrayOfObj {

	public static void main(String[] args) {
		int size;
		int id;
		String name;
		String emailId;
		Empl arr[]=new Empl[6];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employee you want for this particular project : ");
		size=sc.nextInt(); 
		System.out.println("Enter "+size+" employees details: "); 
		for(int i=0;i<size;i++) {
			System.out.println("Enter employee id: ");
			id=sc.nextInt(); 
			sc.nextLine();
			System.out.println("Enter employee name: ");
			name=sc.nextLine();
			System.out.println("Enter employee emailid: ");
			emailId=sc.nextLine();
			
			//add details in the array
			arr[i]=new Empl(id,name,emailId);
			System.out.println("===============");
		}
		System.out.println("All employees details: ");
		for(int i=0;i<size;i++) {
			arr[i].display();
			System.out.println("===============");
		}
	}

}
