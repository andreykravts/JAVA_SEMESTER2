package ex4;

public class testDebug {

	public static int kuku(int a) {
		a=a*3;
		return a;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 7;
		int a, b, c=0;
		
		a= num +10;   //brake
		b = a/2;
		
		//function
		c = kuku(b);
		
		if(b>a) {
			b++;
		}else {
			a++;
		}
		
		System.out.println("num=" + num);
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
