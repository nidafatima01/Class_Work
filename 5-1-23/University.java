/*  1.write a program to create one class University.create field id,universityName.
create 3 colleges(affiliated no.) under this university. create students(id,name)class 
which will going to extends any of the college and create object and print the details.
*/
package OOPs;

class Universityy{
	int fieldId;
	String UniversityName;
    
	public Universityy(int fieldId,String UniversityName) {
		this.fieldId=fieldId;
		this.UniversityName=UniversityName;
	}
}
class JMI extends Universityy{
    int cId;
    String cName;
	public JMI(int fieldId, String UniversityName,int cId,String cName) {
		super(fieldId, UniversityName);
		this.cId=cId;
		this.cName=cName;
	}	
}
class JHU extends Universityy{
    int cId;
    String cName;
	public JHU(int fieldId, String UniversityName,int cId,String cName) {
		super(fieldId, UniversityName);
		this.cId=cId;
		this.cName=cName;
	}	
}
class AMU extends Universityy{
    int cId;
    String cName;
	public AMU(int fieldId, String UniversityName,int cId,String cName) {
		super(fieldId, UniversityName);
		this.cId=cId;
		this.cName=cName;
	}	
}

class Students extends JMI{
    int sId;
    String sName;
	public Students(int fieldId, String UniversityName, int cId, String cName,int sId,String sName) {
		super(fieldId, UniversityName, cId, cName);
		this.sId=sId;
		this.sName=sName;
	}
	void display(){
		System.out.println("Student ID: "+sId+ ", Student Name: "+sName+ "\n" +"College Id: "+cId+", College Name: "+cName+ "\n" + "Field Id: "+fieldId+ ", UniversityName: "+UniversityName);
	}
	
}

public class University {

	public static void main(String[] args) {
		Students obj = new Students(193,"Jamia",1701,"JHU",5,"Nida Fatima");
		obj.display();
	}
}
