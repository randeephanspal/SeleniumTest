package OOPConceptPart2;

public interface USBank {
	
	int min_bal = 100;  //be default static 

	public void credit(); //non static method
	
	public void debit();  //non static method
	
	public void transferMoney();  //non static method
	
	//only method declaration, it means no method body
	//only method prototype
	//in Interface, we can declare the variables, vars are by default are static in nature.
	//vars values cannot be changed from any other class, its final in nature.
	//no static method in Interface.
	//no main method.
	//Interface is abstract by nature i.e we cannot create object of Interface.
	
	
	
}
