package ex1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int[] numbers = new int [25];
		
		
		//fill array numbers
		fillarray(numbers);
		
		int i;
		
		for(i = 0; i<numbers.length; i++) {
			
			System.out.println(numbers[i] +" index  is " + i);
			
		}
		
		
	}
	
	
	
	
	
	//empty array
	public static void fillarray(int[]array ) {
		Scanner sc= new Scanner(System.in);
		
		
		//input
		System.out.println("Please enter a number on place 0 ");
		array[0] = sc.nextInt();
		
		int i;
		
		for (i = 1; i<array.length; i++) {
			
			array[i]= (array[i-1])*3;
			
		}
		
		
	}
}
