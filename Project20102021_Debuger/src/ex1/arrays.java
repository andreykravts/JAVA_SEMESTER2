package ex1;
import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [] grades = new int[5];
		
		int i , sum, count = 0;
		double avg = 0;
		//fill array
		for(i = 0, sum = 0; i < grades.length; i++) { // put new integer in for for using that inside a block
			
			
			// check if input is right
			do {
				//input right grade
			System.out.println("Please enter grade number " + i +" : ");
			grades[i]=sc.nextInt();
			}while(grades[i]<0 || grades[i]>100); // that's mean grade ok? 0 - 100
			sum+=grades[i]; //grades[i] here its some number
			
			
			
		}
		//you need nuber like 87.87
		avg = (double)(sum/grades.length); // lenght its index of members 
		
		System.out.println("The avrage is : " + avg);
		
		//the different way
		
		for(i = 0, count = 0;  i < grades.length; i++) 
			count+=(grades[i]>avg)?1:0; 		//True false 1: 0
		
	}

}
