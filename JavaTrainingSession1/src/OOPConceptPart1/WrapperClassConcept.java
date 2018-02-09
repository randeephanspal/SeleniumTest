//6
package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);
		
		//data conversion: String to int: use wrapper class called concept
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer,Boolean,String,char
		
		//String to double conversion
		String y = "12.33";
		double z = Double.parseDouble(y);
		System.out.println(z+10);
		
		//String to char: no char parsing
		
		//String to boolean
		String k="true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		System.out.println("**************");
		//int to String conversion
		int j = 200;
		System.out.println(j+20);  //220
		String s = String.valueOf(j);  //"200"
		System.out.println(s+20);  //20020
		
		//Note: String to int
//		String u = "100A"; //string is not a pure numeric value
//		int t = Integer.parseInt(u); // Number format Exception
//		System.out.println(u);
		
		
		
		
	}

}
