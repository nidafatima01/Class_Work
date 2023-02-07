package OOPs;

public class ConstructorDemo {

	public static void main(String[] args) {
		  //insitialize obj
		User user1 = new User(1,"Nida","Delhi");
		User user2 = new User(2,"Shiv","Gurgaon");
		
		System.out.println(user1.getUserId()+ " " + user1.getUserName() +" " + user1.getUserAddress() +" "+user1.getOrganization());
		System.out.println(user2.getUserId()+ " " + user2.getUserName() +" " + user2.getUserAddress() +" "+user2.getOrganization());
	}

}
