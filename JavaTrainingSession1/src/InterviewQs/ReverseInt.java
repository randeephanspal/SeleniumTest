package InterviewQs;

public class ReverseInt {

	public static void main(String[] args) {
		
		int num = 12345;
		
		//1. Using while loop
		int rev=0;
		
		while(num!=0){
			rev = rev*10+num % 10;
			num=num/10;
		}
		System.out.println("Reverse number:" +rev);	
		
		//2. using StringBuffer method
		long num1=12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
}

}
