package classwork2;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		int [] arr = new int [10];

	}
		public static void fillArrayRandom(int[] arr) {
			Random rnd = new Random();
			
			int i;
			
			
			for(i=0; i<arr.length;i++) {
				arr[i] = rnd.nextInt()%10; //  4445 % 10 = 5  // max random
				//arr[i] = rnd.nextInt(int bound);
		}

}
}