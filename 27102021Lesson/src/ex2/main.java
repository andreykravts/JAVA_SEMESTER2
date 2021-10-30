//authors Andrey Kravtsov and Roman Popadiuk 
//class 46-5 programming




package ex2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		
		//input num array of index 
		
		int n;
		
		System.out.println("Please enter a num of index ");
		
		n = sc.nextInt();
		
		double[] numbers = new double [n];
		
		
		//fill array numbers
		fillarray(numbers);
		
		
		//Print array
		//here we call function that gonna print array
		
		PrintArray(numbers);
		
		
		//how many members in array A there is a SQUARE in array B and verso?? The answer is:
		
		CreateTwoArray_A_B();
		
	}
	
	// this function will print a numbers that contain into array
	public static void PrintArray(double[] array) {
		
		int i;
		
		for(i = 0; i<array.length; i++) {
			
			System.out.println(array[i] +" index  is " + i);	
			
		}
	}
	
	
	

	public static void CreateTwoArray_A_B(){
		///PART C
		
		Scanner sc= new Scanner(System.in);
		
		
		// user input  lenght of index of array a
		
		int n1,n2;
		
		System.out.println("Please enter a lenght of index of array a");
		
		n1 = sc.nextInt();
		
		double[] a = new double [n1];
		
		
		// user input  lenght of index of array b
		
		System.out.println("Please enter a  lenght of index of array b");
		
		n2 = sc.nextInt();
		
		double[] b = new double [n2];
		
		
		
		//fill array a
		
		System.out.println("Please enter a user input numbers that array A will store");
		fillarray(a);
		
		//fill array b
		
		System.out.println("Please enter a user input numbers that array B will store");
		fillarray(b);
		
		
		//The function must calculate and return to how many members in array A there is a SQUARE in array B
		//and SAME FOR ARRAY B TO ARRAY A.
		//But for reverse result we must run the same procedure again but change palse of operators ARRAY A AND ARRAY B
		
		//ARRAY A TO ARRAY B
		//also we will want to print result into main function
		System.out.println("how many members in array A there is a SQUARE in array B? The answer is : "+how_many_members_in_array_A_is_a_SQUARE_in_array_B(a,b));
		
		//ARRAY B TO ARRAY A
		//also we will want to print result into main function
		System.out.println("how many members in array B there is a SQUARE in array A? The answer is : "+how_many_members_in_array_A_is_a_SQUARE_in_array_B(b,a));
		

	}
	
	
	
	
	
	public static int how_many_members_in_array_A_is_a_SQUARE_in_array_B(double[]a,double[]b){
		
		//The function must calculate and return to how many members in array A there is a SQUARE in array B
		//and SAME FOR ARRAY B TO ARRAY A. 
		
		int i, //iterator for cycle 'for '
			j , //iterator for second cycle 'for '
			counter; //counter that will catch similar numbers
		
		//the idea of this block say lets take first number of array A and
		//check if it have square of this number in array B
		
		for( i=0, counter = 0; i<a.length; i++ ) {
		
			for( j=0; j<b.length; j++ ) {
					

					if(a[i] == Math.sqrt(b[j]) ) {  
						counter++;
					}
			}
		
		}
		return counter; 
		
		// so this return wiil give us result on checking  
		//to how many members in array A there is a SQUARE in array B
		// for getting result of reverse task 
		////to how many members in array B there is a SQUARE in array A
		//we must use this function again
	}

	
	
	
	
	
	//fill array
	public static void fillarray(double[]array ) {
		Scanner sc= new Scanner(System.in);
		
		
			//input
		
			int i;
		
			for (i = 0; i<array.length; i++) {
			
			System.out.println("Please enter a number on place : "+ i+" your input is :  ");
			
			//check if input number is positive
			do {
				
			array[i]= sc.nextDouble();
			
			}while(array[i]<0);
			
		}
		
		
	}
}
