import java.util.AbstractCollection;
import java.util.*;

// It is used to implement an unmodifiable collection, for which one needs to only extend 
 //this AbstractCollection Class and implement only the iterator and the size methods.


public class Main {

	public static void main(String[] args) {
		
		AbstractCollection<Object> abs = new ArrayList<Object>();
		
		abs.add(1);
		abs.add(2);
		abs.add(3);
		abs.add(4);
		
		System.out.println("Abstract Collection:" +abs);
		//this will clear all abstract collection data
		abs.clear();
		System.out.println("Is abstract collection is empty: "+abs.isEmpty());
	}

}
