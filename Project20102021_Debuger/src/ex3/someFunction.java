package ex3;
import java.util.Scanner;
public class someFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GO");
		
		double [] numbers = new double[100];
		
		//fikkArray
		fillarray(numbers);
	
	}
	
	//function that we can use for while again and again
	public static void fillarray(double [] array) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		for(i = 0; i<array.length; i++) {
			System.out.println("Please enter a number");
			array[i]=1+i;
		}
		
	}

}
