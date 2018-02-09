//1
package OOPConceptPart1;

public class Car {
	
	// Class variable/global var
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		
		// a,b,c is object reference var
		//new Car() is the object of Car class
		// new keyword is used to create the object
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel = 4;
	
		b.mod = 2017;
		b.wheel = 4;
		
		c.mod = 2018;
		c.wheel = 4;
		
		System.out.println("before assigning the references");
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		// Part7
		System.out.println("after assigning the references");
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod);  //10
		c.mod = 20;
		System.out.println(a.mod);	//20
		System.out.println(c.mod);  //20
		
		
	}

}
