package OOPs;


class Batch{
	int batchId;
	String startDate;
	String endDate;

	public Batch(int batchId,String startDate,String endDate) {
		this.batchId=batchId;
		this.startDate=startDate;
		this.endDate=endDate;
	}
}
	class Java extends Batch{
		String courseName;
		public Java(int batchId, String startDate, String endDate,String courseName) {
			super(batchId, startDate, endDate);
			this.courseName=courseName;
		}
	}
	class AWS extends Batch{
		String courseName;
		public AWS(int batchId, String startDate, String endDate,String courseName) {
			super(batchId, startDate, endDate);
			this.courseName=courseName;
		}
	}
	class Studentss extends Java{

		int studId;
		String studName;
		long phoneNo;

		public Studentss(int batchId, String startDate, String endDate, String courseName,int studId,String studName,long phoneNo) {
			super(batchId, startDate, endDate, courseName);
			this.studId=studId;
			this.studName=studName;
			this.phoneNo=phoneNo;
		}
		void display() {
			System.out.println("Welcome to the course "+courseName+"\n"+studName+ "\n" +"Your Student ID is: " +studId +" and Phone Number : "+phoneNo+ "\n" +"Batch Id is: "+batchId+"\n" +"Starting and Ending Date of your batch is: " +startDate+ " to " +endDate);
		}
	}
	class Studentsss extends AWS{

		int studId;
		String studName;
		long phoneNo;

		public Studentsss(int batchId, String startDate, String endDate, String courseName,int studId,String studName,long phoneNo) {
			super(batchId, startDate, endDate, courseName);
			this.studId=studId;
			this.studName=studName;
			this.phoneNo=phoneNo;
		}
		void display() {
			System.out.println("----------");
			System.out.println("Welcome to the course "+courseName+"\n"+studName+ "\n" +"Your Student ID is: " +studId +" and Phone Number : "+phoneNo+ "\n" +"Batch Id is: "+batchId+"\n" +"Starting and Ending Date of your batch is: " +startDate+ " to " +endDate);
			}
	}

public class BatchMain {

	public static void main(String[] args) {
		Studentss nida=new Studentss(3739,"15-12-2022","15-3-2023","Java",243211,"Nida Fatima",826467912);
		nida.display();
		Studentsss shiv=new Studentsss(3298,"10-1-2023","10-4-2023","AWS",253247,"Shiv Kumar Jha",770396013);
		shiv.display();
	}
}
