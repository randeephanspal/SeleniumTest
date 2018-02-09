package OOPConceptPart2;

public class HSBCBank implements USBank,BrazilBank{ //multiple inheritance
	//is-a relationship(Interface and class relationship)
	
	//If a class is implementing any Interface, then its mandatory to define/override
	//all the methods of Interface.
	
	
	//credit,debit and transferMoney is overriden from USBank
	public void credit(){
		System.out.println("hsbc--credit");
	}
	
	public void debit(){
		System.out.println("hsbc---debit");
	}
	
	public void transferMoney(){
		System.out.println("hsbc---moneytransfer");
	}

	//hsbc bank method
	public void educationLoan(){
		System.out.println("hsbc---education loan");
	}
	
	public void carLoan(){
		System.out.println("hsbc---carloan");
	}
	
	//brazil bank method: Overriden from BrazilBank
	public void mutualFund(){
		System.out.println("brazil--mutual funds");
	}
}
