package OOPConceptPart1;

//5
public class StaticAndNonstaticConcept {

//global vars: the scope of global vars will be available across all the fns with some conditions.
//conds like: if it is static then we call directly or by classname, if it is nonstatic then mthod and var can be called by object.
	
	String name = "Tom";  // non static global var
	static int age = 25;  //static global var
	
	public static void main(String[] args) {
		
		//how to call static methods and vars?
		//1. direct call
		sum(); 
		//2. calling by classname
		StaticAndNonstaticConcept.sum();
		
		//calling static vars by 2 ways:
		System.out.println(age);
		System.out.println(StaticAndNonstaticConcept.age);
		
		//calling non static methods and var by creating new object
		StaticAndNonstaticConcept obj = new StaticAndNonstaticConcept();
		
		obj.sendMail();
		System.out.println(obj.name);
		
		//Q. can i access static methods and var using object reference?
		//A. Yes, but that is not the good practise.
		obj.sum();
		
	}

	public void sendMail(){  //non static method
		 System.out.println("send mail method");
	}
	
	public static void sum(){  //static method
		System.out.println("Sum method");
	}
	
}
