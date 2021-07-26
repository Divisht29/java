package arrayProgram;

import java.util.Scanner;

public class IndexOfEvenAndOddNumber {

	public static void main(String[] args) {
	

		    int x[] = new int[4];
		    Scanner input = new Scanner(System.in);

		    for(int i = 0; i < x.length ; i++){
		        System.out.println("Enter a number: ");
		        x[i] = input.nextInt();
		    }


		    System.out.println("Average of even numbers: " + getAverage(x));
		    System.out.println("Average of odd numbers: " + getAverage(x));

		 }

		public static int getAverage(int a[]){
		    int add_even = 0;
		    int counter_even = 0;
		    int average_even = 0;

		    int add_odd = 0;
		    int counter_odd = 0;
		    int average_odd = 0;


		    for(int i = 0; i < a.length; i++){
		        if(a[i] % 2 == 0){
		            add_even += a[i];
		            counter_even++;
		        }
		        else if(a[i] % 2 == 1) {
		            add_odd += a[i];
		            counter_odd++;
		        }

		    }

		    if (add_even % 2 == 1 && add_odd % 2 == 1){
		    average_even = 0;
		    average_odd = add_odd / counter_odd;

		    return average_even;
		   }
		   else if (add_even % 2 == 0 && add_odd % 2 == 0){
		    average_even = add_even / counter_even;
		    average_odd = 0;

		    return average_even;
		    }
		   else{

		    average_even = 0;
		    average_odd = add_odd / counter_odd;

		    return average_odd;

		    }


		} 

	}


