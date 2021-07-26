package arrayProgram;

import java.util.Scanner;

public class SumOfAllEvenIndex {

	public static void main(String[] args) {
		int number, sumEven = 0, sumOdd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of elements in an array: ");
		number = sc.nextInt();
		int[] arrNumbers = new int[number];
		System.out.println("Please enter elements of the array: ");
		for(int a = 0; a < number; a++)
		{
			arrNumbers[a] = sc.nextInt();
		}
		for(int a = 0; a < number; a++)
		{
			if(arrNumbers[a] % 2 == 0)
			{
				sumEven = sumEven + arrNumbers[a];
			}
			else
			{
				sumOdd = sumOdd + arrNumbers[a];
			}
		}
		System.out.println("Sum of even numbers in an array: " + sumEven);
		System.out.println("Sum of odd numbers in an array : " + sumOdd);
		sc.close();
	}

}


