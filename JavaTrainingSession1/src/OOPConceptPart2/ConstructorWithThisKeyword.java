package OOPConceptPart2;

public class ConstructorWithThisKeyword {
	
	//class var or global var
	int age;  
	String name;

	public ConstructorWithThisKeyword(int age, String name){  //age and name are local var
		System.out.println(name);
		this.age = age;    //global var = local var
		this.name = name;   //global var = local var
		System.out.println(this.age);
		System.out.println(this.name);
	}
	
	
	
	public static void main(String[] args) {

		ConstructorWithThisKeyword conob = new ConstructorWithThisKeyword(10, "Tom");
		
		
	}

}
