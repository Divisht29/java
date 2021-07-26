package Collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class GetSubsetFromSortedSet {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new MyStrComp());
        ts.add("ARPITA");
        ts.add("BINA");
        ts.add("POJA");
        ts.add("BONNY");
        ts.add("ABHI");
        ts.add("MAINU");
        System.out.println(ts);
        Set<String> subSet = ts.subSet("BINA", "PUJA");
        System.out.println("sub set: "+subSet);
        subSet = ts.subSet("BINA", true, "PUJA", true);
        System.out.println("sub set: "+subSet);
        subSet = ts.subSet("BINA", false, "PUJA", true);
        System.out.println("sub set: "+subSet);
    }
}
 
class MyStrComp implements Comparator<String>{
	 public int compare(String str1, String str2) {
	        return str1.compareTo(str2);
	    }
	     
	


	}


