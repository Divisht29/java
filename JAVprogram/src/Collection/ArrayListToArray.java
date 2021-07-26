package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<String>();
		String[] arrayvalues=new String[fruits.size()];
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grape");
		
		System.out.println("From arraylist: "+fruits);
		arrayvalues=fruits.toArray(arrayvalues);
		
		System.out.println("to array: "+Arrays.toString(arrayvalues));
		
	}





	}


