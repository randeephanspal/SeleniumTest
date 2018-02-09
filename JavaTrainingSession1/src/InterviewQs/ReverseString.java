//Reverse a String
//Diff betn String and StringBuffer
//A. 1. String is immutable whereas StringBuffer is mutable.
// 2.String doesnt hv reverse fn whereas SB has reverse fn
//Do we have reverse fn in String? No, String is immutable 

package InterviewQs;

public class ReverseString {

	public static void main(String[] args) {
		
		//String is immutable object.

		String s = "Selenium";
		
		
		//1. Using for loop:
		//System.out.println(s.charAt(0));
		
		int len = s.length();  //8
		//System.out.println(len);
		
		String rev="";
		
		for(int i=len-1; i>=0; i--){
			rev = rev + s.charAt(i);	
		}
		System.out.println(rev);
		
		//2. using StringBuffer class
		//StringBuffer is JAVA class
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
	}

}
