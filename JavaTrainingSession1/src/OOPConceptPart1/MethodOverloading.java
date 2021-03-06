//4
package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10.10);
		obj.sum(20, 40);
		
	}
	
	public static void main(int w){
		
	}
	
	public static void main(int e, int r){
		
	}

	// we can overload main method also.
	// Not Allowed:
	//1. you can not create method inside the method.
	//2. duplicate methods -- i.e same method name with same no of datatypes are not allowed.
	
	
	//Method Overloading: when the method name is same with diff arguments or 
	//input params(diff datatypes) within the same class.
		
	public void sum(){  //no input params
		System.out.println("Sum Method--zero input params");
	}
	
	public void sum(int i){  //1 input params
		System.out.println("Sum method--1 input params");
		System.out.println(i);
	}
		
	public void sum(double d){  //1 input params
		System.out.println("Sum method--1 input params");
		System.out.println(d);
	}
	
	public void sum(int j, int k){ //2 input params
		System.out.println("Sum method--2 input params");
		System.out.println(j+k);
		
	}
}
