package logicalPrograms;

public class FibonacciSeries {

	public void demo() {
		
		int a = 0;
		int b = 1;
		int c;
		
		System.out.println("The First 10 numbers of Fibonacci series are :");
		
		for (int i=1; i<=10; i++) {
			
			c = a+b;
			System.out.println(c);
			
			a=b;
			b=c;
		}
	}
	
	public static void main(String[]args) {
		FibonacciSeries orv = new FibonacciSeries();
		orv.demo();
	}
}
