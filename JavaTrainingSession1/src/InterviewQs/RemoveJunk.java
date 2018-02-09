package InterviewQs;

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "*&%$# Selenium Webdriver !@#";
		
		//RegularExpression: [^a-zA-z0-9]

		s = s.replaceAll("[^a-zA-z0-9]", "");
		
		System.out.println(s);
		
		String s1 = "!@#% QTP *& )( JAVA";
		s1 = s1.replaceAll("[^a-zA-z0-9]", "");
				System.out.println(s1);
		
	}

}
