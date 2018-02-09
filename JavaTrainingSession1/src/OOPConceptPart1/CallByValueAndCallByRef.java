package OOPConceptPart1;

public class CallByValueAndCallByRef {
	int p;
	int q;

	public static void main(String[] args) {
	
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x=20;
		int y=30;
		int z = obj.testSum(x, y); //call by value or pass by value
		System.out.println(z);
		
		obj.p=50;
		obj.q=60;
		//System.out.println(obj);
		
		System.out.println("**********");
		System.out.println("Before Swap");
		System.out.println(obj.p);
		System.out.println(obj.q);
		obj.swap(obj);
		//After swap
		System.out.println("After Swap");
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		
	}

	public int testSum(int a, int b){
			int c = a+b;
			return c;
		}
		
	//call by ref
	public void swap(CallByValueAndCallByRef t){
		int temp;
		temp=p;
		p=q;
		q=temp;	
		
	}
		
	

}
