package Collection;

import java.util.TreeMap;

public class CopyMapContentToTreeMAP {

	public static void main(String[] args) {
		 TreeMap<String, String> hm = new TreeMap<String, String>();
	        //add key-value pair to TreeMap
	        hm.put("first", "DIVISHT");
	        hm.put("second", "POONAM");
	        hm.put("third","LANKESH");
	        System.out.println(hm);
	        TreeMap<String, String> subMap = new TreeMap<String, String>();
	        subMap.put("s1", "RAJU");
	        subMap.put("s2", "DEV");
	        hm.putAll(subMap);
	        System.out.println(hm);
	    }
	


	}


