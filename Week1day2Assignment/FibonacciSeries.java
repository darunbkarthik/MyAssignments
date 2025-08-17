package Week1day2Assignment;

import java.util.Scanner;

public class FibonacciSeries {

    public void printFibonacciSeries(int n) {
        int a = 0, b = 1, c;

        System.out.print("Fibonacci Series: " + a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = scanner.nextInt();

        FibonacciSeries series = new FibonacciSeries();
        series.printFibonacciSeries(n);
        
        scanner.close();
    }
	
//	public static void main(String[] args) {
//		int a=0,b=1,c;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the range: ");
//		int n = scanner.nextInt();
//		
//		System.out.print("Fibonacci Series: "+a+" "+b+" ");
//		for(int i=2;i<n;i++) {
//			c=a+b;
//			System.out.print(c+" ");
//			a=b;
//			b=c;
//		}
//	}
}
