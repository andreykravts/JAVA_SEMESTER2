//authors Andrey Kravtsov and Roman Popadiuk 
//class 46-5 programming

package ex1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// CRATING ARRAY with length 25
		int[] numbers = new int [25];  
		
		
		//fill array numbers
		fillarray(numbers);
		
		//iterator for cycle for
		int i;
		
		//print a numbers that store into the array
		Printarray(numbers);
		
		
	}
	
	//this function need for print a numbers that store into the array
	
	public static void Printarray(int[]array) {
		
		//iterator for cycle for
		
		int i;
		
		for(i = 0; i<array.length; i++) {
			//print number and position into array
			System.out.println(array[i] +" index  is " + i);
			
		}
	}
	
	
	
	
	//
	//this function need for  get empty array and fill it with user input numbers
	public static void fillarray(int[]array ) {
		Scanner sc= new Scanner(System.in);
		
		
		//user input the first number of the array
		System.out.println("Please enter a number on place 0 ");
		array[0] = sc.nextInt();
		//iterator for cycle for
		int i;
		
		//cycle
		for (i = 1; i<array.length; i++) {
			
			//here we put number into array with sequance: next number = previous number* 3
			array[i]= (array[i-1])*3;
			
		}
		
		
	}
}
