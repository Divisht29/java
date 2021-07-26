package Collection;

import java.util.HashMap;

public class DeleteAllELementsFromHashmap {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "divisht");
        hm.put("second", "kumar");
        hm.put("third","adlakha");
        System.out.println("My HashMap content:");
        System.out.println(hm);
        System.out.println("Clearing HashMap:");
        hm.clear();
        System.out.println("Content After clear:");
        System.out.println(hm);
    }



	}


