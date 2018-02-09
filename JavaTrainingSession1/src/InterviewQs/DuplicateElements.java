package InterviewQs;

public class DuplicateElements {

	public static void main(String[] args) {

		String names[] = {"Java","Python","C++","Java","Ruby"};
		
		//1. compare each element O(n*n)-- worst soln-- due to loops it take time for exec
		for(int i=0; i<names.length; i++){
			for(int j=i+1; j<names.length; j++){
				if(names[i].equals(names[j])){
					System.out.println("Duplicate element is"+names[i]);
				}
				
			}
		}
		
		//2.using HashSet
		
		//3. using HashMap
		//get the values from this HashMap
		
	}

}
