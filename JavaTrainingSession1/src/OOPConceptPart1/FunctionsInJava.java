//2
//Methods or functions in JAVA

package OOPConceptPart1;

public class FunctionsInJava {

	//main method: starting point of execution
	public static void main(String[] args) {
		
		//fnj is reference variable
		FunctionsInJava fnj = new FunctionsInJava();
		//after creating the object, the copy of non static methods will be given to this object
		
		
		fnj.test();
		
		int c1;
		c1 = fnj.pqr();
		System.out.println(c1);
		
		String s1 = fnj.qa();
		System.out.println(s1);

		int d1;
		d1 = fnj.division(9, 3);
		System.out.println(d1);
	}
		
	// non static methods: test(), pqr(),qa()
	// return type = void: doesnot return any value
	public void test(){  //no input, no output
		System.out.println("test Method");
	}
	
	//return type = int
	public int pqr(){   // no input, some output
		System.out.println("PQR Method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;			
	}
	
	//return type is String
	public String qa(){  // no input, some output
		System.out.println("QA Method");
		String s = "Selenium";
		return s;		
	}

	//x,y are input parameters/arguments
	//return type is int
	public int division(int x, int y){
		System.out.println("Division Method");
		int d = x/y;
		return d;

	}
}
