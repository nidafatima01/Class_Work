package OOPs;

public class User {

	int userId;
	String userName;
	String userAddress;
	static String Organization="Hamdard";
	long phn;
	
	//static block execute before main method
	static {
		System.out.println("Details are: ");
	}
	public static String getOrganization() {
		return Organization;
	}

	public User() 
	{
		System.out.println("This is a default constructor");
	}
    
	public User(int userId,String userName,String userAddress) {
		this.userId=userId;
		this.userName=userName;
		this.userAddress=userAddress;
	}
	
	public User(int userId,String userName,String userAddress,long phn)
	{   //this();    Call default constructor
		this(userId,userName,userAddress);  //invoking the current class constructor
		this.phn=phn;
	}
	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserAddress() {
		return userAddress;
	}
	
}
