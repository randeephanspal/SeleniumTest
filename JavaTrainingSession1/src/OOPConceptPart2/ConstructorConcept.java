package OOPConceptPart2;

public class ConstructorConcept {
	
	//Constructor name is same as class name
	//Constructor doesnt return any value
	//Default constructor is always called even if not define
	//Constructor overloading is possible. -- eg below
	
	public ConstructorConcept(){
		System.out.println("Print default const");
	}
	
	public ConstructorConcept(int a){
		System.out.println("Single param constructor");
		System.out.println("Print value of a:" + a);
	}

	public static void main(String[] args) {

		ConstructorConcept consobj = new ConstructorConcept();
		ConstructorConcept consobj2 = new ConstructorConcept(10);
		
	}

}
