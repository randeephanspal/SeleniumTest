package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if(a>b){
			System.out.println("a is greater");
		}
		else{
			System.out.println("b is greater than a");
		}
		
		// comparison operators
		// <=, >=, ==, !=, <, >
		
		int c=30;
		int d=40;
		
		if(c==d){
			System.out.println("c and d are equal");
		}
		else{
			System.out.println("c and d are not equal");
		}
	

	// logic to find the highest number
	
		int a1=500;
		int b1=400;
		int c1=300;
		
		if(a1>b1 & a1>c1){
			System.out.println("a1 is greater than b1 and c1");
		}
		else if(b1>c1){
			System.out.println("b1 is greatest");
		}
		else{
			System.out.println("c1 is the greatest");
		}
	}
}
