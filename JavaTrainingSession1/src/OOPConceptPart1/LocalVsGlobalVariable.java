//3
package OOPConceptPart1;

public class LocalVsGlobalVariable {

	//Global variable -- class var
	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		
		int i = 10;  //**local var for main method & scope of i is within main method
		System.out.println(i);
		
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.sum();

	}
	
	public void sum(){
		int i = 50; //**local var for sum method & scope of i is within sum method
					//i cannot be given as i=50;
		//i=70;
		int j = 20;
		age = 30;    //can also be given as int age=30;
		System.out.println(age);
		System.out.println(i);

	}

}