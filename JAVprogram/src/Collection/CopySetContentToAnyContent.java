package Collection;

import java.util.HashSet;

public class CopySetContentToAnyContent {

	public static void main(String[] args) {
HashSet<String> hs=new HashSet<String>();
		
		hs.add("Arpita");
		hs.add("Pratiksha");
		hs.add("Neha");
		hs.add("Bina");
		System.out.println(hs);
		HashSet<String> subset=new HashSet<String>();
		subset.add("Niharika");
		subset.add("Divist");
		hs.addAll(subset);
		System.out.println("Hashset content after adding another collections: ");
		System.out.println(hs);
	}



	}


