package test;

public class CallBy {

	int p;
	int q;
	
	public static void main(String[] args) {


		CallBy cobj = new CallBy();
		
		int total = cobj.sum(20, 40); //call by value
		System.out.println(total);
		
		cobj.p=45;
		cobj.q=54;
		
		cobj.sumref(cobj);
		System.out.println(cobj.p);
		System.out.println(cobj.q);
		
	}

	
	public int sum(int a, int b){  //call by value
		int t = a+b;
		return t;
	}
	
	public void sumref(CallBy tempobj){
		int temp;
		temp = tempobj.p;
		tempobj.p=tempobj.q;
		tempobj.q=temp;
	}
	
	
}
