package CollectionsSession;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		int a[] = new int[3]; //static array--size is fixed
		
		//dynamic array -- ArrayList
		//1. It can contain duplicate values
		//2. It maintains insertion order
		//3. Synchronized
		//4. random access to fetch any element
				
		ArrayList ar = new ArrayList();
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		ar.add(40);//3
		ar.add(40);//4  -duplicate values can be stored
		ar.add(12.33);
		ar.add("Test");
		ar.add(true);
		
		System.out.println(ar.size()); //size of array
				
		System.out.println(ar.get(3)); //get the value from index
		
		//print all the values from arraylist
		//2 ways: 1.for loop   2. Iterator
		
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));	
		}
		
		//non generic vs generic
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); //This is generic
		ar1.add(100);
		//ar2.add("Test");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Test");
		ar2.add("Selenium");
		
		ArrayList<E> ar3 = new ArrayList<E>(); //not sure which value is going to come.
		
		//Addall()
		System.out.println("***Trying Addall***");
		
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("QTP");
		ar4.add("UFT");
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("ROBOT");
		ar5.add("SoapUI");
		
		ar4.addAll(ar5);
		
		for(int i=0; i<ar4.size(); i++){
			System.out.println(ar4.get(i));
		}
		
		//removeall()
		System.out.println("***Trying removAll***");
		ar4.removeAll(ar5);
		for(int i=0; i<ar4.size(); i++){
			System.out.println(ar4.get(i));
		}
		
		//Employee class object
		System.out.println("***Employee object***");
		
		Employee e1 = new Employee("Nav", 27, "Testing");
		Employee e2 = new Employee("Ragu", 30, "TechOps");
		Employee e3 = new Employee("Abhi", 28, "Developer");
		
		//Create ArrayList
		ArrayList<Employee> ar6 = new ArrayList<Employee>();
		ar6.add(e1);
		ar6.add(e2);
		ar6.add(e3);
		
		//iterator to traverse value
		Iterator<Employee> it = ar6.iterator();
		while(it.hasNext()){
			Employee emp = it.next();
			System.out.println(emp.name);
			//System.out.println(emp.age);
			//System.out.println(emp.dept);
		}		
				
	}

}
