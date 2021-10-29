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
		
		int i;
		
		for(i = 0; i<numbers.length; i++) {
			
			System.out.println(numbers[i] +" index  is " + i);	
			
		}
		
		
		//part3
		
		
		
		System.out.println("The num of same numbers is : "+ Ex3());

		
	}
	
	
	

	public static int Ex3(){
		///PART C
		
		Scanner sc= new Scanner(System.in);
		
		
		int n1,n2;
		
		System.out.println("Please enter a num of index of array a");
		
		n1 = sc.nextInt();
		
		double[] a = new double [n1];
		
		System.out.println("Please enter a num of index of array b");
		
		n2 = sc.nextInt();
		
		double[] b = new double [n2];
		
		
		
		//fill array a
		System.out.println("Please enter a num on index of array a");
		fillarray(a);
		
		//fill array b
		System.out.println("Please enter a num on index of array b");
		fillarray(b);
		
		
		//part of looking on similar numbers
		int i,j ,counter;
		
		for( i=0, counter = 0; i<a.length; i++ ) {
		
		for( j=0; j<b.length; j++ ) {
			
			if(a[i] == b[j] ) {
				counter++;
			}
			
		}
		
		}
		return counter;
	}

	
	
	
	
	
	//fill array
	public static void fillarray(double[]array ) {
		Scanner sc= new Scanner(System.in);
		
		
			//input
		
			int i;
		
			for (i = 0; i<array.length; i++) {
			
			System.out.println("Please enter a number on place :  "+ i+"  ");
			
			//check if input number is positive
			do {
				
			array[i]= sc.nextDouble();
			
			}while(array[i]<0);
			
		}
		
		
	}
}
