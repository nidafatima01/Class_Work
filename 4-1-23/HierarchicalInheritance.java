package OOPs;
//write a program of hierarchical inheritance.
class Banks{
	int loanInterest() 
	{
		return 8;
	}
}
class SBI extends Banks{
	@Override
	int loanInterest()   //method overriding
	{
		return 7;
	}
}
class AXIS extends Banks{
	
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		SBI sbi=new SBI();
		System.out.println(sbi.loanInterest()+"%");
		AXIS axis=new AXIS();
		System.out.println(axis.loanInterest()+"%");
	    
	}

}
