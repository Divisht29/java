package arrayProgram;

//public class SumOfAllElementsFrom1stHalf {

	import java.util.*;
	 
	class GFG
	{                                                          
	 
	public static void sum_of_elements(int []arr,
	                                   int n)
	{
	    int sumfirst = 0, sumsecond = 0;
	     
	    for (int i = 0; i < n; i++)
	    {
	         
	        // Add elements in first half sum
	        if (i < n / 2)
	        {
	            sumfirst += arr[i];
	        }
	         
	        // Add elements in the second half sum
	        else
	        {
	            sumsecond += arr[i];
	        }
	    }
	     
	    System.out.println("Sum of first half elements is " +
	                                             sumfirst);
	     
	    System.out.println("Sum of second half elements is " +
	                                            sumsecond);
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    int []arr = { 20, 30, 60, 10, 25, 15, 40 };
	    int n = arr.length;
	     
	    // Function call
	    sum_of_elements(arr, n);
	}
	}
