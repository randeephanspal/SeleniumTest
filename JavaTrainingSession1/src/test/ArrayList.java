package test;

import java.util.ArrayList;

public class ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		//ar.add("Tony");
		
		System.out.println(ar.size());
		System.out.println(ar.get(2));
	}
}

}
