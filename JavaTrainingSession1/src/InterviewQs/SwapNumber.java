package InterviewQs;

public class SwapNumber {

	//swap number without third variable
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		a = a + b; //30
		b = a - b; //20
		a = a - b;
		
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		

	}

}