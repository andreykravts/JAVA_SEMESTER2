package ex2;
import java.util.Scanner;
public class arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double [] numbers = new double[100];
		int i,j;
		for(i = 0; i<numbers.length; i++)
		numbers[i]=1+i;
		
		for(j = numbers.length-1; j> 0 ; j--)  //last indexx is numbers.length-1 == 0-99 last index is 99
			System.out.println(numbers[j]);
	}

}
