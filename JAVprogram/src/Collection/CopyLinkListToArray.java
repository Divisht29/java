package Collection;

import java.util.ArrayList;
import java.util.List;

public class CopyLinkListToArray {

	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		name.add("Ankita");
		name.add("rajaa");
		name.add("renu");
		name.add("divist");
		
		System.out.println("LinkedList: "+name);
		String[] stringvalues=new String[name.size()];
		
		//linked list element copy to array
		
		name.toArray(stringvalues);
		//get value from stringvalues 
		
				System.out.println("Arraylist elements are-----");
				for(String value:stringvalues) {
					System.out.println(value);
				}

}



	}


