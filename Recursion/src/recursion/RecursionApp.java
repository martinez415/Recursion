package recursion;
import java.util.Scanner;

public class RecursionApp {
	
	public static int factorial(int num) {
		if(num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);			
		}		
	}
	
	public static int fibonacci(int num) {
		if (num <= 1) {
			return num;
		} else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = 0;
		
		System.out.print("Hello, please enter a positive integer: ");
		number = input.nextInt();
		
		System.out.println("The factorial of " + number + " is: " + factorial(number));
		System.out.print("The fibonacci sequence of " + number + " is: ");
		for(int x = 0; x < number; x++) {
			System.out.print(fibonacci(x) + "\t ");
		}
		
		input.close();		
	}
}
