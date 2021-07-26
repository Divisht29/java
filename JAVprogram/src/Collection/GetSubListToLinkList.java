package Collection;

import java.util.ArrayList;
import java.util.List;

public class GetSubListToLinkList {

	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		name.add("Arun");
		name.add("pratiksha");
		name.add("prakash");
		name.add("divist");
		
		System.out.println("LinkedList: "+name);
		
		List<String> sublist=name.subList(0, 2);
		
		System.out.println("sublist "+ sublist);
		
	}
	



	}


