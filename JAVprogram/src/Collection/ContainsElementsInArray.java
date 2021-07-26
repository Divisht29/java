package Collection;

import java.util.ArrayList;
import java.util.List;

public class ContainsElementsInArray {

	public static void main(String[] args) {
		List<String> city=new ArrayList<String>();
		city.add("jaipur");
		city.add("delhi");
		city.add("gurgaon");
		city.add("haidrabad");
		
		//to check city (delhi) is in list or not
		if(city.contains("guwahati")) {
			System.out.println("guwahati is available in list");
		}else {
			System.out.println("not available");
		}
		

}


	}


