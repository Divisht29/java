package Collection;

import java.util.HashMap;

public class CopyMapContentToAnotherHashMaP {

	public static void main(String[] args) {
		HashMap<String, String> hr = new HashMap<String, String>();
        //add key-value pair to hashmap
        hr.put("first", "DEV");
        hr.put("second", "AJAY");
        hr.put("third","ASHU");
        System.out.println(hr);
        HashMap<String, String> subMap = new HashMap<String, String>();
        subMap.put("s1", "ANUJ");
        subMap.put("s2", "KAMLESH");
        hr.putAll(subMap);
        System.out.println(hr);
    }



	}

