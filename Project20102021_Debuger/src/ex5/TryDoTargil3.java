package ex5;
import java.util.Scanner;

public class TryDoTargil3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array index : ");
		int index_array;
		index_array = sc.nextInt();

		double[] numbers = new double[index_array];

		// fillArray
		fillarray(numbers);

		// SumArray
		System.out.println(SumArray(numbers));

	}

	public static void fillarray(double[] array) {

		Scanner sc = new Scanner(System.in);

		int i;
		for (i = 0; i < array.length; i++) {
			System.out.println("Please enter a number that gona be placed on index num : " + (i + 1) + " ");
			array[i] = sc.nextInt();
		}
	}

	public static int SumArray(double[] array) {

		int sum, i;
		for (i = 0, sum = 0; i < array.length; i++) {
			System.out.println("Please enter a number that gona be placed on index num : " + (i + 1) + " ");
			sum += array[i];
		}
		return sum;

	}
}
