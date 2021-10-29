package classwork;

import java.util.Random;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int [] arr = new int[10];
		int i;
		
		
		for(i=0; i<arr.length;i++) {
			arr[i] = rnd.nextInt()%10; //  4445 % 10 = 5  // max random
			//arr[i] = rnd.nextInt(int bound);
		}
		for(i=0; i<arr.length;i++) {
			arr[i] = rnd.nextInt(10); // only olus positive bound make a board 0-n only positive
			}
		
	}

}
