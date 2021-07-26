package Collection;

import java.util.HashMap;

public class SearchAKeyInHashMap {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "ANUJA");
        hm.put("second", "PUJA");
        hm.put("third","BINA");
        System.out.println(hm);
        if(hm.containsKey("first")){
            System.out.println("The hashmap contains key first");
        } else {
            System.out.println("The hashmap does not contains key first");
        }
        if(hm.containsKey("fifth")){
            System.out.println("The hashmap contains key fifth");
        } else {
            System.out.println("The hashmap does not contains key fifth");
        }
    }


	}


