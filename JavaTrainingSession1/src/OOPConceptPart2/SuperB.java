package OOPConceptPart2;


//super keyword is used to call parent class constructor with arg, 
//if super not mentioned then default const is called
//it should always be the first stmt

public class SuperB extends SuperA{

	public SuperB(){
		//super(10);
		System.out.println("In SuperB child class");
	}
	
	
	public static void main(String[] args) {

		SuperB sb = new SuperB();
		
	}

}
