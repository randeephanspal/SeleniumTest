package test;

public class Overloading {
	
	int i=10;
	int j=20;

	public static void main(String[] args) {

		Overloading ov = new Overloading();
		ov.sum();
		
		int kj = ov.sum(450);
		System.out.println(kj);
		
		double kk = ov.sum(60.40);
		System.out.println(kk);
	}
	
	public void sum(){
		System.out.println(i+j);
	}
	
	public int sum(int i){
		int j=40;
		//int i=45;
		int k = i+j;
		return k;
	}
	
	public double sum(double a){
		double b=40.60;
		double l = a+b;
		return l;
	}

}
