package ABC;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = scan.nextInt();

		scan.close();

		if (age < 18) {
			System.out.println("you are not a voter");
		} else if (age >= 18 && age <= 50) {
			System.out.println("you are a voter");

		} else if (age > 50 && age <= 80) {
			System.out.println("senior voter");
			if (age > 70 && age <= 80) {
				System.out.println("give them a candy");
			}
		} else {
			System.out.println("not a voter");
		}
	}

}
