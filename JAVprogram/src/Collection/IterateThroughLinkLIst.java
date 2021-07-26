package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateThroughLinkLIst {

	public static void main(String[] args) {
LinkedList<String> ar=new LinkedList<String>();
		
		ar.add("Arpita");
		ar.add("Pratiksha");
		ar.add("Niharika");
		ar.add("Divist");
		
		Iterator<String> itr=ar.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
}


	}


