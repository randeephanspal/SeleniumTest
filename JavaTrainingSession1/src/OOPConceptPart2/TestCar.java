package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {

		//static polymorphism or compile time polymorphism
		//polymorphsm: 1 to many, many methods,method overriding.
		BMW b1 = new BMW();
		b1.start();
		b1.stop();
		b1.refuel();
		b1.theftsafety();
		b1.engine();
		
		System.out.println("************");
		
		Car c1 = new Car();
		c1.start(); //will call Car class method
		c1.stop();
		c1.refuel();
		//c1.theftsafety();
		
		//Top Casting
		System.out.println("##### TOP CASTING #####");
		Car c2 = new BMW();  // Dynamic polymorphism or run time polymorphism
							//child class object can be referred by parent class ref variable.
		c2.start();  //overriden method will be called
		c2.stop();
		c2.refuel();
		
		//Down Casting
		//BMW b3 = (BMW)new Car(); //ClassCastException
		
		
	}

}
