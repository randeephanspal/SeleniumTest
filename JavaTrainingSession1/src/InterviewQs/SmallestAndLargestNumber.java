//Largest and smallest no in an array

package InterviewQs;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {

		int numbers[] = {44,55,33,22,66,7,26};
		
		int smallest = numbers[0];
		int largest = numbers[0];
		//Time complexity =O(n)
		
		for(int i=1; i<numbers.length; i++){
			if(numbers[i]>largest){
				largest = numbers[i];
			}
			else if(numbers[i]<smallest){
				smallest = numbers[i];
			}
		}
		System.out.println("Largest::"+ largest);
		System.out.println("Smallest::"+ smallest);
		
		
	}

}
