package InterviewQs;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "The rains have started here";
		
		System.out.println(str.length()); //len of str
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s')); //8  -- find index of(1st occurence of 's')
		
		System.out.println(str.indexOf('s', 9)); //OR  //2nd occurance of 's'
		System.out.println(str.indexOf('s', str.indexOf('s')+1));  //2nd occurance of 's'
		
		System.out.println(str.indexOf("have")); //10
		
		System.out.println(str.indexOf("hello")); //-1
		
		//string comparison
		String str1 = "The rains have started here";
		String str2 = "The Rains have Started Here";
		System.out.println(str.equals(str1)); //true
		System.out.println(str.equalsIgnoreCase(str2));
		
		//substring
		System.out.println(str.substring(0,9)); //same as slicing, str[0:9]
		
		//trim: before space and after space
		String str3 = "  Hello World  ";
		System.out.println(str3.trim()); //Hello World
		System.out.println(str3.replace(" ", ""));//HelloWorld
		
		String date = "12-12-2018"; //replace - with /
		System.out.println(date.replace("-", "/"));  //12/12/2018
		
		//split:
		System.out.println("**Using split**");
		String test = "Hello_World_Test_Selenium";
		String testval[] = test.split("_");
		for(int i=0; i<testval.length; i++){
			System.out.println(testval[i]);
		}
		
		//concat
		System.out.println(str.concat(str3));
		
		
	}

}
