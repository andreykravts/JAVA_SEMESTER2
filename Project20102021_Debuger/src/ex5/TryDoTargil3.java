package ex5;
import java.util.Random;
import java.util.Scanner;


public class TryDoTargil3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array index : ");
		int index_array;
		index_array = sc.nextInt();

		double[] numbers = new double[index_array];

		//fill Array With Random
		//fillArrayRandom(numbers); // check
		
		// fillArray
		fillarray(numbers);

		// SumArray
		System.out.println("Sum numbers into array "+SumArray(numbers));
		
		//AvgArray
		System.out.println("Avg is =  "+AvgArray(numbers));
		
		//MaxNumArray
		System.out.println("Max num into array is : "+ MaxNumArray(numbers));
		
		//place of max number into array
		System.out.println( "Max num place holder into array is : "+PlaceMaxNumIntoArray(numbers));
		
		//MinNumArray
		System.out.println("Min num into array is : "+ MinNumArray(numbers));
		
		
		//place of min number into array
		System.out.println( "Min num place holder into array is : "+PlaceMinNumIntoArray(numbers));
		
		
		//how much times this number repeats in array
		System.out.println(" Please enter a nuber that you want to cheke");
		//input number that use want to check/ find
		int num;
		num=sc.nextInt();
		System.out.println( "This number repeats into array is : "+HowMuchTimesRepeatsANumberArray(numbers,num)+" times ");
		
		// if you have array with random numbers
		//and you want to know what is a number repeats more than other in your array
		//you will get this number with help that function
		System.out.println( "This number repeats into array is more times then other : "+HowMuchTimesRepeatsANumberArray(numbers));
		
	}

	//fillarray
	
	public static void fillarray(double[] array) {

		Scanner sc = new Scanner(System.in);

		int i;
		for (i = 0; i < array.length; i++) {
			System.out.println("Please enter number for index : "+ (i) + " ");
			array[i] = sc.nextInt();
		}
	}
	
	//fillarray with random
	public static void fillArrayRandom(int[] arr) {
		Random rnd = new Random();
		
		int i;
		
		
		for(i=0; i<arr.length;i++) {
			arr[i] = rnd.nextInt()%10;
	}
	}
	
	//sumarray
	
	public static int SumArray(double[] array) {

		int sum, i;
		for (i = 0, sum = 0; i < array.length; i++) {
			
			sum += array[i];
		}
		return sum;

	}
	
	//AvgArray
	public static double AvgArray(double[] array) {

		double Avg, i,sum;
		
		sum = (double)(SumArray(array));
		
		i = (double)(array.length);
		
		Avg = i>0? sum/i: 0;
		
		
		return Avg;

	}
	
	//max number into array
	
	public static int MaxNumArray(double[] array) {

		int MaxNum, i;
		
		for (i = 0, MaxNum = 0; i < array.length; i++) {
			
			if( array[i] > MaxNum)
				MaxNum =(int)( array[i]);
		}

		return MaxNum;

	}
	
	//place of max number into array
	
	public static int PlaceMaxNumIntoArray(double[] array) {

		int MaxNum, i , placeHolder;
		
		
		
		for (i = 0, MaxNum = (int)(MaxNumArray(array)),placeHolder = 0; i < array.length; i++) 
			if(MaxNum!=array[i])
				placeHolder++;
			else
				break;

		return placeHolder;
		
	}
	
	
	
//	public static int PlaceMaxNumIntoArray(double[] array) {
//
//		int ind = MaxNumArray(array);
//
//		return array[ind];
//		
//	}
	
	//min number into array
	
	public static int MinNumArray(double[] array) {

		int MinNum, i;
		
		for (i = 0, MinNum = 0; i < array.length; i++) {
			
			if( array[i] < MinNum)
				MinNum =(int)( array[i]);
		}

		return MinNum;

	}
	
	
	
	//place of min number into array
	
	//hard one
	public static int PlaceMinNumIntoArray(double[] array) {

		int MinNum, i , placeHolder;
		
		
		
		for (i = 0, MinNum = (int)(MinNumArray(array)),placeHolder = 0; i < array.length; i++) 
			if(MinNum!=array[i])
				placeHolder++;
			else
				break;

		return placeHolder;
		
	}
	
	//eazy, think better next time
	
//	public static int PlaceMinNumIntoArray(double[] array) {
//
//		int ind = MinNumArray(array);
//
//		return array[ind];
//		
//	}
	
	
	//how much times this number repeats in array
	public static int HowMuchTimesRepeatsANumberArray(double [] array, int num){
		
		int result=0,i,j;

			for(j = 0; j<array.length; j++){
				if(array[j]==num)    // if mmember of array is equal to number that we want to check make counter ++
					
				result++;
			}
		
			//evgenia
			
//			for(j = 0, result = 0; j<array.length; j++){
//				result+=(array[j]==num)?1:0;
//				
//			}
	
		return result;
	}
	
	
	
	
	//how much times this number repeats in array
	public static int HowMuchTimesRepeatsANumberArray(double [] array){
		
	int result=0,i,j;
	
		//i want to use array length within limit of 0 t0 max number into this array
	//so if into original array i have number 3345 and this number is repeated more times than others
	// i will get this number into result
		double count[] = new double[MaxNumArray(array)+1]; 
		
		
		//fill count array with numbers of repeats 
		for(i = 0; i < array.length; i++) {
			count[(int)(array[i])]++;
		}
		
		//find the number that repeated of most times 
		// if you have nubmer 5 repeated a three times into your array and this number 
		//have more repeats than other numbers in this array you will get it
		result = PlaceMaxNumIntoArray(count);
		
		return result;
	}
}
