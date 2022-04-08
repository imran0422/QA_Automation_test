package javaPractice;

import java.util.Scanner;

public class Add2Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1 = scan.nextInt();
		System.out.println("Enter Second Number:");
		int num2 = scan.nextInt();
		scan.close();
		int sum = num1 + num2;
		System.out.println("Sum is:" + sum);

	}

}
