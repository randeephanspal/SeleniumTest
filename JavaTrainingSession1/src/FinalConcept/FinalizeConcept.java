package FinalConcept;

public class FinalizeConcept {
	
	//finalize is called before gc to cleanup the processing of the object
	//finalize method is automatically called. 
	public void finalize(){  
		System.out.println("finalize method");
	}

	public static void main(String[] args) {

		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1=null;
		f2=null;
		
		System.gc(); //call the gc
	}

}
