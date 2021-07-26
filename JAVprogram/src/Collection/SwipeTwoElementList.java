package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwipeTwoElementList {

	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		name.add("kumar");
		name.add("pratiksha");
		name.add("niharika");
		name.add("shruti");
		
		System.out.println("Before Swapping:"+name);
		Collections.swap(name, 2, 3);
		System.out.println("After Swapping:"+name);
		

	}



	}


