package CollectionsSession;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>(); //added generic in the form of String
		
		//add
		ll.add("test");
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("RPA");
		
		//print contents of Linkedlist
		System.out.println("Contents of Linkedlist"+ ll);
		
		//addfirst
		ll.addFirst("Randeep");
		
		//addlast
		ll.addLast("Automation");
		System.out.println("Contents of Linkedlist"+ ll);
		
		//get value by index:
		System.out.println(ll.get(0));
		//set
		ll.set(3, "Introduction");
		System.out.println("Contents of Linkedlist"+ ll);
		
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of Linkedlist"+ ll);
		 	
		//remove by index
		ll.remove(2);
		System.out.println("Contents of Linkedlist"+ ll);
		
		//print all the values of LinkedList
		//for loop
		//advance loop
		//Iterate
		//while loop
		
		//for loop
		System.out.println("**Print contents using for loop**");
		for(int i=0; i<ll.size(); i++){
			System.out.println(ll.get(i));
		}
		
		//advance for loop
		System.out.println("**Print contents using advance for loop**");
		for(String str : ll){
			System.out.println(str);
		}
		
		//Iterator
		System.out.println("**Print contents using Iterator**");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//while loop
		System.out.println("**Print contents using while loop**");
		int j = 0;
		while(j < ll.size()){
			System.out.println(ll.get(j));
			j++;
		}
	}

}
