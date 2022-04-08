package javaPractice;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		long num1 = scan.nextInt();
		scan.close();
		if (num1 == 0 || num1 % 2 == 0) {
			System.out.println("This is an Even Number");
		} else if (num1 == 1) {
			System.out.println("This is an Odd Number");
		} else {
			System.out.println("This is an Odd Number");
		}
	}

}
