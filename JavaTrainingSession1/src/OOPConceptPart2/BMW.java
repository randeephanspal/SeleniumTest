package OOPConceptPart2;

public class BMW extends Car { // has-a relationship

	//Method Overriding: When same method is present in parent class as well as
	//in child class with the same name and same number of arguments.
	
	public void start(){ //overridden method
		System.out.println("BMW starts");
	}
	
	public void theftsafety(){
		System.out.println("BMW theftsafety");
	}
}
